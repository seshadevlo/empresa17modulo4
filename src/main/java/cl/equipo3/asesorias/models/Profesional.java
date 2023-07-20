package main.java.cl.equipo3.asesorias.models;

public class Profesional extends Usuario{


	String titulo = "periodista";
    String fechaIngreso = "15 de mayo 2014";

	// Constructor vacio
	
	public Profesional() {
		
	}

	//constructor con parametros aptos para nuevos datos
	
	public Profesional(String nombre, String fechaNacimiento, String rut, String titulo, String fechaIngreso) {

		super(nombre, fechaNacimiento, rut);

		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	//getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	//metodo utilizado para desplegar los datos por pantalla 
	@Override
	public String toString() {
		return "\nProfesional:\n------------\nRut : " + this.getRut() + "\nNombre : " + this.getNombre()
				+ "\nFecha de nacimiento : " + this.getFechaNacimiento() + "\nTitulo : " + titulo
				+ "\nFecha de ingreso: " + fechaIngreso + "\n\n";
	}
	
	//metodo utilizado para desplegar los datos de la instancia profesional por pantalla 
		@Override
		public void analizarUsuario() {
			super.analizarUsuario();
			System.out.println("Titulo: " + titulo);
			System.out.println("Fecha ingreso: " + fechaIngreso);
		}
}
