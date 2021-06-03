package control;


import java.util.ArrayList;
import java.util.List;

import display.Observer;

public class ControlClima implements Subject {

        private float temperatura;
        private float humedad;
        private float presion;

        private List<Observer> observers;

        public ControlClima() {
                observers = new ArrayList<Observer>();
        }

       
		public void resgitrarObserver(Observer o) {
		
			observers.add(o);
		}

        public void eliminarObserver(Observer o) {
                observers.remove(o);
        }

        // Modelo Push
        public void notificarObservers() {
                for (Observer o : observers) {
                        o.actualizar(temperatura, humedad, presion);
                }
        }

        public void cambioDatos() {
                notificarObservers();
        }

        // Este m�todo tiene como prop�sito poder testear la aplicaci�n
        public void setDatos(float temperatura, float humedad, float presion) {
                this.temperatura = temperatura;
                this.humedad = humedad;
                this.presion = presion;
                cambioDatos();
        }

        public float getHumedad() {
                return humedad;
        }

        public float getPresion() {
                return presion;
        }

        public float getTemperatura() {
                return temperatura;
        }

		

}