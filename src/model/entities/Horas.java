package model.entities;

import java.time.Duration;
import java.time.LocalTime;

import model.services.Calcular;

public class Horas extends Funcionario{

	private LocalTime entradaServico;
	private LocalTime entradaAlmoco;
	private LocalTime retornoAlmoco;
	private LocalTime saidaServico;

	Calcular calcular;
	
	public Horas() {
		super();
	}

	public Horas(LocalTime entradaServico, LocalTime entradaAlmoco, LocalTime retornoAlmoco, LocalTime saidaServico) {
		this.entradaServico = entradaServico;
		this.entradaAlmoco = entradaAlmoco;
		this.retornoAlmoco = retornoAlmoco;
		this.saidaServico = saidaServico;
	}

	public LocalTime getEntradaServico() {
		return entradaServico;
	}

	public void setEntradaServico(LocalTime entradaServico) {
		this.entradaServico = entradaServico;
	}

	public LocalTime getEntradaAlmoco() {
		return entradaAlmoco;
	}

	public void setEntradaAlmoco(LocalTime entradaAlmoco) {
		this.entradaAlmoco = entradaAlmoco;
	}

	public LocalTime getRetornoAlmoco() {
		return retornoAlmoco;
	}

	public void setRetornoAlmoco(LocalTime retornoAlmoco) {
		this.retornoAlmoco = retornoAlmoco;
	}

	public LocalTime getSaidaServico() {
		return saidaServico;
	}

	public void setSaidaServico(LocalTime saidaServico) {
		this.saidaServico = saidaServico;
	}

	public long duracao() {
		long minutos = Duration.between(entradaServico, saidaServico).toMinutes();
		return minutos / 60;
	}
	
	public long almoco() {
		long minutos = Duration.between(entradaAlmoco, retornoAlmoco).toMinutes();
		return minutos / 60;
	}
	
	public long totalTrabalho() {
		return duracao() - almoco();
	}
}
