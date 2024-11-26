import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

public class Exercicio6 {
	
	public void execucao() {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, area, pi;
		
		System.out.println("Digite os valores de A, B e C:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		System.out.printf("\nÁrea do:\n");
		
		//Cálculo do triângulo retângulo
		area = (a * c)/2;
		System.out.printf("Triângulo: %.3f\n", area);
		
		//Cálculo da área do Circulo
		pi = 3.14159;
		area = pi * (Math.pow(c, 2.0));
		System.out.printf("Círculo: %.3f\n", area);
		
		//Cálculo da área do Trapézio
		area = ((a + b) * c)/2;
		System.out.printf("Trapézio: %.3f\n", area);
		
		//Cálculo da área do Quadrado
		area = Math.pow(b, 2);
		System.out.printf("Quadrado: %.3f\n", area);
		
		//Cálculo da área do Retângulo
		area = a * b;
		System.out.printf("Retângulo: %.3f\n", area);

	}

}
