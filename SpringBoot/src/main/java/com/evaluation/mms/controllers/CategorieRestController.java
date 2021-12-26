package com.evaluation.mms.controllers;

import com.evaluation.mms.models.Categorie;
import com.evaluation.mms.models.Produit;
import com.evaluation.mms.services.CategorieServiceImpl;
import com.evaluation.mms.services.ProduitServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Tag(name = "Categories", description = "the Categories API")
public class CategorieRestController {
    private CategorieServiceImpl categorieService;

    @Operation(summary = "Find ALL Categories", description = "", tags = { "Categories" })
    @GetMapping("/categories")
    public ResponseEntity<List<Categorie>> findByCategorieId() {
        List<Categorie> result = categorieService.getAllCategorie();
        return new ResponseEntity<>(result, HttpStatus.OK);

    }

 
}
