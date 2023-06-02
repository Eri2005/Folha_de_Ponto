package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String nome;
	private Double salario;
	private LocalDate dataRegistro;
	
	private List<RegistroDeHorasDoDia> horas = new ArrayList<>();

	public Funcionario() {

	}

	public Funcionario(String nome, Double salario, LocalDate dataRegistro) {
		this.nome = nome;
		this.salario = salario;
		this.dataRegistro = dataRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public LocalDate getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public List<RegistroDeHorasDoDia> getHoras(){
		return horas;
	}
}
