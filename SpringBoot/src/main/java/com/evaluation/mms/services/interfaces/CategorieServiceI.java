package com.evaluation.mms.services.interfaces;

import com.evaluation.mms.models.Categorie;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface CategorieServiceI {
    
    public Categorie getCategorieById(Long id);

    public List<Categorie> getAllCategorie();

    public Categorie AddCategorie(Categorie categorie);

    public Categorie UpdateCategorie(Long id, Categorie categorie);

    public void DeleteCategorie(Long id);
}
