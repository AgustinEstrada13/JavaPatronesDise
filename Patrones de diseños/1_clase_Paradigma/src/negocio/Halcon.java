package negocio;
import comportamientos.VueloElevado;
public class Halcon extends Ave {
	
	public Halcon() {
		comportambientoVuelo = new VueloElevado();
	}
	
	public void mostrarInformacion() {
		System.out.println("Soy un halcon");
	}
}
