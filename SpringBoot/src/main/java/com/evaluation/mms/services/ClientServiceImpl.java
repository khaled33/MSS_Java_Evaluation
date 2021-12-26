package com.evaluation.mms.services;

import com.evaluation.mms.models.Client;
import com.evaluation.mms.repositries.ClientRepository;
import com.evaluation.mms.services.interfaces.ClientServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class ClientServiceImpl implements ClientServiceI {

    private ClientRepository clientRepository;


    //Récupérer le Cilent à partir de l'ID
    @Override
    public Client getClientById(Long id) {
        return clientRepository.getById(id);
    }


    //Récupérer la liste des Cilents
    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }


    // ajouter un Cilent
    @Override
    public Client AddClient(Client client) {
        return clientRepository.save(client);
    }


    // Modifier un Cilent
    @Override
    public Client  UpdateClient(Long id, Client client) {
        client.setId(id);
        return clientRepository.save(client);
    }

    // Supprimer un Cilent par Id
    @Override
    public void DeleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
