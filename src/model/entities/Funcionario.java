package model.entities;

import java.time.LocalDate;

import model.services.TiposDescontos;

public class Funcionario {

	private String nome;
	private Double valorSalario;
	private LocalDate dataRegistro;
	private Salario salario;
	private TiposDescontos descontos;
	//private Double desconto = getValorSalario();

	public Funcionario() {

	}

	public Funcionario(String nome, Double valorSalario, LocalDate dataRegistro, TiposDescontos descontos) {
		this.nome = nome;
		this.valorSalario = valorSalario;
		this.dataRegistro = dataRegistro;
		this.descontos = descontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(Double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public LocalDate getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Salario getSalario() {
		return salario;
	}

	public void setSalario(Salario salario) {
		this.salario = salario;
	}
	
	public TiposDescontos getDescontos() {
		return descontos;
	}

	public void setDescontos(TiposDescontos descontos) {
		this.descontos = descontos;
	}

	public Double desconto(double valor) {
		return descontos.inss(this.valorSalario) + descontos.vateTransporte(this.valorSalario);
	}

}
