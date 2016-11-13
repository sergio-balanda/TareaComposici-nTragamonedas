package ar.edu.unlam.basica2.tpComposicion;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.basica2.tpComposicion.Tambor;

public class testTambor {

	@Test
	public void testTambor() {
		Tambor miTambor = new Tambor();
		miTambor.girar();
		System.out.println("La posicion al azar: " + miTambor.getPosicion());
	}

}
