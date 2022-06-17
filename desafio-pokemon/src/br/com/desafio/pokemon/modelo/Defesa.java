//PACOTE
package br.com.desafio.pokemon.modelo;

public class Defesa {

// ATRIBUTO

	private int defesaBase;

// GET

	public int getValorDefesa1() {
		return defesaBase;
	}

	public int getValorDefesa2() {
		return defesaBase * 2;
	}

	public int getValorDefesa3() {
		return defesaBase + 7;

	}

	public int getValorDefesa4() {
		return defesaBase + 15;

	}

// SET
	public void setValorDefesaBase(int valorDefesa) {
		this.defesaBase = valorDefesa;
	}
}
