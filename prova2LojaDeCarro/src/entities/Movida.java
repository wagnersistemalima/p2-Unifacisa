package entities;

import entities.exceptions.CarroAlugadoException;

public class Movida extends Locadora{
	
	// metodo alugar carro
	
	@Override
	public double alugarCarro(Carro carro, Data inicio, Data fim) throws CarroAlugadoException {
		
		for (Carro veiculo: super.getCarros()) {
			if (veiculo.getModelo().equals(carro.getModelo()) && veiculo.getMarca().equals(carro.getMarca()) && veiculo.getAno() == carro.getAno()) {
				if (veiculo.isAlugado()) {
					throw new CarroAlugadoException(carro);
				}
				else {
					veiculo.setAlugado(true);
				}
			}
		}
		
		int dias = Locadora.getQuantidadeDeDias(inicio, fim);
		double custo = dias * carro.getDiaria();
		double seguro = custo * 0.10;
		return custo + seguro;
	}
	

}
