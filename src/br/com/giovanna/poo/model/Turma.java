package br.com.giovanna.poo.model;

import java.util.List;
import java.util.ArrayList;

public class Turma {
    public String nomeTurma;
    public Professor professor;
    public List<Aluno> alunos;

    public Turma(String nomeTurma, Professor professor){
        this.nomeTurma = nomeTurma;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

}
