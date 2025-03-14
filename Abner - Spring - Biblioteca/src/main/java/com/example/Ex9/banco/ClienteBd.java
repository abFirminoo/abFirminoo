package com.example.Ex9.banco;

import com.example.Ex9.model.LivroMod;
import com.example.Ex9.model.ClienteMod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteBd {
    private List<ClienteMod> clientes;

    public ClienteBd(){

        this.clientes = new ArrayList<>();

        // Criando os CLientes
//        ClienteMod cliente1 = new ClienteMod(8980,12345678 );
//        ClienteMod cliente2 = new ClienteMod(4567, 35656349);
//        ArrayList<ClienteMod> clienteMods = new ArrayList<>();
//        clientes.add(cliente1);
//        clientes.add(cliente2);

        // Criando os livros
        LivroMod liv1 = new LivroMod(1234, "Banco de Dados","Davi", "Academico");
        LivroMod liv2 = new LivroMod(3456, "Logica de Programação","Leo", "Academico");

        // Criando e adicionando clientes na lista
        clientes.add(new ClienteMod(4567L, 35656349, "Paulo", 1699784011, "paulinho123@gmail.com"));
        clientes.add(new ClienteMod(7568L, 45667837, "Joao", 1699218556, "jotajota@gmail.com"));
        clientes.add(new ClienteMod(8980L, 12345678, "Pedro", 1699234567, "pedroca@gmail.com"));
    }

    // busca todos os clientes
    public List<ClienteMod> findAll(){
        return clientes.stream()
                .sorted((clie1, clie2) -> Double.compare(clie2.getIdCliente(), clie1.getIdCliente()))
                .toList();
    }

    public List<ClienteMod> findByEmailCLiente(String emailCliente){
        return clientes.stream()
                .filter(clienteMod -> clienteMod.getEmailCliente().equals(emailCliente))
                .sorted(Comparator.comparing(ClienteMod::getCpfCliente).reversed())
                .toList();
    }

//    public List<ClienteMod> findBy(String ){
//        return clientes.stream()
//                .filter(clienteMod -> clienteMod.get().getNome().equals())
//                .toList();
//    }

    // busca um funcionário
    public ClienteMod getById(int id){
        return clientes.stream()
                .filter(clienteMod -> clienteMod.getIdCliente() == id)
                .findFirst()
                .orElse(null);
    }

    // insere o cliente
    public boolean insert(ClienteMod clienteMod){
        clientes.add(clienteMod);
        return true;
    }

    // atualiza o cliente com base no id
    public boolean update(int idCliente, ClienteMod clienteMod){
        ClienteMod clienteBd = clientes.stream()
                .filter(f -> f.getIdCliente() == idCliente)
                .findFirst()
                .orElse(null);

        if (clienteBd == null){
            return false;
        }

        clienteBd.setNomeCliente(clienteMod.getNomeCliente());
        clienteBd.setIdCliente(clienteMod.getIdCliente());
        clienteBd.setEmailCliente(clienteMod.getEmailCliente());
        clienteBd.setCpfCliente(clienteMod.getCpfCliente());
        clienteBd.setTelefoneCliente(clienteMod.getTelefoneCliente());

        return true;
    }

    public boolean delete(int idCliente){
        ClienteMod clienteBd = clientes.stream()
                .filter(f -> f.getIdCliente() == idCliente)
                .findFirst()
                .orElse(null);

        clientes.remove(clienteBd);

        return true;
    }
}
