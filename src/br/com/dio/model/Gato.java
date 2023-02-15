package br.com.dio.model;

import java.util.Objects;

public class Gato {

	private String nome;
	private String cor;
	private Integer idade;

	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	/*
	 * Atalhos ctrl + espaço = dá dica do que pode ser escrito a partir das letras já colocadas
	 * ctrl + d - Apaga a linha ctrl
	 * + 3 - atalho para comandos e geradores
	 * alt + seta - Após selecionar um bloco pressione esse comendo para mover o bloco inteiro para cima ou para baixo
	 * ctrl + shift + 8 = faz a importação de pacotes
	 */

	/*
	 * public Gato(String nome, String cor, Integer idade) { this.nome = nome;
	 * this.cor = cor; this.idade = idade; }
	 */

}
