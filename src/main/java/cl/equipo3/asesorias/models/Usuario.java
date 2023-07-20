package main.java.cl.equipo3.asesorias.models;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import main.java.cl.equipo3.asesorias.IAsesorias.IAsesorias;

public class Usuario implements IAsesorias {

	private String nombre = "sebas";
	private String fechaNacimiento = "14  de junio de 1996";
	private String rut = "192089794";

	// Constructor vacio
	public Usuario() {
	}

	//constructor con parametros aptos para nuevos datos
	public Usuario(String nombre, String fechaNacimiento, String rut) {

		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	//metodo utilizado para desplegar los datos por pantalla 
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + rut + "]";
	}

	//metodo utilizado para dar formato a la edad y mostrarlo en pantalla 
	public void mostrarEdad(String fechaNacimiento) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);

		System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(), periodo.getMonths(),
				periodo.getDays());
	}

	//metodo utilizado para desplegar los datos de la instancia usuario por pantalla 
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre : " + nombre);
	}
}