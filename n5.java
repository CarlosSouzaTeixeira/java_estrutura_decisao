import java.util.Scanner;
public class n5 {

	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		double num, num1, num2;
		System.out.print("Digite um n�mero: ");
		num = leitor.nextDouble();	
		
		if(num%2==0) {
			System.out.println("O n�mero "+num+" � par");
		}
		else {
			System.out.println("O n�mero "+num+ " � �mpar");
	}
	}
}