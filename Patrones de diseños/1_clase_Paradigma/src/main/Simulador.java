package main;

import comportamientos.VueloElevado;
import negocio.Ave;
import negocio.Canario;
import negocio.Halcon;
import negocio.Pinguino;

public class Simulador {

	public static void main(String[] args) {
		Ave canario = new Canario();
		canario.mostrarInformacion();
		canario.dormir();
		canario.ejecutarVuelo();
		
		System.out.println();
		
		Ave halcon = new Halcon();
		halcon.mostrarInformacion();
		halcon.descansar();
		halcon.ejecutarVuelo();
		
		System.out.println();
		
		Ave pinguino = new Pinguino();
		pinguino.mostrarInformacion();
		pinguino.descansar();
		pinguino.ejecutarVuelo();
		
		System.out.println();
		
		
		//cambio dinamico del comportamiento del pinguino
		pinguino.setComportamientoVuelo(new VueloElevado());
		pinguino.mostrarInformacion();
		pinguino.ejecutarVuelo();
	}

	
	
	
}
