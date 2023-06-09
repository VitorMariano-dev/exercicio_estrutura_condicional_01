import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// EXERCICIO 01 //
		int A;
		System.out.println("Qual o número?");
		A = sc.nextInt();
		if (A < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}

		// EXERCICIO 02 //

		int B;
		System.out.println("Qual o número?");
		B = sc.nextInt();
		if (B % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		// EXERCICIO 03 //

		int C = sc.nextInt();
		int D = sc.nextInt();

		if (C % D == 0 || D % C == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}

		// EXERCICIO 04 //

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		int duracao;

		if (horaInicial < horaFinal) {
			duracao = horaInicial - horaFinal;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O jogo durou: " + duracao + "hora(s)");

		// EXERCICIO 05 //

		int codigo = sc.nextInt();
		int qtd = sc.nextInt();

		double total;

		if (codigo == 1) {
			total = qtd * 4.00;
		} else if (codigo == 2) {
			total = qtd * 4.50;
		} else if (codigo == 3) {
			total = qtd * 5.00;
		} else if (codigo == 4) {
			total = qtd * 2.00;
		} else {
			total = qtd * 1.5;
		}

		System.out.println("Total: RS " + total);

		// EXERCICIO 06 //

		double numero;
		numero = sc.nextDouble();

		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}

		
		
		
		// EXERCICIO 07 //
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}else if (x == 0.0 ) {
			System.out.println("Eixo Y");
		}else if(y == 0.0) {
			System.out.println("Eixo X");
		}else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
		
		// EXERCICIO 08 // 
		
		double salario = sc.nextDouble();
		
		double imposto;
		
		if(salario <= 2000.0) {
			imposto = 0.0;
		}else if(salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}else if(salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}else {
			imposto = (salario - 4500.0) *0.28 + 1500.0 *0.18 + 1000.0 * 0.08;
		}
		
		if(imposto == 0.0) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		
		
		sc.close();
	}

}
