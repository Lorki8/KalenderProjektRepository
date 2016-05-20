package viewcontrol;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * JTextFieldPanel
 * 
 *
 */
class MenuPanel extends JPanel {
	private JButton kalender_BTN;
	private JButton settings_BTN;

	// reference to the listener
	private Listener simpleListener;

	// reference to the frame
	private MenuFrame simpleFrame;
	private KalenderFrame simpleKFrame;
	private KalenderPanel simpleKPanel;
	private SettFrame simpleSFrame;

	public MenuPanel(MenuFrame simpleFrame, KalenderFrame kframe,KalenderPanel kpanel, SettFrame sframe) {

		// reference to the frame
		simpleKFrame=kframe;
		simpleKPanel=kpanel;
		this.simpleFrame=simpleFrame;
		simpleSFrame=sframe;
		simpleListener = new Listener(this, simpleFrame, simpleKFrame, simpleKPanel, simpleSFrame);

		kalender_BTN = new JButton("Kalender");
		settings_BTN = new JButton("Einstellungen");
		kalender_BTN.addActionListener(simpleListener);
		settings_BTN.addActionListener(simpleListener);

		JPanel Panel_PNL;
		Panel_PNL = new JPanel();
		Panel_PNL.setLayout(new GridLayout(3, 1));

		JLabel wel=new JLabel("Wilkommen", SwingConstants.CENTER);
		
		Panel_PNL.add(wel);
		Panel_PNL.add(kalender_BTN);
		Panel_PNL.add(settings_BTN);

		this.setLayout(new BorderLayout());

		this.add(Panel_PNL, BorderLayout.CENTER);
	}
	
	public void removeP(MenuPanel p){
		simpleFrame.remove(p);
	}

	/**
	 * @return the kalender_BTN
	 */
	public JButton getKalender_BTN() {
		return kalender_BTN;
	}


	/**
	 * @param kalender_BTN the kalender_BTN to set
	 */
	public void setKalender_BTN(JButton kalender_BTN) {
		this.kalender_BTN = kalender_BTN;
	}


	/**
	 * @return the settings_BTN
	 */
	public JButton getSettings_BTN() {
		return settings_BTN;
	}


	/**
	 * @param settings_BTN the settings_BTN to set
	 */
	public void setSettings_BTN(JButton settings_BTN) {
		this.settings_BTN = settings_BTN;
	}


	/**
	 * @return the simpleListener
	 */
	public Listener getSimpleListener() {
		return simpleListener;
	}


	/**
	 * @param simpleListener the simpleListener to set
	 */
	public void setSimpleListener(Listener simpleListener) {
		this.simpleListener = simpleListener;
	}


	/**
	 * @return the simpleFrame
	 */
	public MenuFrame getSimpleFrame() {
		return simpleFrame;
	}


	/**
	 * @param simpleFrame the simpleFrame to set
	 */
	public void setSimpleFrame(MenuFrame simpleFrame) {
		this.simpleFrame = simpleFrame;
	}

}
