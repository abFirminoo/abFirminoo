package com.example.Ex9.controller;

import com.example.Ex9.banco.EmprestimoBd;
import com.example.Ex9.model.EmprestimoMod;

import java.util.List;

public class EmprestimoController {
    EmprestimoBd repository = new EmprestimoBd();

    public List<EmprestimoMod> getAll(){
        return repository.findAll();
    }

    public EmprestimoMod getById(int id){
        return repository.getByIdEmprestimoMod(id);
    }

    public boolean insertBanco(EmprestimoMod emprestimoMod){
        return repository.insert(emprestimoMod);
    }

    public EmprestimoMod update(int id, EmprestimoMod emprestimoMod){
        boolean result = repository.update(id, emprestimoMod);

        if(result){
            return emprestimoMod;
        }
        return null;
    }
}
