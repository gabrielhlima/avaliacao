package aplication;

import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Menu de Atividades");
		System.out.println("Selecione as op��es:");
		System.out.println("1 para a primeira quest�o");
		System.out.println("2 para a segunda quest�o");
		System.out.println("3 para a terceira quest�o");
		System.out.println("4 para a quarta quest�o");
		System.out.println("5 para a quinta quest�o");

		int x = sc.nextInt();

		switch (x) {
		case 1:
			String pessoa1, pessoa2;
			int idade1, idade2;

			System.out.println("Informe o nome da primeira pessoa: ");
			pessoa1 = sc.nextLine();

			sc.nextLine();

			System.out.println("Informe a idade da primeira pessoa");
			idade1 = sc.nextInt();

			sc.nextLine();

			System.out.println("Informe o nome da segunda pessoa: ");
			pessoa2 = sc.nextLine();

			sc.nextLine();

			System.out.println("Informe a idade da segunda pessoa ");
			idade2 = sc.nextInt();

			System.out.println("Dados da primeira pessoa: ");
			System.out.println("  ");
			System.out.println("Nome: " + pessoa1);
			System.out.println("Sal�rio: " + idade1);

			System.out.println("  ");

			System.out.println("Dados da segunda pessoa: ");
			System.out.println("  ");
			System.out.println("Nome: " + pessoa1);
			System.out.println("Sal�rio: " + idade2);

			if (idade1 > idade2) {
				System.out.println(pessoa1 + " � mais velha");
			} else {
				System.out.println(pessoa2 + " � mais velha");
			}

		case 2:
			String funcionario1, funcionario2;
			double salario1, salario2;

			System.out.println("Informe o nome do primeiro funcion�rio: ");
			funcionario1 = sc.nextLine();

			sc.nextLine();

			System.out.println("Informe o sal�rio de " + funcionario1);
			salario1 = sc.nextDouble();

			sc.nextLine();

			System.out.println("Informe o nome do primeiro funcion�rio: ");
			funcionario2 = sc.nextLine();

			sc.nextLine();

			System.out.println("Informe o sal�rio de " + funcionario2);
			salario2 = sc.nextDouble();

			sc.nextLine();

			System.out.println("Dados do primeiro funcionario");
			System.out.println("  ");
			System.out.println("Nome: " + funcionario1);
			System.out.println("Sal�rio: " + salario1);

			System.out.println("  ");
			System.out.println("  ");

			System.out.println("Dados do segundo funcionario");
			System.out.println("  ");
			System.out.println("Nome: " + funcionario2);
			System.out.println("Sal�rio: " + salario2);

			double mediaSalario = (salario1 + salario2) / 2;

			System.out.println("  ");

			System.out.println("A m�dia salaria �: " + mediaSalario + " reais.");

		case 3:
			double lado1 = 0, lado2 = 0;
			double area = 0, perimetro = 0, diagonal = 0, pitagoras = 0;

			System.out.println("Informe o valor do primeiro lado do ret�ngulo: ");
			lado1 = sc.nextDouble();

			System.out.println("Informe o valor do segundo lado do ret�ngulo: ");
			lado2 = sc.nextDouble();

			area = lado1 * lado2;
			perimetro = (lado1 + lado2) * 2;
			pitagoras = (lado1 * lado1) + (lado2 * lado2);
			diagonal = Math.sqrt(pitagoras);

			System.out.println("�rea: " + area);
			System.out.println("Per�metro: " + perimetro);
			System.out.println("Diagonal: " + diagonal);

		case 4:
			String nomeFuncionario;
			double salarioBruto = 0, imposto = 0, salarioLiquido = 0, porcentagemAumento = 0;

			System.out.println("Digite o nome do funcion�rio: ");
			nomeFuncionario = sc.nextLine();

			System.out.println("Informe o valor do sal�rio bruto de " + nomeFuncionario + ":");
			salarioBruto = sc.nextDouble();

			System.out.println("Informe o valor do imposto: ");
			imposto = sc.nextDouble();

			salarioLiquido = salarioBruto - imposto;

			System.out.println("Funcion�rio: " + nomeFuncionario + "R$ " + salarioLiquido);

			System.out.println("Informe o valor da porcentagem de aumento salarial: ");
			porcentagemAumento = sc.nextDouble();

			salarioBruto += salarioBruto * (porcentagemAumento * 100);

			System.out.println("Dados atualizados: " + nomeFuncionario + "R$ " + salarioLiquido);

		case 5:
			String aluno1, aluno2;
			double nota1Aluno1 = 0, nota2Aluno1 = 0, nota3Aluno1 = 0, nota1Aluno2 = 0, nota2Aluno2 = 0, nota3Aluno2 = 0;

			System.out.println("Digite o nome do primeiro aluno: ");
			aluno1 = sc.nextLine();

			System.out.println("Informe a primeira nota de " + aluno1);
			nota1Aluno1 = sc.nextDouble();
			System.out.println("Informe a segunda nota de " + aluno1);
			nota2Aluno1 = sc.nextDouble();
			System.out.println("Informe a terceira nota de " + aluno1);
			nota3Aluno1 = sc.nextDouble();

			sc.nextLine();

			System.out.println("Digite o nome do segundo aluno: ");
			aluno2 = sc.nextLine();

			System.out.println("Informe a primeira nota de " + aluno2);
			nota1Aluno2 = sc.nextDouble();
			System.out.println("Informe a segunda nota de " + aluno2);
			nota2Aluno2 = sc.nextDouble();
			System.out.println("Informe a terceira nota de " + aluno2);
			nota3Aluno2 = sc.nextDouble();

			double notaFinal1 = nota1Aluno1 + nota2Aluno1 + nota3Aluno1;
			double notaFinal2 = nota1Aluno2 + nota2Aluno2 + nota3Aluno2;

			System.out.println("Nota Final de " + aluno1 + " � " + notaFinal1);
			System.out.println("Nota Final de " + aluno2 + " � " + notaFinal2);

			if (notaFinal1 >= 60) {
				System.out.println(aluno1 + " APROVADO");
			} else {
				System.out.println(aluno1 + " REPROVADO");
				double necessario = 60 - notaFinal1;
				System.out.println("Faltam: " + necessario + " pontos");
			}

			if (notaFinal2 >= 60) {
				System.out.println(aluno2 + " APROVADO");
			} else {
				System.out.println(aluno2 + " REPROVADO");
				double necessario = 60 - notaFinal1;
				System.out.println("Faltam: " + necessario + " pontos");
			}

		}

		sc.close();

	}

}
