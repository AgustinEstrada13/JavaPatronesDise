package factory;
import negocio.Chasis;
import negocio.ChasisGrande;
import negocio.Freno;
import negocio.FrenoElectrico;
import negocio.Motor;
import negocio.Motor120;

public class AutograndeFactory implements AutoFactory {
	
	public Chasis crearChasis() {
		return new ChasisGrande();
	}
	
	
	public Motor crearMotor() {
		return new Motor120();
	}
	
	public Freno crearFreno() {
		return new FrenoElectrico();
	}
}