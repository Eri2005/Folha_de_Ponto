package model.services;

public class TiposDescontos implements Desconto {
	
	private static final double INSS = 0.9;
	private static final double VALE_TRANSPORTE = 0.06;
	
	@Override
	public double inss(double valor) {
		return valor * INSS;
	}
	
	@Override
	public double valeTransporte(double valor) {
		return valor * VALE_TRANSPORTE;
	}

}
