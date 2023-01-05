package TOB01;

public class eP_Parte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a =12,b=12,c=12,r; 
		r = suma(a,b,c);
		System.out.println(r);
	}
	public static double suma(double num1, double num2, double num3) {
		double r;
		//El mandato dice que se sumen entre si, este podria ser una soluccion.
		//		num1=num1+num1;
		//		num2=num2+num2;
		//		num3=num3+num3;
		// tambien podria ser una soluccion X por 4, Para ahorrarnos unas lineas de codigo Xtras
		// o podria ser una soluccion 
		r = num1 + num2 + num3;
		return r;		
	}
}
