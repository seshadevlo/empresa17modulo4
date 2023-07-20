package main.java.cl.equipo3.asesorias.models;

import java.util.ArrayList;
import java.util.List;

import main.java.cl.equipo3.asesorias.IAsesorias.IAsesorias;


public class Listado extends Usuario{
	
	private List<IAsesorias> asesorias;
	
	//contenedor con listas para almacenar instancias 
	
	public Listado() {
		asesorias = new ArrayList<>();
	}
    
	//metodo utilizado para almacenar una instancia de clientes 

	public void almacenarCliente(Cliente cliente) {
		asesorias.add(cliente);
	}
	
	//metodo utilizado para almacenar una instancia de profesionales 

	public void almacenarProfesional(Profesional profesional) {
		asesorias.add(profesional);
	}
	//metodo utilizado para almacenar una instancia de administrativo
	 
	public void almacenarAdministrativo(Administrativo administrativo) {
		asesorias.add(administrativo);
	}
	
	// metodo utilizado para mostrar en consola los usuarios registrados 
	 
	public void listarUsuarios() {
		int contadorInstancia;
		contadorInstancia = 0;
		for (IAsesorias asesoria : asesorias) {
			if (asesoria instanceof Usuario) {
				System.out.print(asesoria);
				contadorInstancia++;
			}
		}
		if (contadorInstancia == 0) {
			System.out.println("NO EXISTEN REGISTROS PARA MOSTRAR");
		}
	}
}
