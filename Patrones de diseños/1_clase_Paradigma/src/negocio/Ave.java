package negocio;

import comportamientos.ComportamientoVuelo;


public abstract class Ave {
	
	protected ComportamientoVuelo comportambientoVuelo;

	public abstract void mostrarInformacion();
	
	public void descansar() {
		System.out.println("Estoy descansando");
	}
	
	public void dormir() {
		System.out.println("Estoy durmiendo");
		
	}
	
	public void ejecutarVuelo() {
		comportambientoVuelo.volar();
	}
	
	public void setComportamientoVuelo(ComportamientoVuelo cVuelo) {
		comportambientoVuelo = cVuelo;
	}
	
	
}
