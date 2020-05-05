import java.util.Scanner;
public class n9 {

	public static void main(String[] args) {
	
		Scanner leitor =new Scanner (System.in);
		Double prod;
		Double porc;
		Double venda;
		System.out.print("Digite o valor do produto: ");
		prod = leitor.nextDouble();
		
		if(prod<20) {
			porc = (prod*45)/100;
			venda =(porc+prod);
			System.out.print("Valor de venda em R$: "+venda);
		}
		
		else {
			porc = (prod*30)/100;
			venda =(porc+prod);
			System.out.print("Valor de venda em R$: "+venda);
		}
	}

}