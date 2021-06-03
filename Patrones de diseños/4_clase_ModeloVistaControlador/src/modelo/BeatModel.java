package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.*;
import vista.BPMObserver;
import vista.BeatObserver;

public class BeatModel implements BeatModelInterface, MetaEventListener {

	// beats por minuto
	private int bpm = 90;

	// atributos para la configuraci�n de MIDI
	private Sequencer sequencer;
	private Sequence sequence;
	private Track track;

	// ADD observers lists
	private ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    private ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	

	// M�todo para registrar un BeatObserver
	public void registrarObserver(BeatObserver o) {
		// ADD
		beatObservers.remove(o);
	}
	
	// M�todo para remover un BeatObserver
	public void removerObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}

	// M�todo para notificar a los BeatObserver
	public void notificarBeatObservers() {
		// ADD
		for(BeatObserver o: beatObservers) {
			o.actualizarBeat();
		}
		
	}

	// M�todo para registrar un BPMObserver
	public void registrarObserver(BPMObserver o) {
		// ADD
		
	}
	
	// M�todo para remover un BPMObserver
	public void removerObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

	// M�todo para notificar a los BPMObserver
	public void notificarBPMObservers() {
		// ADD
	}
	
	public void inicializar() {
		configurarMidi();
		buildTrackAndStart();
	}
	
	public void on() {
		sequencer.start();
		setBPM(90);
	}
	
	public void off() {
		sequencer.stop();
		setBPM(0);
	}
	
	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		//ADD
	}
	
	public int getBPM() {
		return bpm;
	}
	
	private void beatEvent() {
		// ADD
	}
	
	/* Configuraci�n MIDI - inicio */
	// M�todo para capturar eventos MIDI
	public void meta(MetaMessage message) {
		if (message.getType() == 47) {
			beatEvent();
			sequencer.setTickPosition(0);
			setBPM(getBPM());
			sequencer.start();
		}
	}

	public void configurarMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void buildTrackAndStart() {
		int[] trackList = { 35, 0, 46, 0 };

		sequence.deleteTrack(null);
		track = sequence.createTrack();

		makeTracks(trackList);
		track.add(makeEvent(192, 9, 1, 0, 4));
		try {
			sequencer.setSequence(sequence);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void makeTracks(int[] list) {

		for (int i = 0; i < list.length; i++) {
			int key = list[i];

			if (key != 0) {
				track.add(makeEvent(144, 9, key, 100, i));
				track.add(makeEvent(128, 9, key, 100, i + 1));
			}
		}
	}

	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return event;
	}
	/* Configuraci�n MIDI - fin */

}