package br.com.giovanna.poo.aplication;

import br.com.giovanna.poo.model.Aluno;
import br.com.giovanna.poo.model.Professor;
import br.com.giovanna.poo.service.cadastrarTurma;

public class Main {
    public static void main(String[] args){
        cadastrarTurma cadastro = new cadastrarTurma();

        Professor prof1 = new Professor("Rebeca Rivas", "POO", 123);
        cadastro.criarTurma("POO2025.1", prof1);

        Aluno a1 = new Aluno("Giovanna Bandeira", 19, 10.);
        Aluno a2 = new Aluno("Guilherme Tomé", 19, 2.1);
        Aluno a3 = new Aluno("Gustavo Araujo", 19, 6.);
        Aluno a4 = new Aluno("Gabriel Maciel", 19, 9.);

        cadastro.addAlunoTurma("POO2025.1", a1);
        cadastro.addAlunoTurma("POO2025.1", a2);
        cadastro.addAlunoTurma("POO2025.1", a3);
        cadastro.addAlunoTurma("POO2025.1", a4);

        cadastro.exibirTurmas();
    }
}