package TOB04;

public class Pract_Here_Poli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cliente cliente = new Cliente();	
		//OJO
		
		Trabajador trabajador = new Trabajador();
		
		trabajador.salario = 1500.42;
		System.out.println(trabajador.salario);
	}
}

class Persona {
	
	public String elNombre;
	public int laEdad;
	public float elTelefono;
}

class Cliente extends Persona{
	public double credito;	
	public void propiedades(String elNombre, int laEdad, float elTelefono, double credito) {
		this.elNombre = "Robert M. Charpantier";
		this.laEdad=19;
		this.elTelefono=8854833;
		credito=2.15;
	}
} 

class Trabajador extends Persona{
	public double salario;
}
