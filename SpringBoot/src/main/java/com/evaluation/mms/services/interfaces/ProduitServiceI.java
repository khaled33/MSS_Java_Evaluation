package com.evaluation.mms.services.interfaces;

import com.evaluation.mms.models. Produit;

import java.util.List;

public interface ProduitServiceI {
    public  Produit getProduitById(Long id);
    public  List< Produit>  findByCategorieId(Long id);

    public  List< Produit>  listProduitssimilaires(Long id);

    public List< Produit> getAllProduit();

    public  Produit AddProduit( Produit produit);

    public   Produit  UpdateProduit(Long id,  Produit produit);

    public void DeleteProduit(Long id);
}
