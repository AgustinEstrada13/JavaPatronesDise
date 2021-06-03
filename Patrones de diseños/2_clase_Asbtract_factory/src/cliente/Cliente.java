package cliente;
import factory.AutoChicoFactory;
import factory.AutoFactory;
import factory.AutograndeFactory;
import negocio.Chasis;
import negocio.Freno;
import negocio.Motor;
public class Cliente {
	
	
	public static void main(String args[]) {
		Cliente cliente = new Cliente();
		
		AutoFactory autoChicoFactory = new AutoChicoFactory();
		cliente.fabricarAuto(autoChicoFactory);
		
		AutoFactory autoGrandeFactory = new AutograndeFactory();
		cliente.fabricarAuto(autoGrandeFactory);
		
	}	
		
		public void fabricarAuto(AutoFactory factory) {
			
			Motor motor = factory.crearMotor();
			Chasis chasis = factory.crearChasis();
			Freno freno = factory.crearFreno();
			
					
			
			
			
			System.out.println("Construyendo auto con" + "motor: " + motor + "chasis: " + chasis + "Frenos: "+ freno);
		}
		
		
		
		
		
		
	
	
	
	
	
	
}
