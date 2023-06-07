package model.entities;

import java.time.LocalTime;

public class Horas {

	private LocalTime entradaServico;
	private LocalTime entradaAlmoco;
	private LocalTime retornoAlmoco;
	private LocalTime saidaServico;

	public Horas() {

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

}
