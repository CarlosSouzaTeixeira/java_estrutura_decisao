import java.util.Scanner;
public class n5 {

	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		double num, num1, num2;
		System.out.print("Digite um número: ");
		num = leitor.nextDouble();	
		
		if(num%2==0) {
			System.out.println("O número "+num+" é par");
		}
		else {
			System.out.println("O número "+num+ " é ímpar");
	}
	}
}