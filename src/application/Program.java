package application;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Funcionario;
import model.entities.Horas;
import model.services.Calcular;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Horas registroDeHorasDoDia;
		Calcular calcular;
		
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
		
		try {
			System.out.print("Horario de entrada no serviço: ");
			LocalTime entradaServico = LocalTime.parse(sc.next(), dataFormatada1);
			
			System.out.print("Inicio do almoço: ");
			LocalTime entradaAlmoco = LocalTime.parse(sc.next(), dataFormatada1);
			
			System.out.print("Retorno do almoço: ");
			LocalTime retornoAlmoco = LocalTime.parse(sc.next(), dataFormatada1);
			
			System.out.print("Horario de saida no serviço: ");
			LocalTime saidaServico = LocalTime.parse(sc.next(), dataFormatada1);
			
			registroDeHorasDoDia = new Horas(entradaServico, entradaAlmoco, retornoAlmoco, saidaServico, new Funcionario(), new Calcular());
			
			System.out.println(registroDeHorasDoDia.getEntradaAlmoco());
			System.out.println(funcionario.getSalario());
			System.out.println(funcionario.getNome());
			
			
		} catch (DateTimeException e) {
			System.out.println("Error: " + e.getMessage());
			
		}
		
		System.out.println(funcionario.getCalcular());
		
		//System.out.println(calcular.getFuncionario().getCalcular().calculandoSalario());
		
		sc.close();
	}

}
