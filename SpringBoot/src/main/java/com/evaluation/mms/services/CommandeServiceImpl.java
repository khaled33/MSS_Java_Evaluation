package com.evaluation.mms.services;

 import com.evaluation.mms.models.Commande;
 import com.evaluation.mms.models.LigneCommande;
 import com.evaluation.mms.models.Produit;
 import com.evaluation.mms.repositries.CommandeRepository;
import com.evaluation.mms.services.interfaces.CommandeServiceI;
import lombok.AllArgsConstructor;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;

 import java.util.List;

@AllArgsConstructor
@Service

public class CommandeServiceImpl implements CommandeServiceI {
   private  CommandeRepository commandeRepository;
    private ProduitServiceImpl produitService;


    //Récupérer la Commande à partir de l'ID
    @Override
    public Commande getCommandeById(Long id) {

             return commandeRepository.getById(id);
    }

    //Récupérer la liste des Commandes
    @Override
    public List<Commande> getAllCommande() {
        return commandeRepository.findAll();
    }


    //ajouter une Commandes
    @Override
    public Commande AddCommande(Commande commande) {

        // Verifier la disponibilité de la Quantite Commander
        if (verifierQuantite(commande)) {
            // Si la Quantite disponible la méthode modiferQuantiteProduit() mettre a jour le stock
            modiferQuantiteProduit(commande);
            return commandeRepository.save(commande);

        }else return null;
    }


    // Modifier une Commandes
    @Override
    public  Commande  UpdateCommande(Long id, Commande commande) {
        commande.setId(id);
        return commandeRepository.save(commande);
    }

     // Supprimer une Commandes par Id
     @Override
    public void DeleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }


    /*
     * Méthode  vérification de la Quantite disponible de produit dans le stock avec la Quantite commander
     */
    private boolean verifierQuantite(Commande commande){
        for (LigneCommande ligneCommande: commande.getLigneCommande() ) {
            if (ligneCommande.getQte()>ligneCommande.getProduit().getQuantite()){
                return false;
            }
        }
        return true ;
    }
    /*
     * Metre a jour  la Quantite de Produit dans le stock
     */
    @Transactional
     void modiferQuantiteProduit(Commande commande){
        for (LigneCommande ligneCommande: commande.getLigneCommande() ) {
           Produit produit = ligneCommande.getProduit();
           produit.setQuantite(produit.getQuantite() - ligneCommande.getQte());
            produitService.UpdateProduit(produit.getId(),produit);

        }
}
}
