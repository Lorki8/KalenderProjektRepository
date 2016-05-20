package viewcontrol;

	import javax.swing.*;


	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Locale;

	/**
	 * StartFrame
	 * 
	 *
	 */
	public class MenuFrame extends JFrame {
		private KalenderPanel kpanel;
		private MenuPanel panel;

		private KalenderFrame kframe;
		private SettFrame sframe;
		private MenuFrame thisSimpleFrame;

		public MenuFrame() throws UnsupportedLookAndFeelException { 
			thisSimpleFrame=this;	
			sframe=new SettFrame();
			kframe=new KalenderFrame();
			UIManager.setLookAndFeel(new javax.swing.plaf.metal.MetalLookAndFeel());			
			setTitle("Menü"); 
			setSize(280, 400); 
			
			panel = new MenuPanel(this, kframe, kpanel, sframe);
			add(panel);
			
		    this.setResizable(false);

			setVisible(true); 


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
		public MenuPanel getPanel() {
			return panel;
		}

		/**
		 * @param panel the panel to set
		 */
		public void setPanel(MenuPanel panel) {
			this.panel = panel;
		}

		/**
		 * @return the thisSimpleFrame
		 */
		public MenuFrame getThisSimpleFrame() {
			return thisSimpleFrame;
		}

		/**
		 * @param thisSimpleFrame the thisSimpleFrame to set
		 */
		public void setThisSimpleFrame(MenuFrame thisSimpleFrame) {
			this.thisSimpleFrame = thisSimpleFrame;
		}
		
	}
