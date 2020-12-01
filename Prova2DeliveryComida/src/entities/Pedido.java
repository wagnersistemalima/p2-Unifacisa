package entities;

public class Pedido {
	
	// atributos basicos
	
	private Data data;
	private String cliente;
	private String comida;
	private double preco;
	private double km;
	

	private static double precoKm = 0.7;
	
	// construtor

	public Pedido(Data data, String cliente, String comida, double preco, double km) {
	
		this.data = data;
		this.cliente = cliente;
		this.comida = comida;
		this.preco = preco;
		this.km = km;
	}
	
	// getters & setters

	public Data getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public String getComida() {
		return comida;
	}

	public double getPreco() {
		return preco;
	}

	public double getKm() {
		return km;
	}
	
	public static double getPrecoKm() {
		return precoKm;
	}
	
	
	@Override
	public String toString() {
		return "Pedido [data=" + data + ", cliente=" + cliente + ", comida=" + comida + ", preco=" + preco + ", km="
				+ km + ", preço por km " + precoKm + "]";
	}
	
	
	// função que calcula o custo total do pedido
	
	

	public double getCustoPedido() {
		
		return precoKm * km * preco;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

	
	
	
}
