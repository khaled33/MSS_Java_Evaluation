package com.evaluation.mms.services.interfaces;

import com.evaluation.mms.models.Commande;

import java.util.List;

public interface CommandeServiceI {
    public Commande getCommandeById(Long id);

    public List<Commande> getAllCommande();

    public Commande AddCommande(Commande commande);

    public   Commande  UpdateCommande(Long id, Commande commande);

    public void DeleteCommande(Long id);
}
