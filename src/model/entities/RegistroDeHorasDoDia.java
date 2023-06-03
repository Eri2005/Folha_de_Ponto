package model.entities;

import java.time.LocalTime;

import model.services.Calcular;


public class RegistroDeHorasDoDia {

	Funcionario funcionario;
	Calcular calcular;
	
	private LocalTime entradaServico;
	private LocalTime entradaAlmoco;
	private LocalTime retornoAlmoco;
	private LocalTime saidaServico;

	public RegistroDeHorasDoDia() {

	}

	public RegistroDeHorasDoDia(LocalTime entradaServico, LocalTime entradaAlmoco, LocalTime retornoAlmoco,
			LocalTime saidaServico, Funcionario funcionario, Calcular calcular) {
		this.entradaServico = entradaServico;
		this.entradaAlmoco = entradaAlmoco;
		this.retornoAlmoco = retornoAlmoco;
		this.saidaServico = saidaServico;
		this.funcionario = funcionario;
		this.calcular = calcular;
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
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Calcular getCalcular() {
		return calcular;
	}
}
