package application;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Funcionario;
import model.entities.Horas;
import model.entities.Salario;
import model.services.TiposDescontos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dataFormatada1 = DateTimeFormatter.ofPattern("HH:mm");

		try {

			System.out.println("Entra com os dados do funcionario:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Valor do salario: ");
			double valor = sc.nextDouble();

			System.out.print("Data de registro do ponto: ");
			LocalDate data = LocalDate.parse(sc.next(), dataFormatada);

			Funcionario funcionario = new Funcionario(nome, valor, data, new TiposDescontos());

			System.out.print("Horario de entrada no serviço: ");
			LocalTime entradaServico = LocalTime.parse(sc.next(), dataFormatada1);

			System.out.print("Inicio do almoço: ");
			LocalTime entradaAlmoco = LocalTime.parse(sc.next(), dataFormatada1);

			System.out.print("Retorno do almoço: ");
			LocalTime retornoAlmoco = LocalTime.parse(sc.next(), dataFormatada1);

			System.out.print("Horario de saida no serviço: ");
			LocalTime saidaServico = LocalTime.parse(sc.next(), dataFormatada1);

			Horas horas = new Horas(entradaServico, entradaAlmoco, retornoAlmoco, saidaServico);

			Salario salario = new Salario(nome, valor, data, new TiposDescontos(), funcionario);

			System.out.println();
			
			System.out.println("Valor do salário: " + funcionario.getValor());

			System.out.println("Nome do funcionario: " + funcionario.getNome());

			System.out.println("Total de descontos R$: " + funcionario.desconto(valor));

			System.out.println("Duração da jornada: " + horas.totalTrabalho() + "H");

			System.out.println("Duração do almoço: " + horas.almoco() + "H");

			System.out.println("Total de Horas extras: " + horas.totalExtras() + "H");

			System.out.println("Total de horas trabalhadas: " + horas.duracao() + "H");

			System.out.println(salario);

			//System.out.println("Valor da hora extra R$: " + salario.valorTotalExtras());

		} catch (DateTimeException e) {

			System.out.println("Error: " + e.getMessage());

		} catch (NullPointerException e) {

			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();

		}

		sc.close();
	}

}
