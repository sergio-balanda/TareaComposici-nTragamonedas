package ar.edu.unlam.basica2.tpComposicion;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.basica2.tpComposicion.Tragamonedas;

public class Tragamoneda {

	@Test
	public void testTragamonedas() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		Integer posicionTamborUno = miTragamonedas.tamborUno.getPosicion();
		Integer posicionTamborDos = miTragamonedas.tamborDos.getPosicion();
		Integer posicionTamborTres = miTragamonedas.tamborTres.getPosicion();
		assertTrue(
				(posicionTamborUno >= 1 && posicionTamborUno <= 10) &&
				(posicionTamborDos >= 1 && posicionTamborDos <= 10) &&
				(posicionTamborTres >= 1 && posicionTamborTres <= 10) 
				);
		 
	}
	@Test
	public void testQueLosTamboresEstenEnUno(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		Integer valorEsperado = 1;
		assertEquals(valorEsperado, miTragamonedas.tamborUno.getPosicion());
		assertEquals(valorEsperado, miTragamonedas.tamborDos.getPosicion());
		assertEquals(valorEsperado, miTragamonedas.tamborTres.getPosicion());
	}
	
	@Test 
	public void tesPremio(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		
		while (miTragamonedas.gana() == false){
			assertFalse(miTragamonedas.gana());
			miTragamonedas.activar();
		}
		if (miTragamonedas.gana() == true){
			assertTrue(miTragamonedas.gana());
		}
	}
	
	@Test
	public void testNumeroAleatorio(){
	Tragamonedas miTragamonedas = new Tragamonedas();
	miTragamonedas.activar();
	Integer numeroAleatorio = miTragamonedas.tamborUno.getPosicion();
	assertTrue(numeroAleatorio >= 1 && numeroAleatorio <= 10);
	}

}
