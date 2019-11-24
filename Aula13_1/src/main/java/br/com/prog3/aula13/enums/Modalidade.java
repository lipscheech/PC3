package br.com.prog3.aula13.enums;

public enum Modalidade {
	
	A_DISTANCIA("A distancia"), PRESENCIAL("Presencial"), SEMI_PRESENCIAL("Semi presencial");
	
	private String descricao;
	
	Modalidade(String descricao){
		
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		
		return descricao;
	}

}
