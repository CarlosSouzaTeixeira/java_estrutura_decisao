import java.util.Scanner;
public class n2 {

	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		int num1, num2, soma;
		System.out.print("Digite um n�mero inteiro: ");
		num1 = leitor.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		num2 = leitor.nextInt();
		soma= num1+num2;
		if(soma>10) {
			System.out.println("Soma de "+num1+ " + "+num2+" � igual a "+soma);
		}
		
	}

}
