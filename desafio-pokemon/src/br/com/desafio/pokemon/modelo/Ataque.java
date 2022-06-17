// PACOTE
package br.com.desafio.pokemon.modelo;

public class Ataque {

// ATRIBUTO

	private int ataqueBase;

// GET

	public int getValorAtaque1() {
		return this.ataqueBase;
	}

	public int getValorAtaque2() {
		return this.ataqueBase + 5;
	}

	public int getValorAtaque3() {
		return this.ataqueBase * 2;
	}

	public int getValorAtaque4() {
		return this.ataqueBase + 3;
	}

// SET

	public void setValorAtaqueBase(int valorAtaqueBase) {
		this.ataqueBase = valorAtaqueBase;
	}
}

