package com.evaluation.mms.controllers;

import com.evaluation.mms.models.Commande;
import com.evaluation.mms.models.Produit;
import com.evaluation.mms.services.ClientServiceImpl;
import com.evaluation.mms.services.CommandeServiceImpl;
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
@Tag(name = "produits", description = "the Produits API")

public class ProduitRestController {
    private ProduitServiceImpl produitService;

    @Operation(summary = "Find All produits by CategorieId ", description = "", tags = { "produits" })
    @GetMapping("/produits/{CategorieId}")
    public ResponseEntity<List<Produit>> findByCategorieId(@PathVariable("CategorieId") Long id) {
        List<Produit> result = produitService.findByCategorieId(id);
        return new ResponseEntity<>(result, HttpStatus.OK);

    }

    @Operation(summary = "Find Produits Similaires ", description = "", tags = { "produits" })
    @GetMapping("/produits_similaires/{CategorieId}")
    public ResponseEntity<List<Produit>> listProduitsSimilaires(@PathVariable("CategorieId") Long id) {
        List<Produit> result = produitService.listProduitssimilaires(id);
        return new ResponseEntity<>(result, HttpStatus.OK);

    }


}
