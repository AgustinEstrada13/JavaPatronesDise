package factory;
import negocio.Chasis;
import negocio.ChasisChico;
import negocio.Freno;
import negocio.FrenoAsistido;
import negocio.Motor;
import negocio.Motor100;

public class AutoChicoFactory implements AutoFactory {
	
	public Chasis crearChasis() {
		return new ChasisChico();
	}
	
	
	public Motor crearMotor() {
		return new Motor100();
	}
	
	public Freno crearFreno() {
		return new FrenoAsistido();
	}
}
