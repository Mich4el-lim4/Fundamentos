package br.com.michael.mybank.entities;

public class Titular {

	private String nome;
	private String cpf;
	private String telefone;
	private String profession;
	
	public Titular(String nome, String cpf, String telefone, String profession) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.profession = profession;
	}
	
	public Titular(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public Titular(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
