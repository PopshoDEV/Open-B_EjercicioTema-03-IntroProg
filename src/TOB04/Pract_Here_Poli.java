package TOB04;
public class Pract_Here_Poli {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();	
		cliente.elNombre = "Robert M. Charpantier";
		cliente.laEdad = 19;
		cliente.elTelefono = 298854833;
		cliente.credito=2.15;
		
		Trabajador trabajador = new Trabajador();
		trabajador.salario = 3.14;
		
		System.out.println("Hola mi nombre es: "+cliente.elNombre+" Mi Edad es de: "+cliente.laEdad+" Años, y mi numero telefonico es: "+cliente.elTelefono+" Actualmente mi credito es de: "+cliente.credito+" y aspiro a un salario de: "+trabajador.salario);
	}
}
class Persona {
	String elNombre;
	int laEdad;
	int elTelefono;
}

class Cliente extends Persona{
	double credito;	
} 

class Trabajador extends Persona{
	double salario;
}
