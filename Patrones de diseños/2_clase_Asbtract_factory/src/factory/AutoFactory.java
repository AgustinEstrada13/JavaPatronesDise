package factory;
import negocio.Motor;
import negocio.Chasis;
import negocio.Freno;

public interface AutoFactory {
	public Chasis crearChasis();
	public Motor crearMotor();
	public Freno crearFreno();
	
}
