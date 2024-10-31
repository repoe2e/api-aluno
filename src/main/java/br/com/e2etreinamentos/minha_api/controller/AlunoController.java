package br.com.e2etreinamentos.minha_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.e2etreinamentos.minha_api.model.Aluno;
import br.com.e2etreinamentos.minha_api.service.AlunoService;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;

	// Cadastrar aluno
	@PostMapping
	public ResponseEntity<String> cadastrarAluno(@RequestBody Aluno aluno) {
		alunoService.cadastrar(aluno);
		return new ResponseEntity<>("Aluno cadastrado com sucesso!", HttpStatus.CREATED);
	}

	// Consultar aluno por CPF
    @GetMapping("/{cpf}")
    public ResponseEntity<Aluno> consultarAluno(@PathVariable String cpf) {
        return alunoService.consultarPorCpf(cpf)
                .map(aluno -> new ResponseEntity<>(aluno, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
