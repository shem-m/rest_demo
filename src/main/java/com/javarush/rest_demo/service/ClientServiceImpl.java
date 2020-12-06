package com.javarush.rest_demo.service;

import com.javarush.rest_demo.model.Client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientServiceImpl implements ClientService {

    private static final Map<Integer, Client> CLIENT_REPOSITORY_MAP = new HashMap();

    @Override
    public void create(Client client) {

    }

    @Override
    public List<Client> readAll() {
        return null;
    }

    @Override
    public Client read(int id) {
        return null;
    }

    @Override
    public boolean update(Client client, int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
