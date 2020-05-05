import java.util.Scanner;
public class n6 {

	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		Double n1, n2, n3, media;
		System.out.print("Digite a primeira nota: ");
		n1 = leitor.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = leitor.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3 = leitor.nextDouble();
		
		media = ((n1*2)+(n2*3)+(n3*5))/7;
		
		if(media>7) {
			
			System.out.printf("Sua média foi %.2f. Parábens você foi aprovado!", media);
		}
		else {
			System.out.printf("Sua média foi %.2f. Você foi reprovado!", media);
	}

}
	}
