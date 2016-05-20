package viewcontrol;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 * StartFrameTest
 *
 */
public class MenuFrameTest {
    public static void main(String[] args){
		UIManager.LookAndFeelInfo laf[] = UIManager.getInstalledLookAndFeels();
		SwingUtilities.invokeLater(new Runnable() {
    	    public void run() {
    	    	KalenderFrame frame = null;
				try {
					frame = new KalenderFrame();
				} catch (UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    }
	    });
		SwingUtilities.invokeLater(new Runnable() {
    	    public void run() {
    	    	 MenuFrame mFrame;
				try {
					mFrame = new MenuFrame();
	    	        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	    }
    	});

           
   }
}
