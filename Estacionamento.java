package FACENS;


import java.util.Scanner;

public class Estacionamento {

	public static void main(String[] args) {
		
		//Declarando a Variável 
		Scanner sc = new Scanner(System.in); 

		int entrada; 
		
		//Print tela inicial
		
		System.out.print("Você é Idoso, gestante ou possui alguma deficiência? \n (1) - sim \n (2) - Não \n Digite a opção desejada: "); 
		entrada = sc.nextInt();

		//Condição if
		
		if (entrada == 1) {
			System.out.println("\nVocê pode estacionar nessa vaga!"); //Se for = 1, irá mostrar que pode sim estacionar
		} else if (entrada == 2) {
			System.out.println("\nVocê não pode estacionar nessa vaga!"); //se for = 2, irá mostrar que não pode
		} else {
			System.out.println("\nOpção inválida!!"); // se a entrada nao for nenhuma das opções, apenas avisará que não é válido
		}

		sc.close();
	}

}
