package model.entities;


import java.time.Duration;
import java.time.LocalTime;

public class Horas extends Funcionario{

	private LocalTime entradaServico;
	private LocalTime entradaAlmoco;
	private LocalTime retornoAlmoco;
	private LocalTime saidaServico;
	private Double horas;
	private Double horasTrabalhada;
	
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
	
	public Double getHoras() {
		return horas;
	}

	public void setHoras(Double horas) {
		this.horas = horas;
	}

	public Double getHorasTrabalhada() {
		return horasTrabalhada;
	}

	public void setHorasTrabalhada(Double horasTrabalhada) {
		this.horasTrabalhada = horasTrabalhada;
	}

	public Integer totalExtras() {
		int minutos = (int) Duration.between(entradaServico, saidaServico).toMinutes();
		int horas =  minutos / 60;
		
		if (horas > 8) {
			horas = horas - 8;
			
		} else {
			horas = horas - horas;
			
		}
		return horas;
	}
	
	public Integer almoco() {
		int minutos = (int) Duration.between(entradaAlmoco, retornoAlmoco).toMinutes();
		return minutos / 60;
	}
	
	public Integer duracao() {
		int minutos = (int) Duration.between(entradaServico, saidaServico).toMinutes();
		int horas =  minutos / 60;
		return horas;
	
	}

	public Integer totalTrabalho() {
		return duracao() - almoco();
	}
	
}
