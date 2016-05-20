package viewcontrol;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class SettPanel extends JPanel{
	private Listener simpleListener;
	
	private MenuFrame mframe;
	private KalenderFrame kframe;
	private SettFrame sframe;
	
	private JTextField name;
	private JTextArea desc;
	private JTextField startTimeH;
	private JTextField endTimeH;
	private JTextField startTimeM;
	private JTextField endTimeM;
	
	private JButton ok;
	
	public SettPanel(MenuFrame m, KalenderFrame k, SettFrame s){
		sframe=s;
		kframe=k;
		mframe=m;
		
		this.setLayout(new BorderLayout());
		
		JPanel northPanel=new JPanel(new GridLayout(2,2,60,10));
		JLabel nameL=new JLabel("Name:");
		JLabel descL=new JLabel("Description:");
		name=new JTextField();
		desc=new JTextArea();
		northPanel.add(nameL);
		northPanel.add(name);
		northPanel.add(descL);
		northPanel.add(desc);
		
		JPanel centerPanel=new JPanel(new GridLayout(2,2,60,10));
		
		JPanel centerLabelPanel=new JPanel(new GridLayout(2, 1));
		JPanel centerTimePanel=new JPanel(new GridLayout(2, 2));
		JLabel startL=new JLabel("Start Time:", SwingConstants.CENTER);
		JLabel endL=new JLabel("End Time:", SwingConstants.CENTER);
		startTimeH= new JTextField("HH:MM");
		endTimeH=new JTextField();
		startTimeM=new JTextField();
		endTimeM=new JTextField();
		
		centerLabelPanel.add(startL);
		centerLabelPanel.add(endL);
		
		centerTimePanel.add(startTimeH);
		centerTimePanel.add(startTimeM);
		centerTimePanel.add(endTimeH);
		centerTimePanel.add(endTimeM);
		
		centerPanel.add(centerLabelPanel);
		centerPanel.add(centerTimePanel);
		
		ok=new JButton("OK");
		
		this.add(northPanel, BorderLayout.NORTH);
		this.add(centerPanel, BorderLayout.CENTER);
	}
}
