package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.exceptions.AniversarianteNaoEncontradoException;
import interfaces.AgendaDeAniversarios;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios{
	
	// atributo basico
	
	private List<Aniversariante> aniversariantes;
	
	// construtor
	
	public MinhaAgendaDeAniversarios() {
		this.aniversariantes = new ArrayList<Aniversariante>();
	}
	
	// Getters

	public List<Aniversariante> getAniversariantes() {
		return aniversariantes;
	}
	
	// metodo adicionar aniversariante
	
	@Override
	public void adicionarAniverssariante(String nome, int dia, int mes) {
		
		Aniversariante aniversariante = new Aniversariante(nome, dia, mes);
		this.aniversariantes.add(aniversariante);
		
	}
	
	// metodo obter aniversariante do mes
	
	public List<Aniversariante> obterAniversariantesDoMes(int mes) {
		List<Aniversariante> listaAuxiliar = new ArrayList<Aniversariante>();
		for (Aniversariante aniversariante: this.aniversariantes) {
			if (aniversariante.getDataAniversario().getMes() == mes) {
				listaAuxiliar.add(aniversariante);
			}
		}
		return listaAuxiliar;
	}
	
	// metodo remover aniversariante
	
	public void removerAniversariante(String nome) throws AniversarianteNaoEncontradoException {
		Iterator<Aniversariante> iterator = this.aniversariantes.iterator();
		boolean status = false;
		while (iterator.hasNext()) {
			Aniversariante aniversariante = iterator.next();
			if (aniversariante.getNome().equals(nome)) {
				iterator.remove();
				status = true;
			}
		}
		if (!status) {
			throw new AniversarianteNaoEncontradoException(nome);
		}
	}

	

}
