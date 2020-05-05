import java.util.Scanner;
public class n8 {
	
	String senha;
	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		System.out.print("Digite a senha: ");
		String senha = leitor.next();
		
		
		if(senha.contentEquals("AEDB")) {
			System.out.print("Acesso permitido");
		
		}
		else {
			System.out.print("Você não tem acesso ao sistema.");
	}

}
}
	