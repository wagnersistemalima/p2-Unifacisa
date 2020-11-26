package interfaces;

import java.util.List;

import entities.Aniversariante;
import entities.exceptions.AniversarianteNaoEncontradoException;

public interface AgendaDeAniversarios {
	
	public void  adicionarAniverssariante(String nome, int dia, int mes);
	
	public List<Aniversariante> obterAniversariantesDoMes(int mes);
	
	public void removerAniversariante(String nomeAniversariante) throws AniversarianteNaoEncontradoException;

}
