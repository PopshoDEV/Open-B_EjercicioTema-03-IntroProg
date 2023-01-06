package TOB02;

import java.util.Scanner;

public class While_Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numeroWhile;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese numero a almacenar: ");
		numeroWhile = teclado.nextDouble();
		
		while(numeroWhile < 3) {
			numeroWhile++;
			System.out.println(numeroWhile);
		}
		
		do{
			numeroWhile++;
			System.out.println(numeroWhile);
		}while(numeroWhile < 3);
	}

}
