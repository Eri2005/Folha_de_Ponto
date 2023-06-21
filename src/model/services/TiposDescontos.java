package model.services;

public class TiposDescontos implements Desconto {
	
	private static final double INSS = 0.09;
	private static final double VALE_TRANSPORTE = 0.06;
	
	
	public double inss(double valor) {
		return valor * INSS;
	}
	
	public double vateTransporte(double valor) {
		return valor * VALE_TRANSPORTE;
	}
	
}
