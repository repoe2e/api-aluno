package br.com.e2etreinamentos.escola.model;

public class Aluno {
	
	    private String nome;
	    private String sobrenome;
	    private String email;
	    private String turma;
	    private String cpf;

	    // Construtor padrão
	    public Aluno() {}

	    // Construtor com parâmetros
	    public Aluno(String nome, String sobrenome, String email, String turma, String cpf) {
	        this.nome = nome;
	        this.sobrenome = sobrenome;
	        this.email = email;
	        this.turma = turma;
	        this.cpf = cpf;
	    }

	    // Getters e Setters
	    public String getNome() { return nome; }
	    public void setNome(String nome) { this.nome = nome; }

	    public String getSobrenome() { return sobrenome; }
	    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }

	    public String getTurma() { return turma; }
	    public void setTurma(String turma) { this.turma = turma; }

	    public String getCpf() { return cpf; }
	    public void setCpf(String cpf) { this.cpf = cpf; }
	}


