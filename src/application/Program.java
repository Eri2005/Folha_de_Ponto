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
import model.services.TiposDescontos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dataFormatada1 = DateTimeFormatter.ofPattern("HH:mm");
		
		Calcular calcular = new Calcular();

		try {
			
			System.out.println("Entra com os dados do funcionario:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Valor do salario: ");
			double salario = sc.nextDouble();

			System.out.print("Data de registro do ponto: ");
			LocalDate data = LocalDate.parse(sc.next(), dataFormatada);

			Funcionario funcionario = new Funcionario(nome, salario, data, new TiposDescontos());

			/*
			System.out.print("INSS: ");
			double inss = sc.nextDouble();
			
			System.out.print("Vale Transporte: ");
			double vale = sc.nextDouble();
			
			Salario salario = new Salario(inss, vale);
			*/
			
			System.out.print("Horario de entrada no serviço: ");
			LocalTime entradaServico = LocalTime.parse(sc.next(), dataFormatada1);

			System.out.print("Inicio do almoço: ");
			LocalTime entradaAlmoco = LocalTime.parse(sc.next(), dataFormatada1);

			System.out.print("Retorno do almoço: ");
			LocalTime retornoAlmoco = LocalTime.parse(sc.next(), dataFormatada1);

			System.out.print("Horario de saida no serviço: ");
			LocalTime saidaServico = LocalTime.parse(sc.next(), dataFormatada1);

			Horas horas = new Horas(entradaServico, entradaAlmoco, retornoAlmoco, saidaServico);

			System.out.println();
			System.out.println("Inicio do almoço: " + horas.getEntradaAlmoco());
			System.out.println("Valor do salário: " + funcionario.getValorSalario());
			System.out.println("Nome do funcionario: " + funcionario.getNome());
			
			System.out.println("Total de descontos: " + funcionario.desconto(salario));
			System.out.println("Duração da jornada: " + horas.duracao() + "H");
			System.out.println("Duração do almoço: " + horas.almoco() + "H");
			System.out.println("Horas trabalhadas: " + horas.totalTrabalho() + "H");
			System.out.println("Horas extras: " + calcular.calculandoExtras());

		} catch (DateTimeException e) {

			System.out.println("Error: " + e.getMessage());

		} catch (NullPointerException e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		}

		// System.out.println(funcionario.getSalario().getValeTransporte());
		

		sc.close();
	}

}
