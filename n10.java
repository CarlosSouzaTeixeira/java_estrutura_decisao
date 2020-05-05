import java.util.Scanner;
public class n10 {
	
	String sexo;
	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		double altura;
	
		Double ideal;
		System.out.print("Digito o seu sexo: (F) para feminino ou (M) para masculino: ");
		String sexo = leitor.next();
		System.out.print("Digite a sua altura em metros (ex: 1,70): ");
		altura = leitor.nextDouble();
	
		
		if(sexo.contentEquals("M")) {
			
			ideal = ((72.7*altura)-58);
			System.out.printf("Peso ideal: %.2f kg",ideal);
			
			
		}
		else {
			ideal = ((62.1*altura)-44.7);
			System.out.printf("Peso ideal: %.2f kg",ideal);
			
	}

}
}