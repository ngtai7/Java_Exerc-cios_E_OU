import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		//Variáveis
		float a,b,c;
		
		
		//Início
		System.out.println("Digite o comprimento do primeiro lado: ");
		Scanner leitor = new Scanner(System.in);
		a = leitor.nextFloat();
		System.out.println("\nDigite o comprimento do segundo lado: ");
		b = leitor.nextFloat();
		System.out.println("\nDigite o comprimento do terceiro lado: ");
		c = leitor.nextFloat();
		
		if ((a<b+c)&&(b<a+c)&&(c<a+b))
		{
		if ((a==b)&&(a==c)&&(b==c))
		{System.out.println("\nTriângulo equilátero.");
		}
		else if ((a==b)||(a==c)||(b==c))
		{System.out.println("\nTriângulo isóceles.");
		 }
		else
		{System.out.println("\nTriângulo escaleno.");}
		}
		else
		{System.out.println("\nEstes lados não formam um triângulo.");}
		
		

	}

}