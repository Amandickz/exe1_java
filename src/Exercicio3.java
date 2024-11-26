import java.util.Scanner;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

public class Exercicio3 {
	
	public void execucao() {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d, result;
		
		System.out.println("Digite quatro valores inteiros: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		result = a * b - c * d;
	
		System.out.printf("O resultado da diferença é: %d", result);
	}

}
