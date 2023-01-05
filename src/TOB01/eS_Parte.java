package TOB01;

public class eS_Parte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche miCoche = new Coche();
		miCoche.AgregarPuerta();
		System.out.println(miCoche.puerta);
		}
	public static int suma(int a, int b) {
		return a+b;
	}
}

class Coche {
	public int puerta = 4;
	
	public void AgregarPuerta() {
		this.puerta++;
	}
}