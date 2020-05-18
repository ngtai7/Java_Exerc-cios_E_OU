import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		//Variáveis
		float n;
		
		//Início
		
		System.out.println("Digite um número para checar se ele está compreendido entre 20 e 90: ");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextFloat();
		
		if ((n>20)&&(n<90))
			System.out.println("\nO número está no intervalo!");
		else
			System.out.println("\nO número está fora do intervalo!");
		

	}

}