package com.evaluation.mms.controllers;

import com.evaluation.mms.models.Commande;
import com.evaluation.mms.services.ClientServiceImpl;
import com.evaluation.mms.services.CommandeServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;

@RestController
@AllArgsConstructor
@Tag(name = "Commandes", description = "the Commandes API")

public class CommandeRestController {
    private CommandeServiceImpl commandeService;
    private ClientServiceImpl clientService;

    @Operation(summary = "Find Commandes By Id Client ", description = "", tags = { "Commandes" })
    @GetMapping("/commandes/{idClient}")
    public ResponseEntity<List<Commande>> getCommandeByIdClient( @PathVariable("idClient") Long id) {
        List<Commande>  result = clientService.getClientById(id).getCommande();
        return new ResponseEntity<>(result, HttpStatus.OK);

    }
    @Operation(summary = "Find All Commandes  ", description = "", tags = { "Commandes" })
    @GetMapping("/commandes")
    public ResponseEntity<List<Commande>> getAllCommande() {
        List<Commande> result=commandeService.getAllCommande();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Operation(summary = "Add  Commandes  ", description = "", tags = { "Commandes" })
    @PostMapping("/commandes")
    public ResponseEntity<Commande> AddCommande(  @RequestBody Commande commande) {
        Commande result = commandeService.AddCommande(commande);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @Operation(summary = "Update Commandes by Id  ", description = "", tags = { "Commandes" })
    @PutMapping("/commandes/{commandeId}")
    public ResponseEntity<Commande> UpdateCommande(@PathVariable("commandeId") Long id,  @RequestBody Commande commande) {
        Commande result = commandeService.UpdateCommande(id, commande);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @Operation(summary = "Delete Commandes by Id  ", description = "", tags = { "Commandes" })
    @DeleteMapping("/commandes/{commandeId}")
    public ResponseEntity<Void> DeleteCommande(@PathVariable("commandeId") Long id) {
        commandeService.DeleteCommande(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
