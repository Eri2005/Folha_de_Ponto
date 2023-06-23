package model.entities;

import java.time.LocalDate;

import model.services.TiposDescontos;

public class Salario extends Funcionario {

	private Double valorHorasExtra;
	
	private Funcionario funcionario;
	
	Horas horas = new Horas();

	public Salario() {
		super();
	}

	public Salario(String nome, Double valor, LocalDate dataRegistro, TiposDescontos descontos,
			Funcionario funcionario) {
		super(nome, valor, dataRegistro, descontos);
		this.funcionario = funcionario;
	}

	public Salario(String nome, Double valor, LocalDate dataRegistro, TiposDescontos descontos,
			Double valorHorasExtra, Funcionario funcionario) {
		super(nome, valor, dataRegistro, descontos);
		this.valorHorasExtra = valorHorasExtra;
		this.funcionario = funcionario;
	}

	public Double getValorHorasExtra() {
		return valorHorasExtra;
	}

	public void setValorHorasExtra(Double valorHorasExtra) {
		this.valorHorasExtra = valorHorasExtra;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Double valorHoras() {
		return funcionario.getValor() / 220;
	}
	
	public Double valorDia() {
		return funcionario.getValor() / 30;
	}
	
	public Double valorHorasExtras() {
		return valorHoras() *  0.6 + valorHoras();
	}
	
	public Double valorTotalExtras() {
		return valorHorasExtras() * horas.totalExtras();
	}
	
	@Override
	public String toString() {
		return "Valor da hora trabalhada R$: " 
				+ String .format("%.2f%n", valorHoras()) 
				+ "Valor da hora extra R$: " 
				+ String.format("%.2f%n", valorHorasExtras());
	}
}

