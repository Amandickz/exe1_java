import java.util.Scanner;

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.*/

public class Exercicio2 {
	
	public void execucao() {
		
		Scanner scan = new Scanner(System.in);
	
		double pi, raio, result;
		
		pi = 3.14159;
	
		System.out.printf("Digite o raio do círculo: ");
		raio = scan.nextDouble();
	
		result = pi * (Math.pow(raio, 2.0));
	
		System.out.printf("O resultado da soma é: %.4f", result);
	}

}
