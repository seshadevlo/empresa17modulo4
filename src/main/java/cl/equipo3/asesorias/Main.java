package main.java.cl.equipo3.asesorias;

import main.java.cl.equipo3.asesorias.models.Capacitacion;
import main.java.cl.equipo3.asesorias.models.Cliente;
import main.java.cl.equipo3.asesorias.models.Usuario;
import main.java.cl.equipo3.asesorias.models.Administrativo;
import main.java.cl.equipo3.asesorias.models.Profesional;
import main.java.cl.equipo3.asesorias.IAsesorias.IAsesorias;
import main.java.cl.equipo3.asesorias.models.Listado;


public class Main  {
	
	// Se crea una instancia de Listado
	static Listado listado = new Listado();
	
	public static void main(String[] args) {
	
        // Se crean cinco instancias de diferentes tipos de usuarios (3 clientes administrativos, 1 profesional y un cliente)
        
        Administrativo usuario1 = new Administrativo();// aqui utilizamos el principio de rsponsabilidad unica, al crear las instancias por separado  
        Administrativo usuario2 = new Administrativo();
        Administrativo usuario3 = new Administrativo();
        Profesional usuario4 = new Profesional();
        Cliente usuario5 = new Cliente();
        
        //utilizamos sangrias para la mejor visualizacion del codigo
        //Almacenamos los registros
        
        listado.almacenarAdministrativo(usuario1);
        listado.almacenarAdministrativo(usuario2);
        listado.almacenarAdministrativo(usuario3);
        listado.almacenarProfesional(usuario4);
        listado.almacenarCliente(usuario5);
        
        //listamos los datos almacenados 
        listado.listarUsuarios();
 }
//utilizamos el principio de sustitucion de liskov para visualizar los datos contenidos tanto en la clase padre como en sus hijos.
}