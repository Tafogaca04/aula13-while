package Aula13;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int nota,media,soma=0,i=0;


		while( i<=5 ){

			System.out.println("Informe o nota:");
			nota= ler.nextInt();


			soma =(soma+nota);
		}    ++i;
			media = (soma)/5;

			
			
			System.out.println(" A soma é: " + soma);

			System.out.println(" A média é: " + media);

			
			ler.close();
		}

	}

