package model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroDeHorasDoDia {

	private static DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("HH:mm");
	
	private LocalDateTime entradaServico;
	private LocalDateTime entradaAlmoco;
	private LocalDateTime retornoAlmoco;
	private LocalDateTime saidaServico;

	public RegistroDeHorasDoDia() {

	}

	public RegistroDeHorasDoDia(LocalDateTime entradaServico, LocalDateTime entradaAlmoco, LocalDateTime retornoAlmoco,
			LocalDateTime saidaServico) {
		this.entradaServico = entradaServico;
		this.entradaAlmoco = entradaAlmoco;
		this.retornoAlmoco = retornoAlmoco;
		this.saidaServico = saidaServico;
	}

	public LocalDateTime getEntradaServico() {
		return entradaServico;
	}

	public void setEntradaServico(LocalDateTime entradaServico) {
		this.entradaServico = entradaServico;
	}

	public LocalDateTime getEntradaAlmoco() {
		return entradaAlmoco;
	}

	public void setEntradaAlmoco(LocalDateTime entradaAlmoco) {
		this.entradaAlmoco = entradaAlmoco;
	}

	public LocalDateTime getRetornoAlmoco() {
		return retornoAlmoco;
	}

	public void setRetornoAlmoco(LocalDateTime retornoAlmoco) {
		this.retornoAlmoco = retornoAlmoco;
	}

	public LocalDateTime getSaidaServico() {
		return saidaServico;
	}

	public void setSaidaServico(LocalDateTime saidaServico) {
		this.saidaServico = saidaServico;
	}

	public void valorHora() {
		
	}
}
