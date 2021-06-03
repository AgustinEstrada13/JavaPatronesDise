package negocio;

import comportamientos.VueloElevado;

public class Canario extends Ave {
	
	public Canario() {
		comportambientoVuelo = new VueloElevado();
	}
	
	public void mostrarInformacion() {
		System.out.println("Soy un canario");
	}
}
