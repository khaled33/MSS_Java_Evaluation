package com.evaluation.mms.controllers;

import com.evaluation.mms.models.LigneCommande;
import com.evaluation.mms.models.Produit;
import com.evaluation.mms.services.LigneCommandeServiceImpl;
import com.evaluation.mms.services.ProduitServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Tag(name = "Ligne Commande", description = "the Ligne Commande API")
public class LigneCommandeRestController {
    private LigneCommandeServiceImpl ligneCommandeService;


    @Operation(summary = "Update Ligne Commande By LigneCommandeId ", description = "", tags = { "Ligne Commande" })
    @GetMapping("/LigneCommande/{LigneCommandeId}")
    public ResponseEntity<LigneCommande> findByCategorieId(@PathVariable("LigneCommandeId") Long id, @RequestBody LigneCommande ligneCommande) {
        LigneCommande res = ligneCommandeService.getLigneCommandeById(id);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }


    @Operation(summary = "Add Ligne Commande By Commande id", description = "", tags = { "Ligne Commande" })
    @PostMapping ("/LigneCommande/{CommandeId}")
    public ResponseEntity<LigneCommande> AddLigneCommande(@PathVariable("CommandeId") Long id, @RequestBody LigneCommande ligneCommande) {
        LigneCommande res = ligneCommandeService.AddLigneCommande(ligneCommande);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }
    @Operation(summary = "Delete Ligne Commande By LigneCommandeId ", description = "", tags = { "Ligne Commande" })
    @DeleteMapping("/LigneCommande/{LigneCommandeId}")
    public ResponseEntity<Void> findByCategorieId(@PathVariable("LigneCommandeId") Long id) {
        ligneCommandeService.DeleteLigneCommande(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


}
