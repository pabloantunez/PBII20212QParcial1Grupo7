package ar.edu.unlam.pb2.Parcial1;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class PeliculaTest {

	@Test
	public void sePudoCrearUnaPelicula() {
		String nombre, dia, horario;
		TipoGenero genero;
		TipoClasificacion clasificacion;
		TipoSala sala;

		Pelicula pelicula = new Pelicula(nombre, genero, clasificacion);
		assertNotNull(pelicula);
	}
	
	@Test
	public void sePudoAsignarLaPeliculaALaSala () {
		Pelicula pelicula = new Pelicula("Rambo", TipoGenero.ACCION, TipoClasificacion.MAYORES_16);
		Boolean valorEsperado = true;
		Boolean valorObtenido = pelicula.asignarPeliculaASala();
	}
}
