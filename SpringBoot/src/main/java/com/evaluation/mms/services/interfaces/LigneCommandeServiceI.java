package com.evaluation.mms.services.interfaces;

import com.evaluation.mms.models.LigneCommande;

import java.util.List;

public interface  LigneCommandeServiceI {
    public LigneCommande getLigneCommandeById(Long id);


    public LigneCommande AddLigneCommande(LigneCommande ligneCommande);

    public  LigneCommande  UpdateLigneCommande(Long id, LigneCommande ligneCommande);

    public void DeleteLigneCommande(Long id);
}
