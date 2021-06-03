package display;

import control.ControlClima;
import control.Subject;

public class DisplayCondicionesActuales implements Observer {

        private float temperatura;
        private float humedad;

        private Subject controlClima;

        public DisplayCondicionesActuales(Subject subject) {
                this.controlClima = subject;
                controlClima.resgitrarObserver(this);
        }

        public void actualizar(Subject subject) {
                if (subject instanceof ControlClima) {
                        ControlClima c = (ControlClima) subject;
                        this.temperatura = c.getTemperatura();
                        this.humedad = c.getHumedad();

                        display();
                }
        }

        public void display() {
                System.out.println("Display Condiciones Actuales - Temperatura: " + temperatura + " - Humedad: " + humedad);
        }

        public void removerSujeto() {
                controlClima.eliminarObserver(this);
        }

        public void registrar() {
                controlClima.resgitrarObserver(this);
        }

		@Override
		public void actualizar(float temperatura, float humedad, float presion) {
			// TODO Auto-generated method stub
			
		}

}
