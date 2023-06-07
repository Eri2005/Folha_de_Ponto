package model.services;

import java.time.Duration;

import model.entities.Funcionario;
import model.entities.Horas;

public class Calcular {

	private TiposDescontos tiposDescontos;
	private Horas horas;

	public Calcular() {

	}

	public Calcular(TiposDescontos tiposDescontos, Horas horas) {
		this.tiposDescontos = tiposDescontos;
		this.horas = horas;
	}

	public void calculandoSalario(Funcionario funcionario) {

		double inss = tiposDescontos.inss(funcionario.getSalario());
		double valeTransporte = tiposDescontos.vateTransporte(funcionario.getSalario());
		double salario = funcionario.getSalario();
		
		Duration horasServico = Duration.between(horas.getEntradaServico(), horas.getSaidaServico());

		int horas = (int) horasServico.toHours();
		int minutos = (int) horasServico.toMinutesPart();

		int totalHorasExtra;
		int extra = 8;
		
		if (horas > extra) {
			totalHorasExtra = horas - extra;

		} else {
			totalHorasExtra = horas - horas;

		}

		int totalHoras = totalHorasExtra + minutos;
		
		double valorHorasExtra = totalHoras * 0.60 / 100;
		
		double total = salario + valeTransporte + inss + valorHorasExtra;
		
		funcionario.setCalcular(total);
	}
}
