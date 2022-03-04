package calculadora;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Operacao op = new Operacao();

		float num1, num2;
		char resposta, opcao;

		do {
			System.out.println("digite o primeiro numero");
			num1 = sc.nextFloat();
			System.out.println("digite a opera��o:'+', '-', '*', '/'");
			resposta = sc.next().charAt(0);
			System.out.println("digite o segundo numero");
			num2 = sc.nextFloat();

			switch (resposta) {
			case '+':
				System.out.println("o resultado da soma eh: " + op.soma(num1, num2));
				break;

			case '-':
				System.out.println("o resultado da subtra��o eh: " + op.subtrai(num1, num2));
				break;

			case '*':
				System.out.println("o resultado da multiplica��o  eh: " + op.multiplica(num1, num2));
				break;

			case '/':
				System.out.println("o resultado da divis�o eh: " + op.dividi(num1, num2));
				break;

			default:
				System.out.println("informa��o invalida");
			}

			System.out.println("deseja fazer outra opera��o? S-Sim ou N-N�o");
			opcao = sc.next().charAt(0);

		}

		while (opcao != 'N');

		System.out.println("Saindo!!!");
		sc.close();

	}

}