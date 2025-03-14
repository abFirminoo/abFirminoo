package com.example.Ex9.view;

import com.example.Ex9.controller.EmprestimoController;
import com.example.Ex9.model.EmprestimoMod;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmprestimoView {
    EmprestimoController emprestimoController = new EmprestimoController();

    @GetMapping
    public List<EmprestimoMod> getAll() {
        return emprestimoController.getAll();
    }

    @GetMapping("/{id}")
    public EmprestimoMod getById(@PathVariable int id) {
        return emprestimoController.getById(id);
    }

    @PostMapping
    public boolean insert(@RequestBody EmprestimoMod emprestimoMod) {
        return emprestimoController.insertBanco(emprestimoMod);
    }

    @PutMapping("/{id}")
    public EmprestimoMod update(@RequestBody EmprestimoMod emprestimoMod, @PathVariable int id) {
        return emprestimoController.update(id, emprestimoMod);
    }
}
