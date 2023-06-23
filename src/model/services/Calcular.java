package model.services;

import java.time.LocalDate;

import model.entities.Funcionario;
import model.entities.Horas;

public class Calcular extends Funcionario {

	private TiposDescontos tiposDescontos;
	private Horas horas;

	public Calcular() {
		super();
	}

	public Calcular(String nome, Double valor, LocalDate dataRegistro, TiposDescontos descontos,
			TiposDescontos tiposDescontos, Horas horas) {
		super(nome, valor, dataRegistro, descontos);
		this.tiposDescontos = tiposDescontos;
		this.horas = horas;
	}

	public TiposDescontos getTiposDescontos() {
		return tiposDescontos;
	}

	public void setTiposDescontos(TiposDescontos tiposDescontos) {
		this.tiposDescontos = tiposDescontos;
	}

	public Horas getHoras() {
		return horas;
	}

	public void setHoras(Horas horas) {
		this.horas = horas;
	}
}
