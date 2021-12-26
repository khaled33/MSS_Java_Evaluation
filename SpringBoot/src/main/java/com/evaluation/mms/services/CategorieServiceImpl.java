package com.evaluation.mms.services;

import com.evaluation.mms.models.Categorie;
import com.evaluation.mms.repositries.CategorieRepository;
import com.evaluation.mms.services.interfaces.CategorieServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategorieServiceImpl implements CategorieServiceI {
   private CategorieRepository categorieRepository;

    // Obtenir le nom des catégories à partir de l'ID catégorie

    @Override
    public Categorie getCategorieById(Long id) {
        return categorieRepository.getById(id);
    }

     // Récupérer la liste de tous les catégories
     @Override
    public List<Categorie> getAllCategorie() {
        return categorieRepository.findAll();
    }



    //Ajouter une catégories
     @Override
    public Categorie AddCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    //Modifier une catégories
    @Override
    public  Categorie UpdateCategorie(Long id, Categorie categorie) {
        categorie.setId(id);
        return categorieRepository.save(categorie);
    }

    // Supprimer  une catégories par Id
    @Override
    public void DeleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }
}
