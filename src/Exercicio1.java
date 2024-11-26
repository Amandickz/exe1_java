import java.util.Scanner;

public class Exercicio1 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int a, b, result;
	
		System.out.printf("Digite o primeiro número: ");
		a = scan.nextInt();
	
		System.out.printf("Digite o primeiro número: ");
		b = scan.nextInt();
	
		result = a + b;
	
		System.out.printf("O resultado da soma é: %d", result);
	}

}
