package ar.edu.unlam.basica2.tpComposicion;

public class Tambor {
	private Integer posicion = 1;
	
	
	public void girar() {
		this.posicion = (int)(Math.random()*10+1);
		
	}
	
	public Integer getPosicion(){
		return this.posicion;
		
	}

}
