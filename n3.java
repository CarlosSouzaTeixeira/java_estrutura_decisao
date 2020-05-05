import java.util.Scanner;
public class n3 {

	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		double num;
		System.out.print("Digite um número: ");
		num = leitor.nextDouble();
		
		if(num>0) {
			System.out.println("O número "+num+ " é positivo");
		}
		
		else {
			System.out.println("O número "+num+ " é negativo");
		}
	}

}