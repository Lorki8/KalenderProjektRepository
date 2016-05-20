package viewcontrol;

import javax.swing.JButton;

public class DateButton extends JButton{
	private int id;
	
	public DateButton(int i){
		id=i;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
