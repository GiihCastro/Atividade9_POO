package br.com.giovanna.poo.service;

import br.com.giovanna.poo.model.Turma;
import br.com.giovanna.poo.model.Aluno;
import br.com.giovanna.poo.model.Professor;
import java.util.ArrayList;
import java.util.List;

public class cadastrarTurma {
    public List<Turma> turmas = new ArrayList<>();

    public void criarTurma(String nomeTurma, Professor professor){
        Turma novaTurma = new Turma(nomeTurma, professor);
        turmas.add(novaTurma);
    }

    public void addAlunoTurma(String nomeTurma, Aluno aluno){
        for(Turma turma : turmas){
            if(turma.nomeTurma.equals(nomeTurma)){
                turma.adicionarAluno(aluno);
                return;
            }
        }
        System.out.println("Turma não encontrada");
    }

    public void exibirTurmas(){
        for(Turma turma : turmas){
            System.out.println("Turma: " + turma.nomeTurma);
            System.out.println("Professor: " + turma.professor.nome);
            System.out.println("Alunos:");
            for(Aluno aluno : turma.alunos){
                System.out.println(aluno.nome + " idade: " + aluno.idade + " Media final: " + aluno.notaMedia);
            }

        }
    }
}