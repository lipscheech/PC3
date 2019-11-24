package br.com.prog3.aula12_1.enums;

public enum Modalidade {
	A_DISTANCIA("A distância"), PRESENCIAL("Presencial"), SEMI_PRESENCIAL("Semipresencial");

	private String descricao;

	Modalidade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
