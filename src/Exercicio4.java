import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

public class Exercicio4 {
	
	public void execucao() {
		
		Scanner scan = new Scanner(System.in);
		
		int funcionario;
		double horast, valor, result;
		
		System.out.println("Digite o número do funcionário, as horas trabalhadas e seu valor por hora: ");
		funcionario = scan.nextInt();
		horast = scan.nextDouble();
		valor = scan.nextDouble();
		
		result = horast * valor;
	
		System.out.printf("Funcionário número %d\n", funcionario);
		System.out.printf("Salário: R$ %.2f", result);
	}

}
