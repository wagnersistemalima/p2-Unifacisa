package entities;

import java.util.Random;

public class MortalKombate {

	// atributos basicos

	private Random sorteio = new Random();

	private Lutador personagem1;
	private Lutador personagem2;

	private Lutador vencedor;

	// construtor

	public MortalKombate(Lutador personagem1, Lutador personagem2) {
		this.personagem1 = personagem1;
		this.personagem2 = personagem2;
	}

	// getters & setters

	public Lutador getPersonagem1() {
		return personagem1;
	}

	public void setPersonagem1(Lutador personagem1) {
		this.personagem1 = personagem1;
	}

	public Lutador getPersonagem2() {
		return personagem2;
	}

	public void setPersonagem2(Lutador personagem2) {
		this.personagem2 = personagem2;
	}

	public Lutador getVencedor() {
		return vencedor;
	}

	public void setVencedor(Lutador vencedor) {
		this.vencedor = vencedor;
	}

	// metodo começar a luta definindo quem ataca e defende chamando metodos auxiliares

	public void fight() {
		while (personagem1.getVida() > 0 && personagem2.getVida() > 0) {
			Lutador atacante = randomAtackEndDefendPersonagens(personagem1, personagem2);
			Lutador defensor = null;
			if (personagem1 == atacante) {
				defensor = personagem2;
			} else {
				defensor = personagem1;
			}
			golpear(atacante, defensor);
		}
		if (personagem1.getVida() > 0) {
			vencedor = personagem1;
		} else {
			vencedor = personagem2;
		}
	}

	// metodo auxiliar para sortear personagens para definir atacante e defensor

	private Lutador randomAtackEndDefendPersonagens(Lutador personagem1, Lutador personagem2) {
		double numeroEscolhido = sorteio.nextDouble();
		if (numeroEscolhido <= 0.5) {
			return personagem1;
		} else {
			return personagem2;
		}
	}

	// metodo golpear

	public void golpear(Lutador atacante, Lutador defensor) {
		double numeroEscolhido = sorteio.nextDouble();
		if (numeroEscolhido <= 0.25) {
			atacante.socar(defensor);
		} else if (numeroEscolhido <= 0.5) {
			atacante.chutar(defensor);
		} else if (numeroEscolhido <= 0.75) {
			atacante.atirar(defensor);
		} else if (numeroEscolhido <= 1.0) {
			atacante.magia(defensor);
		}

	}

}
