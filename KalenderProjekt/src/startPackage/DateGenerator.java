package startPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class DateGenerator{
	private ArrayList<Calendar> daysFut;
	private ArrayList<Calendar> daysPast;
	private ArrayList<Calendar> calendarWithPast;
	public DateGenerator() {
		daysFut = new ArrayList<Calendar>();
		daysPast = new ArrayList<Calendar>();
		calendarWithPast = new ArrayList<Calendar>();
		genDateTo(1, 1);
	}

	public ArrayList<Calendar> genDateTo(int yearsFut, int yearsPast) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MMMMMMMMMM yyyy");
		for (int i = 0; i < (yearsFut * 365); i++) {
			Calendar dateNow = Calendar.getInstance();
			daysFut.add(dateNow);
			dateNow.add(Calendar.DATE, i);
			
		}
		for (int i = 0; i < (yearsPast * 365); i++) {
			Calendar dateNow = Calendar.getInstance();
			daysPast.add(dateNow);
			dateNow.add(Calendar.DATE, (i * -1));
			
		}
		calendarWithPast.addAll(daysPast);
		calendarWithPast.addAll(daysFut);
		Collections.sort(calendarWithPast);
		return daysFut;
		// this works already
	}
	
	public void storeInFile(){
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(int i=0;i<calendarWithPast.size();i++){
				oos.writeObject(calendarWithPast.get(i));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	private ArrayList<Calendar> getDaysFut() {
		return daysFut;
	}

	private void setDaysFut(ArrayList<Calendar> daysFut) {
		this.daysFut = daysFut;
	}

	private ArrayList<Calendar> getDaysPast() {
		return daysPast;
	}

	private void setDaysPast(ArrayList<Calendar> daysPast) {
		this.daysPast = daysPast;
	}

	private ArrayList<Calendar> getCalendarWithPast() {
		return calendarWithPast;
	}

	private void setCalendarWithPast(ArrayList<Calendar> calendarWithPast) {
		this.calendarWithPast = calendarWithPast;
	}

	public void print() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MMMMMMMMMM yyyy");
		for (int i = 0; i < calendarWithPast.size()-1; i++) {
			System.out.println("Date: " + sdf.format(calendarWithPast.get(i).getTime()));
		}
	}

	

}