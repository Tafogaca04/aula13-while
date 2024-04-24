package Aula13;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int impar=0, par=0,num;
		
		for (int i = 1; i<=4; i++) {
		
		System.out.print("Informe o " + i +"número");
		num = ler.nextInt();
		if (num % 2 == 0)
			par = par + 1; //par+=1

		else 
			impar = impar + 1; 

	}
	System.out.print("Quantidade de par:"+par);
	System.out.print("Quantidade de impar"+ impar);
	ler.close();

}
}

