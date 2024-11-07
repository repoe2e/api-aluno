package br.com.e2etreinamentos.minha_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.e2etreinamentos.minha_api.model.Aluno;
import br.com.e2etreinamentos.minha_api.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> listarTodos() {
		return alunoRepository.findAll();
	}

	public Optional<Aluno> consultarPorCpf(String cpf) {
		return alunoRepository.findCpf(cpf);
	}

	public void cadastrar(Aluno aluno) {
		alunoRepository.save(aluno);
	}

	public void excluir(String cpf) {
		alunoRepository.findCpf(cpf).ifPresent(alunoRepository::delete);
	}

	public void atualizar(String cpf, Aluno alunoAtualizado) {
		alunoRepository.findCpf(cpf).ifPresent(aluno ->{
			aluno.setNome(alunoAtualizado.getNome());
			aluno.setSobrenome(alunoAtualizado.getSobrenome());
			aluno.setEmail(alunoAtualizado.getEmail());
			aluno.setTurma(alunoAtualizado.getTurma());
		});
	}
}
