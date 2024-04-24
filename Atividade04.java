package Aula13;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int n,i=0,par=0,impar=0;
		
        while (i<=10) {
        	System.out.print("Informe o valor : " +i+ "numero: ");
    		n = ler.nextInt();
			if (n % 2 == 0) 
				par = par + 1; //par+=1
			else

				impar = impar + 1; 
			i++;
		}
			
			System.out.print("Quantidade de par:"+par);
			System.out.print("Quantidade de impar"+ impar);

			ler.close();
		}
	}





