package model.entities;

import java.time.LocalDate;

import model.services.TiposDescontos;

public class Funcionario {

	private String nome;
	private Double valor;
	private LocalDate dataRegistro;
	private Salario salario;
	private TiposDescontos descontos;

	public Funcionario() {
		
	}

	public Funcionario(String nome, Double valor, LocalDate dataRegistro, TiposDescontos descontos) {
		this.nome = nome;
		this.valor = valor;
		this.dataRegistro = dataRegistro;
		this.descontos = descontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
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
		return descontos.inss(this.valor) + descontos.vateTransporte(this.valor);
	}

}
