import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		//Variáveis
		int i;
		
		
		//Início
		System.out.println("Digite a idade para checar a categoria: ");
		Scanner leitor = new Scanner(System.in);
		i = leitor.nextInt();
		
		if ((i>=5)&&(i<=10))
		{System.out.println("\nInfantil.");}
		else if ((i>=11)&&(i<=17))
		{System.out.println("\nJuvenil.");}
		else if (i>=18)
		{System.out.println("\nAdulto");}
		else
		{System.out.println("\nIdade inválida.");}
		
		
		

	}

}
