import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
