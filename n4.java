import java.util.Scanner;
public class n4 {

	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		double num1, num2, soma;
		System.out.print("Digite um número inteiro: ");
		num1 = leitor.nextDouble();
		System.out.print("Digite outro número inteiro: ");
		num2 = leitor.nextDouble();
		if(num1<num2) {
			System.out.println(num2);
			System.out.println(num1);
		}
			else {
				System.out.println(num1);
				System.out.println(num2);
		}
		
	}

}