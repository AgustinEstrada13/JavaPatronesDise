package negocio;
import comportamientos.NoVuelo;


public class Pinguino extends Ave{
	
	public Pinguino() {
		comportambientoVuelo = new NoVuelo();
	}
	
	
	
	
	public void mostrarInformacion() {
		System.out.println("Soy un pinguino");
	}
}
