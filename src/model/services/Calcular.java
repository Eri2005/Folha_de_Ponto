package model.services;

import java.time.Duration;

import model.entities.Funcionario;
import model.entities.Horas;

public class Calcular {

	private Desconto descontos;
	private TiposDescontos tiposDescontos;
	private Funcionario funcionario;

	public Calcular() {
		
	}
	
	public Calcular(Desconto descontos, TiposDescontos tiposDescontos, Funcionario funcionario) {
		super();
		this.descontos = descontos;
		this.tiposDescontos = tiposDescontos;
		this.funcionario = funcionario;
	
	}

	public Desconto getDescontos() {
		return descontos;
	}

	public void setDescontos(Desconto descontos) {
		this.descontos = descontos;
	}

	public TiposDescontos getTiposDescontos() {
		return tiposDescontos;
	}

	public void setTiposDescontos(TiposDescontos tiposDescontos) {
		this.tiposDescontos = tiposDescontos;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	double saldoHorasExtra;

	public void calculandoHoras(Horas horas) {
		double minutosServico = Duration.between(horas.getEntradaServico(), horas.getSaidaServico()).toMinutes();
		double horasServico = minutosServico / 60.0;
		
		double totalHorasExtra;
		
		if (horasServico > 8) {
			totalHorasExtra = horasServico - 8;
			saldoHorasExtra = totalHorasExtra * 0.60;
			
		} else {
			saldoHorasExtra = horasServico;
			
		}
	
		funcionario.setCalcular(new Calcular(descontos, tiposDescontos, funcionario));
	}
	
	public Double calculandoSalario() {
		return funcionario.getSalario() + tiposDescontos.inss(funcionario.getSalario()) + descontos.vateTransporte(funcionario.getSalario()) + saldoHorasExtra;	
	}
}
