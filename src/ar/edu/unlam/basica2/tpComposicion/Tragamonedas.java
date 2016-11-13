package ar.edu.unlam.basica2.tpComposicion;

public class Tragamonedas {
	
	public Tambor tamborUno;
	public Tambor tamborDos;
	public Tambor tamborTres;
	
	public Tragamonedas() {
		this.tamborUno = new Tambor();
		this.tamborDos = new Tambor();
		this.tamborTres = new Tambor();
	}
	
	public void activar(){
		this.tamborUno.girar();
		this.tamborDos.girar();
		this.tamborTres.girar();
	}
	
	public Boolean gana(){
		return (this.tamborUno.getPosicion() == this.tamborDos.getPosicion()) &&
		        this.tamborUno.getPosicion() == (this.tamborTres.getPosicion()); 
	}
}
