package controlador;

import modelo.BeatModelInterface;
import vista.DJView;

public class BeatController implements ControllerInterface {

	private BeatModelInterface model;
	private DJView view;

	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.inicializar();
	}

	public void start() {
		// ADD
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	public void stop() {
		// ADD
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	public void incrementarBPM() {
		// ADD

	}

	public void disminuirBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm - 1);
	}

	public void setBPM(int bpm) {
		// ADD
	}

}