package FACENS;


import java.util.Scanner;

public class Estacionamento {

	public static void main(String[] args) {
		
		//Declarando a Vari�vel 
		Scanner sc = new Scanner(System.in); 

		int entrada; 
		
		//Print tela inicial
		
		System.out.print("Voc� � Idoso, gestante ou possui alguma defici�ncia? \n (1) - sim \n (2) - N�o \n Digite a op��o desejada: "); 
		entrada = sc.nextInt();

		//Condi��o if
		
		if (entrada == 1) {
			System.out.println("\nVoc� pode estacionar nessa vaga!"); //Se for = 1, ir� mostrar que pode sim estacionar
		} else if (entrada == 2) {
			System.out.println("\nVoc� n�o pode estacionar nessa vaga!"); //se for = 2, ir� mostrar que n�o pode
		} else {
			System.out.println("\nOp��o inv�lida!!"); // se a entrada nao for nenhuma das op��es, apenas avisar� que n�o � v�lido
		}

		sc.close();
	}

}
