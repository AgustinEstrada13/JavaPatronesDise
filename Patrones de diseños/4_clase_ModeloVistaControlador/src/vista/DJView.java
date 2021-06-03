package vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controlador.ControllerInterface;
import modelo.BeatModelInterface;
import util.BeatBar;

public class DJView implements ActionListener /* ADD */ {

	// ADD Model
	// ADD Controller

	private JFrame viewFrame;
	private JPanel viewPanel;
	private BeatBar beatBar;
	private JLabel bpmOutputLabel;
	private JFrame controlFrame;
	private JPanel controlPanel;
	private JLabel bpmLabel;
	private JTextField bpmTextField;
	private JButton setBPMButton;
	private JButton increaseBPMButton;
	private JButton decreaseBPMButton;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem startMenuItem;
	private JMenuItem stopMenuItem;

	public DJView(ControllerInterface controller, BeatModelInterface model) {
		this.controller = controller;
		this.model = model;
		// ADD
	}

	public void createView() {
		// Create all Swing components here
		viewPanel = new JPanel(new GridLayout(1, 2));
		viewFrame = new JFrame("View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setSize(new Dimension(100, 80));
		bpmOutputLabel = new JLabel("Detenido", SwingConstants.CENTER);
		beatBar = new BeatBar();
		beatBar.setValue(20);
		JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
		bpmPanel.add(beatBar);
		bpmPanel.add(bpmOutputLabel);
		viewPanel.add(bpmPanel);
		viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
		viewFrame.pack();
		viewFrame.setVisible(true);
	}

	public void createControls() {
		// Create all Swing components here
		JFrame.setDefaultLookAndFeelDecorated(true);
		controlFrame = new JFrame("Control");
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.setSize(new Dimension(100, 80));

		controlPanel = new JPanel(new GridLayout(1, 2));

		menuBar = new JMenuBar();
		menu = new JMenu("DJ Control");
		startMenuItem = new JMenuItem("Iniciar");
		menu.add(startMenuItem);
		startMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				controller.start();
			}
		});
		stopMenuItem = new JMenuItem("Detener");
		menu.add(stopMenuItem);
		stopMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				controller.stop();
			}
		});
		JMenuItem exit = new JMenuItem("Salir");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		menu.add(exit);
		menuBar.add(menu);
		controlFrame.setJMenuBar(menuBar);

		bpmTextField = new JTextField(2);
		bpmLabel = new JLabel("Ingresar BPM:", SwingConstants.RIGHT);
		setBPMButton = new JButton("Set");
		setBPMButton.setSize(new Dimension(10, 40));
		increaseBPMButton = new JButton(">>");
		decreaseBPMButton = new JButton("<<");
		setBPMButton.addActionListener(this);
		increaseBPMButton.addActionListener(this);
		decreaseBPMButton.addActionListener(this);

		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

		buttonPanel.add(decreaseBPMButton);
		buttonPanel.add(increaseBPMButton);

		JPanel enterPanel = new JPanel(new GridLayout(1, 2));
		enterPanel.add(bpmLabel);
		enterPanel.add(bpmTextField);
		JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
		insideControlPanel.add(enterPanel);
		insideControlPanel.add(setBPMButton);
		insideControlPanel.add(buttonPanel);
		controlPanel.add(insideControlPanel);

		bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		controlFrame.getRootPane().setDefaultButton(setBPMButton);
		controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

		controlFrame.pack();
		controlFrame.setVisible(true);
	}

	public void enableStopMenuItem() {
		stopMenuItem.setEnabled(true);
	}

	public void disableStopMenuItem() {
		stopMenuItem.setEnabled(false);
	}

	public void enableStartMenuItem() {
		startMenuItem.setEnabled(true);
	}

	public void disableStartMenuItem() {
		startMenuItem.setEnabled(false);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == setBPMButton) {
			// ADD
		} else if (event.getSource() == increaseBPMButton) {
			// ADD
		} else if (event.getSource() == decreaseBPMButton) {
			// ADD
		}
	}

	// ADD actualizarBPM()

	// ADD actualizarBeat()

}