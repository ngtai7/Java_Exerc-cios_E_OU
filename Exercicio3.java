import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		//Variáveis
		float salA;
		
		
		//Início
		System.out.println("Digite o seu salário atual: ");
		Scanner leitor = new Scanner(System.in);
		salA = leitor.nextFloat();
		
		if ((salA>0)&&(salA<=1000.00))
		{System.out.println("\nAumento de 15%.");
		 System.out.println("\nNovo salário:"+1.15*salA);
		}
		else if ((salA>=1000.01)&&(salA<=2500.00))
		{System.out.println("\nAumento de 7%.");
		 System.out.println("\nNovo salário:"+1.07*salA);}
		else if (salA>2500.00)
		{System.out.println("\nSem aumento.");}
		else
		{System.out.println("\nValor inválido.");}
		
		
		

	}

}