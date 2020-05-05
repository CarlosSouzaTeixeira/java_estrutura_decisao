import java.util.Scanner;
public class n7 {
	
	String nome1, nome2;
	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		int id1, id2;
		System.out.print("Digito o nome da primeira pessoa: ");
		String nome1 = leitor.next();
		System.out.print("Digite a idade da primeira pessoa: ");
		id1 = leitor.nextInt();
		System.out.print("Digite o nome da segunda pessoa: ");
		String nome2 = leitor.next();
		System.out.print("Digite a idade da segunda pessoa: ");
		id2 = leitor.nextInt();
		
		if(id1>id2) {
			System.out.println("Nome: "+nome1);
			System.out.println("Idade: "+id1);
			
		}
		else {
			System.out.println("Nome: "+nome2);
			System.out.println
			("Idade: "+id2);
	}

}
}
	