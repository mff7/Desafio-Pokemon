//PACOTE
package br.com.desafio.pokemon.modelo;

public class Pokemon {

//ATRIBUTOS

	private int vida;
	private String nome;
	private Tipo tipo;
	private Ataque ataque;
	private Defesa defesa;

// CONSTRUTOR

	public Pokemon(String nome, int vida, int defesaBase, int ataqueBase, int idTipo) {
		this.nome = nome;
		this.vida = vida;

		Ataque ataquePokemon = new Ataque();
		ataquePokemon.setValorAtaqueBase(ataqueBase);
		this.ataque = ataquePokemon;

		Tipo tipoPokemon = new Tipo(idTipo);
		tipoPokemon.setIdtipo(idTipo);
		this.tipo = tipoPokemon;

		Defesa defesaPokemon = new Defesa();
		defesaPokemon.setValorDefesaBase(defesaBase);
		this.defesa = defesaPokemon;

	}

// GET

	public String getNome() {
		return nome;
	}

	public int getVida() {
		return vida;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Ataque getAtaque() {
		return ataque;
	}

	public Defesa getDefesa() {
		return defesa;
	}

// MOSTRA DADOS DO POKEMON	

	public void dadosDoPokemon() {
		System.out.println("NOME: " + this.nome);
		System.out.println("TITULO: " + this.tipo.getTipo());
		System.out.println("ID DO TIPO: " + this.tipo.getIdTipo());
		System.out.println("ATAQUE: " + this.ataque.getValorAtaque1());
		System.out.println("DEFESA: " + this.defesa.getValorDefesa1());
		System.out.println("VIDA: " + this.vida);
		System.out.println("---------------------------------");

	}

// ATAQUES

	public void ataque1(Ataque ataque, Pokemon destino) {

		destino.vida -= ataque.getValorAtaque1();

		System.out.println("**********************");
		System.out.println(this.nome + " atacou " + destino.nome);
		System.out.println("Valor do ataque: " + ataque.getValorAtaque1());
		System.out.println("**********************");

	}

	public void ataque2(Ataque ataque, Pokemon destino) {

		destino.vida -= ataque.getValorAtaque2();

		System.out.println("**********************");
		System.out.println(this.nome + " atacou " + destino.nome);
		System.out.println("Valor do ataque: " + ataque.getValorAtaque2());
		System.out.println("**********************");

	}

	public void ataque3(Ataque ataque, Pokemon destino) {

		destino.vida -= ataque.getValorAtaque3();

		System.out.println("**********************");
		System.out.println(this.nome + " atacou " + destino.nome);
		System.out.println("Valor do ataque: " + ataque.getValorAtaque3());
		System.out.println("**********************");

	}

	public void ataque4(Ataque ataque, Pokemon destino) {

		destino.vida -= ataque.getValorAtaque4();

		System.out.println("**********************");
		System.out.println(this.nome + " atacou " + destino.nome);
		System.out.println("Valor do ataque: " + ataque.getValorAtaque4());
		System.out.println("**********************");

	}

// DEFESAS

	public void defesa1(Defesa defesa) {

		if (this.vida < this.vida + defesa.getValorDefesa1()) {
			this.vida += defesa.getValorDefesa1();
		}
		System.out.println("**********************");
		System.out.println(this.nome + " defendeu ");
		System.out.println("Valor da defesa: " + defesa.getValorDefesa1());
		System.out.println("**********************");

	}

	public void defesa2(Defesa defesa) {

		this.vida += defesa.getValorDefesa2();

		System.out.println("**********************");
		System.out.println(this.nome + " defendeu ");
		System.out.println("Valor da defesa: " + defesa.getValorDefesa2());
		System.out.println("**********************");

	}

	public void defesa3(Defesa defesa) {

		this.vida += defesa.getValorDefesa3();

		System.out.println("**********************");
		System.out.println(this.nome + " defendeu ");
		System.out.println("Valor da defesa: " + defesa.getValorDefesa3());
		System.out.println("**********************");

	}

	public void defesa4(Defesa defesa) {

		this.vida += defesa.getValorDefesa4();

		System.out.println("**********************");
		System.out.println(this.nome + " defendeu ");
		System.out.println("Valor da defesa: " + defesa.getValorDefesa4());
		System.out.println("**********************");

	}
}

