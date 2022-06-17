//PACOTE
package br.com.desafio.pokemon.modelo;

public class Tipo {

//ATRIBUTOS

	private int idTipo;
	private String tituloTipo;

//CONSTRUTOR

	public Tipo(int idTipo) {
		if (idTipo == 1) {
			this.tituloTipo = "Agua";
		} else if (idTipo == 2) {
			this.tituloTipo = "Fogo";
		} else if (idTipo == 3) {
			tituloTipo = "Terra";
		} else if (idTipo == 4) {
			tituloTipo = "Ar";
		}
	}

//GET

	public int getIdTipo() {
		return idTipo;
	}

	public String getTipo() {

		return tituloTipo;
	}

//SET
	
	public void setIdtipo(int idTipo) {
		this.idTipo = idTipo;
	}
}
