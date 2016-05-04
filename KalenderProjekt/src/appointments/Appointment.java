package appointments;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Calendar;

import users.Account;

public abstract class Appointment {
	private Calendar startTime;
	private Calendar endTime;
	private boolean remind;
	private String title;
	private String information;
	private Image img;
	private ArrayList<Account> participators;
	  
	
	
	public Appointment(Calendar startTime, Calendar endTime, boolean remind, String title, String information,
			Image img) {
		super();
		setStartTime(startTime);
		setEndTime(endTime);
		setRemind(remind);
		setTitle(title);
		setInformation(information);
		setImg(img);
	}
	public void huhu(){
		
	}
	public abstract boolean changeStartTime(Calendar newTime);
	public abstract boolean changeStartTime(Calendar newTime,String reason);
	public abstract boolean changeEndTime(Calendar newTime,String reason);
	public abstract boolean changeRemind();
	public abstract boolean changeTitle(String newTitle);
	public abstract boolean changeInformation(String newInformation);
	public abstract boolean changeImg(Image newImg);
	
	public Calendar getStartTime() {
		return startTime;
	}
	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}
	public Calendar getEndTime() {
		return endTime;
	}
	public void setEndTime(Calendar endTime) {
		this.endTime = endTime;
	}
	public boolean isRemind() {
		return remind;
	}
	public void setRemind(boolean remind) {
		this.remind = remind;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	
}
