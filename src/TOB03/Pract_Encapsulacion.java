package TOB03;

public class Pract_Encapsulacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona obj = new Persona();  
		
		obj.setEdad(19);
		System.out.println(obj.getEdad());
		
		obj.setTelefono(8854833);
		System.out.println(obj.getTelefono());
		
		obj.setNombre("Roberto Mont. Charpantier/ con el 829 / RD");
		System.out.println(obj.getNombre());
	}
}

class Persona {
	private static int edad;
	public int getEdad() {return edad;}
	public void setEdad(int ed) {Persona.edad=ed;}
	
	private static int telefono;
	public int getTelefono() {return telefono;}
	public void setTelefono(int tel) {Persona.telefono=tel;}
	
	private static String nombre;
	public String getNombre() {return nombre;}
	public void setNombre(String nm) {Persona.nombre=nm;}
}