package main.java.cl.equipo3.asesorias.models;

// declaramos la clase cliente 
public class Cliente extends Usuario {

	private String rut = "192089794";
	private String nombres = "sebas";
	private String apellidos = "hernas";
	private String telefono = "789837654";
	private String afp = "modelo";
	private String sistemaSalud = "Isapre";
	private String direccion = "";
	private String comuna = "maipu";
	private int edad = 27;

	// Constructor vacio
	public Cliente() {
	}
	//constructor con parametros aptos para nuevos datos
	public Cliente(String nombre, String fechaNacimiento, String rut, String nombres, String apellidos, String telefono,
			String afp, String sistemaSalud, String direccion, String comuna, int edad) {

		super(nombre, fechaNacimiento, rut);

		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	//getters and setters
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public String getSistemaSalud() {
		return sistemaSalud;
	}
	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//metodo utilizado para dar formato a nombre y apellidos 
	public void obtenerNombre() {
		System.out.println(nombres + " " + apellidos);
	}
	//metodo utilizado para definir el tipo de sistema de salud 
	public void obtenerSistemaSalud() {
		if (sistemaSalud == "1") {
			System.out.println("Su sistema de salud es FONASA");
		} else {
			System.out.println("Su sistema de salud es ISAPRE");
		}
	}

	//metodo utilizado para desplegar los datos por pantalla 
	@Override
	public String toString() {

		return "\nCliente:\n---------\nRut: " + rut + "\nNombres: " + nombres + "\nApellidos: " + apellidos
				+ "\nTelefono: " + telefono + "\nAfp: " + afp + "\nSistema Salud: " + sistemaSalud + "\nDireccion: "
				+ direccion + "\nComuna: " + comuna + "\nEdad: " + edad + "\nNombre usuario: " + this.getNombre()
				+ "\n\n";
	}

	//metodo utilizado para desplegar los datos de la instancia cliente por pantalla 
	@Override
	public void analizarUsuario() {
		System.out.println("Datos de usuario : \n");
		super.analizarUsuario();
		System.out.println("--------------------");
		System.out.println(direccion);
		System.out.println(comuna);
	}
}