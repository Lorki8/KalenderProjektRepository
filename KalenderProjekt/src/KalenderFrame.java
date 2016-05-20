package viewcontrol;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Locale;

	public class KalenderFrame extends JFrame {
		private MenuPanel mpanel;
		private KalenderPanel panel;
		private MenuFrame menuFrame;
		private SettFrame sframe;
		private KalenderFrame thisSimpleFrame;
		private Listener simpleListener;
		private JMenuItem sett=new JMenuItem("Einstellungen", SwingConstants.CENTER);
		private JMenuItem leg=new JMenuItem("Legende", SwingConstants.CENTER);
		

		public KalenderFrame() throws UnsupportedLookAndFeelException { 
			thisSimpleFrame=this;
			sframe=new SettFrame();
			mpanel=new MenuPanel(menuFrame, thisSimpleFrame,  panel, sframe);
			simpleListener=new Listener(mpanel, menuFrame, this, panel, sframe);

			UIManager.setLookAndFeel(new javax.swing.plaf.metal.MetalLookAndFeel());			
			setTitle("Kalender"); 
			setSize(500, 400); 
			
			JMenuBar KalenderBar=new JMenuBar();
			
			sett.addActionListener(simpleListener);
			leg.addActionListener(simpleListener);
			
			KalenderBar.add(sett);
			KalenderBar.add(leg);
			setJMenuBar(KalenderBar);

			panel = new KalenderPanel(this, mpanel, menuFrame, sframe);
			add(panel);
			this.setResizable(true);

			setVisible(false); 


		}
		
		/**
		 * 
		 * @param iconFile
		 */
		private void assignIcon(String iconFile) {
			Image img = getToolkit().getImage(iconFile);
			setIconImage(img);
		}

		
		/**
		 * @return the panel
		 */
		public KalenderPanel getPanel() {
			return panel;
		}

		/**
		 * @return the sett
		 */
		
		/**
		 * @return the mpanel
		 */
		public MenuPanel getMpanel() {
			return mpanel;
		}

		/**
		 * @param mpanel the mpanel to set
		 */
		public void setMpanel(MenuPanel mpanel) {
			this.mpanel = mpanel;
		}

		/**
		 * @return the menuFrame
		 */
		public MenuFrame getMenuFrame() {
			return menuFrame;
		}

		/**
		 * @param menuFrame the menuFrame to set
		 */
		public void setMenuFrame(MenuFrame menuFrame) {
			this.menuFrame = menuFrame;
		}

		/**
		 * @return the sframe
		 */
		public SettFrame getSframe() {
			return sframe;
		}

		/**
		 * @param sframe the sframe to set
		 */
		public void setSframe(SettFrame sframe) {
			this.sframe = sframe;
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
		 * @param panel the panel to set
		 */
		public void setPanel(KalenderPanel panel) {
			this.panel = panel;
		}

		/**
		 * @return the sett
		 */
		public JMenuItem getSett() {
			return sett;
		}

		/**
		 * @param sett the sett to set
		 */
		public void setSett(JMenuItem sett) {
			this.sett = sett;
		}

		/**
		 * @return the leg
		 */
		public JMenuItem getLeg() {
			return leg;
		}

		/**
		 * @param leg the leg to set
		 */
		public void setLeg(JMenuItem leg) {
			this.leg = leg;
		}

		

		/**
		 * @return the thisSimpleFrame
		 */
		public KalenderFrame getThisSimpleFrame() {
			return thisSimpleFrame;
		}

		/**
		 * @param thisSimpleFrame the thisSimpleFrame to set
		 */
		public void setThisSimpleFrame(KalenderFrame thisSimpleFrame) {
			this.thisSimpleFrame = thisSimpleFrame;
		}
		
	}
