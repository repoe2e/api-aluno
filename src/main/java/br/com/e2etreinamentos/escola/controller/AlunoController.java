package br.com.e2etreinamentos.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.e2etreinamentos.escola.model.Aluno;
import br.com.e2etreinamentos.escola.service.AlunoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/alunos")
@Tag(name = "Aluno", description = "Endpoints de gerenciamento de alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    // Cadastrar aluno
    @Operation(summary = "Cadastrar novo aluno")
    @PostMapping
    public ResponseEntity<String> cadastrarAluno(@RequestBody Aluno aluno) {
        alunoService.cadastrar(aluno);
        return new ResponseEntity<>("Aluno cadastrado com sucesso!", HttpStatus.CREATED);
    }

    // Consultar aluno por CPF
    @Operation(summary = "Consultar aluno por CPF")
    @GetMapping("/{cpf}")
    public ResponseEntity<Aluno> consultarAluno(@PathVariable String cpf) {
        return alunoService.consultarPorCpf(cpf)
                .map(aluno -> new ResponseEntity<>(aluno, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Atualizar dados do aluno
    @Operation(summary = "Atualizar dados do aluno")
    @PutMapping("/{cpf}")
    public ResponseEntity<String> atualizarAluno(@PathVariable String cpf, @RequestBody Aluno alunoAtualizado) {
        alunoService.atualizar(cpf, alunoAtualizado);
        return new ResponseEntity<>("Dados do aluno atualizados com sucesso!", HttpStatus.OK);
    }

    // Excluir aluno
    @Operation(summary = "Excluir aluno")
    @DeleteMapping("/{cpf}")
    public ResponseEntity<String> excluirAluno(@PathVariable String cpf) {
        alunoService.excluir(cpf);
        return new ResponseEntity<>("Aluno excluído com sucesso!", HttpStatus.OK);
    }

    // Listar todos os alunos
    @Operation(summary = "Listar todos os alunos")
    @GetMapping
    public ResponseEntity<List<Aluno>> listarAlunos() {
        List<Aluno> alunos = alunoService.listarTodos();
        return new ResponseEntity<>(alunos, HttpStatus.OK);
    }
}
