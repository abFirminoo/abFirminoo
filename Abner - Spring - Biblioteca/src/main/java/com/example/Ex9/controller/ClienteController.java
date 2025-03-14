package com.example.Ex9.controller;

import com.example.Ex9.banco.ClienteBd;
import com.example.Ex9.model.ClienteMod;

import java.util.List;

public class ClienteController {

    ClienteBd repository = new ClienteBd();

    public List<ClienteMod> getAll(){
        return repository.findAll();
    }

    public List<ClienteMod> getByClienteMods(String emailCliente){
        return repository.findByEmailCLiente(emailCliente);
    }

//    public List<ClienteMod> getBy(String ){
//        return repository.findBy();
//    }

    public ClienteMod getById(int id){
        return repository.getById(id);
    }


    public boolean insertBanco(ClienteMod funcionario){
        return repository.insert(funcionario);
    }

    public ClienteMod update(int id, ClienteMod clienteMod){
        boolean result = repository.update(id, clienteMod);

        if(result){
            return clienteMod;
        }
        return null;
    }

    public boolean delete(int id){
        return repository.delete(id);
    }
}
