import java.util.Scanner;
public class n1 {

	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		int num;
		System.out.print("Digite um n�mero inteiro: ");
		num = leitor.nextInt();
		
		if(num>20) {
			System.out.println("N�mero digitado: "+num);
		}
		
	}

}
