package viewcontrol;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Locale;

import javax.swing.*;

/**
 * 
 * JTextFieldListener
 *
 */
public class Listener implements ActionListener {

	// Reference to the graphical components
    private MenuPanel mpanel;
    private MenuFrame frame;
    
    private KalenderPanel kpanel;
    private KalenderFrame kframe;
    
    private SettFrame sframe;
   
    public Listener(MenuPanel p, MenuFrame fr, KalenderFrame kfr, KalenderPanel kp, SettFrame sfr){
        mpanel=p;
        frame=fr;
        kframe=kfr;
        kpanel=kp;
        sframe=sfr;
    }

	public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object source = e.getSource();
        
        if (source==mpanel.getKalender_BTN()){
        	kframe.setVisible(true);
        	frame.setVisible(false);
        }
        if(source==mpanel.getSettings_BTN()){
        	sframe.setVisible(true);
        	frame.setVisible(false);
        }
        if(source==kframe.getSett()){
        	sframe.setVisible(true);
        	kframe.setVisible(false);
        }
        
        if(source==kpanel.getTwo()){
        	sframe.setVisible(true);
        }
        if(source==kpanel.getThree()){
        	sframe.setVisible(true);
        }
        if(source==kpanel.getFour()){
        	sframe.setVisible(true);
        }
        if(source==kpanel.getOne()){
        	sframe.setVisible(true);
        }
        if(source==kpanel.getOne()){
        	sframe.setVisible(true);
        }
        if(source==kpanel.getOne()){
        	sframe.setVisible(true);
        }
     }
}
