package com.evaluation.mms.services.interfaces;

import com.evaluation.mms.models.Client;

import java.util.List;

public interface ClientServiceI {
    public Client getClientById(Long id);

    public List<Client> getAllClient();

    public Client AddClient(Client client);

    public   Client  UpdateClient(Long id, Client client);

    public void DeleteClient(Long id);
}
