package com.evaluation.mms.services;

import com.evaluation.mms.models.LigneCommande;
import com.evaluation.mms.repositries.LigneCommandeRepository;
import com.evaluation.mms.services.interfaces.LigneCommandeServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class LigneCommandeServiceImpl implements LigneCommandeServiceI {
    private LigneCommandeRepository ligneCommandeRepository;


    //Récupérer la Ligne Commande à partir de l'ID
     @Override
    public LigneCommande getLigneCommandeById(Long id) {
        return ligneCommandeRepository.getById(id);
    }


     // ajouter une Ligne Commande
    @Override
    public LigneCommande AddLigneCommande(LigneCommande ligneCommande) {
        return ligneCommandeRepository.save(ligneCommande);
    }


    // Modifier une Ligne Commande
    @Override
    public  LigneCommande UpdateLigneCommande(Long id, LigneCommande ligneCommande) {
        ligneCommande.setId(id);
        return ligneCommande;
    }

    // Supprimer une Ligne Commande par Id
    @Override
    public void DeleteLigneCommande(Long id) {
        ligneCommandeRepository.deleteById(id);
    }
}
