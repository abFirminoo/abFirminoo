package com.example.Ex9.view;

import com.example.Ex9.controller.ClienteController;
import com.example.Ex9.model.ClienteMod;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cliente")
public class ClienteView {
 ClienteController clienteController = new ClienteController();

//    @GetMapping
//    public List<ClienteMod> getClientes(
//            @RequestParam(required = false) String emprestimo,
//            @RequestParam(required = false) String )
//    {
//        if (departamento != null) {
//            return clienController.getByDepartamento(departamento);
//        }
//        else if (curso != null) {
//            return funcionarioController.getByCurso(curso);
//        }
//        else {
//            return funcionarioController.getAll();
//        }
//
//    }

    @GetMapping("/{id}")
    public ClienteMod getById(@PathVariable int id){
        return clienteController.getById(id);
    }

    @PostMapping
    public boolean insert(@RequestBody ClienteMod cliente){
        return clienteController.insertBanco(cliente);
    }

    @PutMapping("/{id}")
    public ClienteMod update(@RequestBody ClienteMod cliente, @PathVariable int id){
        return clienteController.update(id, cliente);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id){
        return clienteController.delete(id);
    }
}
