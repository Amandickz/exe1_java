import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

public class Exercicio5 {
	
	public void execucao() {
		
		Scanner scan = new Scanner(System.in);
		
		int cod1, num1, cod2, num2;
		double valor1, valor2, total;
		
		
		System.out.println("Digite os códigos das peças, quantidade e valor de cada uma: ");
		cod1 = scan.nextInt();
		num1 = scan.nextInt();
		valor1 = scan.nextDouble();
		
		cod2 =  scan.nextInt();
		num2 = scan.nextInt();
		valor2 = scan.nextDouble();
		
		total = (num1 * valor1) + (num2 * valor2);
	
		System.out.printf("\nTotal a ser pago: R$ %.2f", total);

	}

}
