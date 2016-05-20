package viewcontrol;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Locale;

	public class SettFrame extends JFrame {
		private KalenderPanel kpanel;
		private SettPanel panel;

		private KalenderFrame kframe;
		private MenuFrame mframe;
		private SettFrame thisSimpleFrame;

		public SettFrame() throws UnsupportedLookAndFeelException { 
			thisSimpleFrame=this;	

			UIManager.setLookAndFeel(new javax.swing.plaf.metal.MetalLookAndFeel());			
			setTitle("Einstellungen");
			setSize(280, 400); 
			
			panel = new SettPanel(mframe, kframe, thisSimpleFrame);
			add(panel);
			
		    this.setResizable(false);
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
		 * @return the kpanel
		 */
		public KalenderPanel getKpanel() {
			return kpanel;
		}

		/**
		 * @param kpanel the kpanel to set
		 */
		public void setKpanel(KalenderPanel kpanel) {
			this.kpanel = kpanel;
		}

		/**
		 * @return the panel
		 */
		public SettPanel getPanel() {
			return panel;
		}

		/**
		 * @param panel the panel to set
		 */
		public void setPanel(SettPanel panel) {
			this.panel = panel;
		}

		/**
		 * @return the thisSimpleFrame
		 */
		public SettFrame getThisSimpleFrame() {
			return thisSimpleFrame;
		}

		/**
		 * @param thisSimpleFrame the thisSimpleFrame to set
		 */
		public void setThisSimpleFrame(SettFrame thisSimpleFrame) {
			this.thisSimpleFrame = thisSimpleFrame;
		}
		
	}
