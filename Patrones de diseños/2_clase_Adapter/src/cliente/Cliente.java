package cliente;
import negocio.MotorCombustion;
import negocio.MotorElectrico;
import negocio.MotorGasolina;
import adapter.MotorElectricoAdapter;
public class Cliente {

	public static void main(String args[]) {
		MotorCombustion motorGasolina = new MotorGasolina();
		test(motorGasolina);
		System.out.println("-------");
	
		
		
		MotorElectrico motorElectrico = new MotorElectrico();
		
		MotorCombustion motorElectricoAdapter = new MotorElectricoAdapter(motorElectrico);
		test(motorElectricoAdapter);
	}
		
	public static void test(MotorCombustion motor) {
		motor.encender();
		motor.apagar();
		motor.acelerar();
	}
		
	
}
