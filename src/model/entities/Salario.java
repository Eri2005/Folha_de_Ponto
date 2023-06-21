package model.entities;

import java.time.LocalDate;

import model.services.TiposDescontos;

public class Salario extends Funcionario {

	private Double valorHorasExtra;
	
	private Funcionario funcionario;
	private Double total = funcionario.getValorSalario();

	public Salario() {
		super();
	}

	public Salario(String nome, Double valorSalario, LocalDate dataRegistro, TiposDescontos descontos, Funcionario funcionario) {
		super(nome, valorSalario, dataRegistro, descontos);
		this.funcionario = funcionario;
	}

	public Salario(String nome, Double valorSalario, LocalDate dataRegistro, TiposDescontos descontos,
			Double valorHorasExtra, Funcionario funcionario) {
		super(nome, valorSalario, dataRegistro, descontos);
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
	
	public void getTotal(double valor) {
		this.total = valor;
	}

	public Double total(double valor) {
		return this.total - funcionario.desconto(valor);
	}
}
