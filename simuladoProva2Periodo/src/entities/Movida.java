package entities;

import entities.exceptions.CarroAlugadoException;

public class Movida extends Locadora{
	
	
	// metodo alugar carro

	@Override
	public double alugarCarro(Carro carro, Data datafim, Data inicio) throws CarroAlugadoException {
		
		for (Carro veiculo: super.getCarros()) {
			if (veiculo.getModelo().equals(carro.getModelo()) && veiculo.getMarca().equals(carro.getMarca()) && veiculo.getAno() == carro.getAno()) {
				if (veiculo.isAlugado()) {
					throw new CarroAlugadoException(carro);
				}
				else {
					carro.setAlugado(true);
				}
			}
		}
		
		int dias = Locadora.getQuantidadeDias(inicio, datafim);
		double custo = dias * carro.getDiaria();
		double seguro = custo * 0.10;
		return custo + seguro;		
		
	}
	


}
