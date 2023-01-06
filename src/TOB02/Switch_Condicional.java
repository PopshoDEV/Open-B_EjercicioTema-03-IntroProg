package TOB02;

import java.util.Scanner;

public class Switch_Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int estacion; 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero del 1/4 para verificar su estacion: ");
		estacion=teclado.nextInt();
		
		switch(estacion) {
			case 1:{
				System.out.println("Estamos en la estacion de Otoño");
				break;
			}
			case 2:{
				System.out.println("Estamos en la estacion de Invierno");
				break;
			}
			case 3:{
				System.out.println("Estamos en la estacion de Primavera");
				break;
			}
			case 4:{
				System.out.println("Estamos en la estacion de Verano");
				break;
			} default:
				System.out.println("La Estacion que desea verificar no es valida!");
				break;
		}
	}

}
