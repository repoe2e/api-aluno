package br.com.e2etreinamentos.escola.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.e2etreinamentos.escola.model.Aluno;

@Repository
public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> findAll() {
        return alunos;
    }

    public Optional<Aluno> findByCpf(String cpf) {
        return alunos.stream().filter(aluno -> aluno.getCpf().equals(cpf)).findFirst();
    }

    public void save(Aluno aluno) {
        alunos.add(aluno);
    }

    public void delete(Aluno aluno) {
        alunos.remove(aluno);
    }
}