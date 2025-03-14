package com.example.Ex9.banco;

import java.util.ArrayList;
import java.util.List;
import com.example.Ex9.model.EmprestimoMod;
import java.util.ArrayList;
import java.util.List;
public class EmprestimoBd {
        private List<EmprestimoMod> emprestimos;

        public EmprestimoBd(){
            this.emprestimos = new ArrayList<>();
        }

        // busca todos os emprestimo
        public List<EmprestimoMod> findAll(){
            return new ArrayList<>(emprestimos);
        }

        // busca um emprestimo
        public EmprestimoMod getByIdEmprestimoMod(int idEmprestimo){
            return emprestimos.stream()
                    .filter(d -> d.getIdEmprestimo() == idEmprestimo)
                    .findFirst()
                    .orElse(null);
        }

        // insere o emprestimo
        public boolean insert(EmprestimoMod emprestimoModo){
            emprestimos.add(emprestimoModo);
            return true;
        }

        // atualiza o emprestimo com base no id
        public boolean update(int idEmprestimo, EmprestimoMod emprestimoMod){
            EmprestimoMod emprestimoBd = emprestimos.stream()
                    .filter(f -> f.getIdEmprestimo() == idEmprestimo)
                    .findFirst()
                    .orElse(null);

            if (emprestimoBd == null){
                return false;
            }

            emprestimoBd.setLivroEmprestado(emprestimos.get());

            return true;
        }

}
