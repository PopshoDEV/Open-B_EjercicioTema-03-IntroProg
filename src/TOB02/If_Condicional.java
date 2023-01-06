package TOB02;

import java.util.Scanner;

public class If_Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		double numeroIf;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese numero a validar: ");
		numeroIf = teclado.nextDouble();
		
		if(numeroIf >= 1) {
			System.out.println("El numero ingresado es positivo");	
		} else if (numeroIf == 0) {
			System.out.println("El numero ingresado es nulo");
		}else{
			System.out.println("El numero ingresado es negativo"); 
		}
		
		
	}
	


}
