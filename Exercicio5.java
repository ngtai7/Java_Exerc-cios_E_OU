import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		//Variáveis
		float a,b,c,d;
		double m;
		
		
		//Início
		System.out.println("Digite primeira nota: ");
		Scanner leitor = new Scanner(System.in);
		a = leitor.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		b = leitor.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		c = leitor.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		d = leitor.nextFloat();
		m=(a+b+c+d)/4;
		if (m>=7.0)
		{System.out.println("\nAprovado.");
		}
		else if ((m>=3.5)&&(m<7.0))
		{System.out.println("\nRecuperação.");
		 }
		else if (m<3.5)
		{System.out.println("\nReprovado.");}
		else
		{System.out.println("Valor inválido.");}
		
		
		

	}

}
