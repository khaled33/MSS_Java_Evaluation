package com.evaluation.mms.services;

import com.evaluation.mms.models.Produit;
import com.evaluation.mms.repositries.ProduitRepository;
import com.evaluation.mms.services.interfaces.ProduitServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class ProduitServiceImpl implements ProduitServiceI {
    private ProduitRepository produitRepository;


    //Récupérer un Produit à partir de l'ID
    @Override
    public Produit getProduitById(Long id) {
        return produitRepository.getById(id);
    }


    //Récupérer la liste des Produits à partir de la Categorie Id
    @Override
    public List<Produit> findByCategorieId(Long Categorieid) {
        return produitRepository.findByCategorieId(Categorieid);
    }


     //Récupérer la liste des Produits similaires
    @Override
    public List<Produit> listProduitssimilaires(Long Categorieid) {
        return produitRepository.listProduitssimilaires(Categorieid);
    }


    // Récupérer la liste des Produits
    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

    //ajouter un Produit
    @Override
    public Produit AddProduit(Produit produit) {
        return produitRepository.save(produit);
    }


    // Modifier un Produit
    @Override
    public  Produit  UpdateProduit(Long id, Produit produit) {
        produit.setId(id);
        return produitRepository.save(produit);
    }

     // Supprimer un Produit par Id
    @Override
    public void DeleteProduit(Long id) {
        produitRepository.deleteById(id);
    }
}
