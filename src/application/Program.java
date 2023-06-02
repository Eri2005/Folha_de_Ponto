package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Funcionario;
import model.entities.RegistroDeHorasDoDia;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		RegistroDeHorasDoDia registroDeHorasDoDia;
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dataFormatada1 = DateTimeFormatter.ofPattern("HH:mm");
		
		System.out.println("Entra com os dados do funcionario:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Valor do salario: ");
		double salario = sc.nextDouble();
		
		System.out.print("Data de registro do ponto: ");
		LocalDate data = LocalDate.parse(sc.next(), dataFormatada);
		
		Funcionario funcionario = new Funcionario(nome, salario, data);
		
		System.out.print("Horario de entrada no serviço: ");
		LocalDateTime entradaServico = LocalDateTime.parse(sc.next(), dataFormatada1);
		
		System.out.print("Inicio do almoço: ");
		LocalDateTime entradaAlmoco = LocalDateTime.parse(sc.next(), dataFormatada1);
		
		System.out.print("Retorno do almoço: ");
		LocalDateTime retornoAlmoco = LocalDateTime.parse(sc.next(), dataFormatada1);
		
		System.out.print("Horario de saida no serviço: ");
		LocalDateTime saidaServico = LocalDateTime.parse(sc.next(), dataFormatada1);
		
		RegistroDeHorasDoDia horas = new RegistroDeHorasDoDia(entradaServico, entradaAlmoco, retornoAlmoco, saidaServico);
		
		System.out.print(horas.getEntradaAlmoco());
		sc.close();
	}

}
