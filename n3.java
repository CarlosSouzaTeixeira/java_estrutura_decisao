import java.util.Scanner;
public class n3 {

	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		double num;
		System.out.print("Digite um n�mero: ");
		num = leitor.nextDouble();
		
		if(num>0) {
			System.out.println("O n�mero "+num+ " � positivo");
		}
		
		else {
			System.out.println("O n�mero "+num+ " � negativo");
		}
	}

}