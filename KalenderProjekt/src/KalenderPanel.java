package viewcontrol;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.util.Random;

class KalenderPanel extends JPanel {
	private JButton prev_BTN;
	private JButton next_BTN;

	private DateButton[] arr=new DateButton[37];

	private Border border = BorderFactory.createLineBorder(Color.CYAN, 5);
	private Border gray = BorderFactory.createLineBorder(Color.GRAY, 5);
	private Border lgray = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5);


	private JLabel month = new JLabel("Month", SwingConstants.CENTER); //monatsmethode

	private Listener simpleListener;

	private KalenderFrame simpleFrame;
	private MenuFrame mfr;
	private MenuPanel mfp;
	private SettFrame sfr;

	private DateButton one;
	private DateButton two;
	private DateButton three;
	private DateButton four;
	private DateButton five;
	private DateButton six;
	private DateButton seven;
	private DateButton eight;
	private DateButton nine;
	private DateButton ten;
	private DateButton eleven;
	private DateButton twelve;
	private DateButton thirteen;
	private DateButton fourteen;
	private DateButton fifteen;
	private DateButton sixteen;
	private DateButton seventeen;
	private DateButton eighteen;
	private DateButton nineteen;
	private DateButton twenty;
	private DateButton twentyone;
	private DateButton twentytwo;
	private DateButton twentythree;
	private DateButton twentyfour;
	private DateButton twentyfive;
	private DateButton twentysix;
	private DateButton twentyseven;
	private DateButton twentyeight;
	private DateButton twentynine;
	private DateButton thirty;
	private DateButton thirtyone;
	private DateButton thirtytwo;
	private DateButton thirtythree;
	private DateButton thirtyfour;
	private DateButton thirtyfive;
	private DateButton thirtysix;
	private DateButton thirtyseven;

	public KalenderPanel(KalenderFrame frame, MenuPanel menup, MenuFrame menufr, SettFrame sf) {
		mfp=menup;
		sfr=sf;
		mfr=menufr;
		this.simpleFrame=frame;
		simpleListener = new Listener(mfp, mfr, simpleFrame, this, sfr);

		prev_BTN = new JButton("<");
		next_BTN = new JButton(">");

		one = new DateButton ( 1 );
		two = new DateButton( 2 );
		three = new DateButton( 3 );
		four = new DateButton( 4 );
		five = new DateButton( 5 );
		six = new DateButton( 6 );
		seven = new DateButton( 7 );
		eight = new DateButton( 8 );
		nine = new DateButton( 9 );
		ten = new DateButton( 10 );
		eleven = new DateButton( 11 );
		twelve = new DateButton( 12 );
		thirteen = new DateButton( 13 );
		fourteen = new DateButton( 14 );
		fifteen = new DateButton( 15 );
		sixteen = new DateButton( 16 );
		seventeen = new DateButton( 17 );
		eighteen = new DateButton( 18 );
		nineteen = new DateButton( 19 );
		twenty = new DateButton( 20 );
		twentyone = new DateButton( 21 );
		twentytwo = new DateButton( 22 );
		twentythree = new DateButton( 23 );
		twentyfour = new DateButton( 24 );
		twentyfive = new DateButton( 25 );
		twentysix = new DateButton( 26 );
		twentyseven = new DateButton( 27 );
		twentyeight = new DateButton( 28 );
		twentynine = new DateButton( 29 );
		thirty = new DateButton( 30 );
		thirtyone = new DateButton( 31 );
		thirtytwo = new DateButton( 32 );
		thirtythree = new DateButton( 33 );
		thirtyfour = new DateButton( 34 );
		thirtyfive = new DateButton( 35 );
		thirtysix = new DateButton( 36 );
		thirtyseven = new DateButton( 37 );

		prev_BTN.addActionListener(simpleListener);
		next_BTN.addActionListener(simpleListener);
		month.setOpaque(true);
		month.setBackground(Color.CYAN);

		JPanel top = new JPanel();
		top.setLayout(new BorderLayout());
		top.add(prev_BTN, BorderLayout.WEST);
		top.add(month, BorderLayout.CENTER);
		top.add(next_BTN, BorderLayout.EAST);

		JPanel dates = new JPanel();
		dates.setLayout(new GridLayout(7,0));

		JLabel mo = new JLabel("Mo", SwingConstants.CENTER);
		JLabel di = new JLabel("Di", SwingConstants.CENTER);
		JLabel mi = new JLabel("Mi", SwingConstants.CENTER);
		JLabel don = new JLabel("Do", SwingConstants.CENTER);
		JLabel fr = new JLabel("Fr", SwingConstants.CENTER);
		JLabel sa = new JLabel("Sa", SwingConstants.CENTER);
		JLabel so = new JLabel("So", SwingConstants.CENTER);

		dates.add(mo);
		dates.add(di);
		dates.add(mi);
		dates.add(don);
		dates.add(fr);
		dates.add(sa);
		dates.add(so);

		one.setOpaque(true);
		one.setBackground(Color.LIGHT_GRAY);
		one.setBorder(gray);

		//Tag Methode für Datum und ausgegraut falls der Tag noch im vorigen Monat ist
		two.setOpaque(true);
		two.setBorder(gray);
		three.setOpaque(true);
		three.setBorder(lgray);

		arr[0]=one;
		arr[1]=two;
		arr[2]=three;
		arr[3]=four;
		arr[4]=five;
		arr[5]=six;
		arr[6]=seven;
		arr[7]=eight;
		arr[8]=nine;
		arr[9]=ten;
		arr[10]=eleven;
		arr[11]=twelve;
		arr[12]=thirteen;
		arr[13]=fourteen;
		arr[14]=fifteen;
		arr[15]=sixteen;
		arr[16]=seventeen;
		arr[17]=eighteen;
		arr[18]=nineteen;
		arr[19]=twenty;
		arr[20]=twentyone;
		arr[21]=twentytwo;
		arr[22]=twentythree;
		arr[23]=twentyfour;
		arr[24]=twentyfive;
		arr[25]=twentysix;
		arr[26]=twentyseven;
		arr[27]=twentyeight;
		arr[28]=twentynine;
		arr[29]=thirty;
		arr[30]=thirtyone;
		arr[31]=thirtytwo;
		arr[32]=thirtythree;
		arr[33]=thirtyfour;
		arr[34]=thirtyfive;
		arr[35]=thirtysix;
		arr[36]=thirtyseven;

		nine.setBorder(border); //Eigene Klasse Monat pro Monat neue Methode für verschiedene Tage/Events
		thirteen.setBorder(border);
		twentyfive.setBorder(border);

		for(int i=0;i<37;i++){
			arr[i].addActionListener(simpleListener);
			arr[i].setText(String.valueOf(i+1));
			dates.add(arr[i]);
		}






		this.setLayout(new BorderLayout());
		this.add(top, BorderLayout.NORTH);
		this.add(dates, BorderLayout.CENTER);
	}

	/**
	 * @return the prev_BTN
	 */
	public JButton getPrev_BTN() {
		return prev_BTN;
	}

	/**
	 * @param prev_BTN the prev_BTN to set
	 */
	public void setPrev_BTN(JButton prev_BTN) {
		this.prev_BTN = prev_BTN;
	}

	/**
	 * @return the next_BTN
	 */
	public JButton getNext_BTN() {
		return next_BTN;
	}

	/**
	 * @param next_BTN the next_BTN to set
	 */
	public void setNext_BTN(JButton next_BTN) {
		this.next_BTN = next_BTN;
	}

	/**
	 * @return the arr
	 */
	public DateButton[] getArr() {
		return arr;
	}

	/**
	 * @param arr the arr to set
	 */
	public void setArr(DateButton[] arr) {
		this.arr = arr;
	}

	/**
	 * @return the border
	 */
	public Border getBorder() {
		return border;
	}

	/**
	 * @param border the border to set
	 */
	public void setBorder(Border border) {
		this.border = border;
	}

	/**
	 * @return the gray
	 */
	public Border getGray() {
		return gray;
	}

	/**
	 * @param gray the gray to set
	 */
	public void setGray(Border gray) {
		this.gray = gray;
	}

	/**
	 * @return the lgray
	 */
	public Border getLgray() {
		return lgray;
	}

	/**
	 * @param lgray the lgray to set
	 */
	public void setLgray(Border lgray) {
		this.lgray = lgray;
	}

	/**
	 * @return the month
	 */
	public JLabel getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(JLabel month) {
		this.month = month;
	}

	/**
	 * @return the simpleFrame
	 */
	public KalenderFrame getSimpleFrame() {
		return simpleFrame;
	}

	/**
	 * @param simpleFrame the simpleFrame to set
	 */
	public void setSimpleFrame(KalenderFrame simpleFrame) {
		this.simpleFrame = simpleFrame;
	}

	/**
	 * @return the one
	 */
	public DateButton getOne() {
		return one;
	}

	/**
	 * @param one the one to set
	 */
	public void setOne(DateButton one) {
		this.one = one;
	}

	/**
	 * @return the two
	 */
	public DateButton getTwo() {
		return two;
	}

	/**
	 * @param two the two to set
	 */
	public void setTwo(DateButton two) {
		this.two = two;
	}

	/**
	 * @return the three
	 */
	public DateButton getThree() {
		return three;
	}

	/**
	 * @param three the three to set
	 */
	public void setThree(DateButton three) {
		this.three = three;
	}

	/**
	 * @return the four
	 */
	public DateButton getFour() {
		return four;
	}

	/**
	 * @param four the four to set
	 */
	public void setFour(DateButton four) {
		this.four = four;
	}

	/**
	 * @return the five
	 */
	public DateButton getFive() {
		return five;
	}

	/**
	 * @param five the five to set
	 */
	public void setFive(DateButton five) {
		this.five = five;
	}

	/**
	 * @return the six
	 */
	public DateButton getSix() {
		return six;
	}

	/**
	 * @param six the six to set
	 */
	public void setSix(DateButton six) {
		this.six = six;
	}

	/**
	 * @return the seven
	 */
	public DateButton getSeven() {
		return seven;
	}

	/**
	 * @param seven the seven to set
	 */
	public void setSeven(DateButton seven) {
		this.seven = seven;
	}

	/**
	 * @return the eight
	 */
	public DateButton getEight() {
		return eight;
	}

	/**
	 * @param eight the eight to set
	 */
	public void setEight(DateButton eight) {
		this.eight = eight;
	}

	/**
	 * @return the nine
	 */
	public DateButton getNine() {
		return nine;
	}

	/**
	 * @param nine the nine to set
	 */
	public void setNine(DateButton nine) {
		this.nine = nine;
	}

	/**
	 * @return the ten
	 */
	public DateButton getTen() {
		return ten;
	}

	/**
	 * @param ten the ten to set
	 */
	public void setTen(DateButton ten) {
		this.ten = ten;
	}

	/**
	 * @return the eleven
	 */
	public DateButton getEleven() {
		return eleven;
	}

	/**
	 * @param eleven the eleven to set
	 */
	public void setEleven(DateButton eleven) {
		this.eleven = eleven;
	}

	/**
	 * @return the twelve
	 */
	public DateButton getTwelve() {
		return twelve;
	}

	/**
	 * @param twelve the twelve to set
	 */
	public void setTwelve(DateButton twelve) {
		this.twelve = twelve;
	}

	/**
	 * @return the thirteen
	 */
	public DateButton getThirteen() {
		return thirteen;
	}

	/**
	 * @param thirteen the thirteen to set
	 */
	public void setThirteen(DateButton thirteen) {
		this.thirteen = thirteen;
	}

	/**
	 * @return the fourteen
	 */
	public DateButton getFourteen() {
		return fourteen;
	}

	/**
	 * @param fourteen the fourteen to set
	 */
	public void setFourteen(DateButton fourteen) {
		this.fourteen = fourteen;
	}

	/**
	 * @return the fifteen
	 */
	public DateButton getFifteen() {
		return fifteen;
	}

	/**
	 * @param fifteen the fifteen to set
	 */
	public void setFifteen(DateButton fifteen) {
		this.fifteen = fifteen;
	}

	/**
	 * @return the sixteen
	 */
	public DateButton getSixteen() {
		return sixteen;
	}

	/**
	 * @param sixteen the sixteen to set
	 */
	public void setSixteen(DateButton sixteen) {
		this.sixteen = sixteen;
	}

	/**
	 * @return the seventeen
	 */
	public DateButton getSeventeen() {
		return seventeen;
	}

	/**
	 * @param seventeen the seventeen to set
	 */
	public void setSeventeen(DateButton seventeen) {
		this.seventeen = seventeen;
	}

	/**
	 * @return the eighteen
	 */
	public DateButton getEighteen() {
		return eighteen;
	}

	/**
	 * @param eighteen the eighteen to set
	 */
	public void setEighteen(DateButton eighteen) {
		this.eighteen = eighteen;
	}

	/**
	 * @return the nineteen
	 */
	public DateButton getNineteen() {
		return nineteen;
	}

	/**
	 * @param nineteen the nineteen to set
	 */
	public void setNineteen(DateButton nineteen) {
		this.nineteen = nineteen;
	}

	/**
	 * @return the twenty
	 */
	public DateButton getTwenty() {
		return twenty;
	}

	/**
	 * @param twenty the twenty to set
	 */
	public void setTwenty(DateButton twenty) {
		this.twenty = twenty;
	}

	/**
	 * @return the twentyone
	 */
	public DateButton getTwentyone() {
		return twentyone;
	}

	/**
	 * @param twentyone the twentyone to set
	 */
	public void setTwentyone(DateButton twentyone) {
		this.twentyone = twentyone;
	}

	/**
	 * @return the twentytwo
	 */
	public DateButton getTwentytwo() {
		return twentytwo;
	}

	/**
	 * @param twentytwo the twentytwo to set
	 */
	public void setTwentytwo(DateButton twentytwo) {
		this.twentytwo = twentytwo;
	}

	/**
	 * @return the twentythree
	 */
	public DateButton getTwentythree() {
		return twentythree;
	}

	/**
	 * @param twentythree the twentythree to set
	 */
	public void setTwentythree(DateButton twentythree) {
		this.twentythree = twentythree;
	}

	/**
	 * @return the twentyfour
	 */
	public DateButton getTwentyfour() {
		return twentyfour;
	}

	/**
	 * @param twentyfour the twentyfour to set
	 */
	public void setTwentyfour(DateButton twentyfour) {
		this.twentyfour = twentyfour;
	}

	/**
	 * @return the twentyfive
	 */
	public DateButton getTwentyfive() {
		return twentyfive;
	}

	/**
	 * @param twentyfive the twentyfive to set
	 */
	public void setTwentyfive(DateButton twentyfive) {
		this.twentyfive = twentyfive;
	}

	/**
	 * @return the twentysix
	 */
	public DateButton getTwentysix() {
		return twentysix;
	}

	/**
	 * @param twentysix the twentysix to set
	 */
	public void setTwentysix(DateButton twentysix) {
		this.twentysix = twentysix;
	}

	/**
	 * @return the twentyseven
	 */
	public DateButton getTwentyseven() {
		return twentyseven;
	}

	/**
	 * @param twentyseven the twentyseven to set
	 */
	public void setTwentyseven(DateButton twentyseven) {
		this.twentyseven = twentyseven;
	}

	/**
	 * @return the twentyeight
	 */
	public DateButton getTwentyeight() {
		return twentyeight;
	}

	/**
	 * @param twentyeight the twentyeight to set
	 */
	public void setTwentyeight(DateButton twentyeight) {
		this.twentyeight = twentyeight;
	}

	/**
	 * @return the twentynine
	 */
	public DateButton getTwentynine() {
		return twentynine;
	}

	/**
	 * @param twentynine the twentynine to set
	 */
	public void setTwentynine(DateButton twentynine) {
		this.twentynine = twentynine;
	}

	/**
	 * @return the thirty
	 */
	public DateButton getThirty() {
		return thirty;
	}

	/**
	 * @param thirty the thirty to set
	 */
	public void setThirty(DateButton thirty) {
		this.thirty = thirty;
	}

	/**
	 * @return the thirtyone
	 */
	public DateButton getThirtyone() {
		return thirtyone;
	}

	/**
	 * @param thirtyone the thirtyone to set
	 */
	public void setThirtyone(DateButton thirtyone) {
		this.thirtyone = thirtyone;
	}

	/**
	 * @return the thirtytwo
	 */
	public DateButton getThirtytwo() {
		return thirtytwo;
	}

	/**
	 * @param thirtytwo the thirtytwo to set
	 */
	public void setThirtytwo(DateButton thirtytwo) {
		this.thirtytwo = thirtytwo;
	}

	/**
	 * @return the thirtythree
	 */
	public DateButton getThirtythree() {
		return thirtythree;
	}

	/**
	 * @param thirtythree the thirtythree to set
	 */
	public void setThirtythree(DateButton thirtythree) {
		this.thirtythree = thirtythree;
	}

	/**
	 * @return the thirtyfour
	 */
	public DateButton getThirtyfour() {
		return thirtyfour;
	}

	/**
	 * @param thirtyfour the thirtyfour to set
	 */
	public void setThirtyfour(DateButton thirtyfour) {
		this.thirtyfour = thirtyfour;
	}

	/**
	 * @return the thirtyfive
	 */
	public DateButton getThirtyfive() {
		return thirtyfive;
	}

	/**
	 * @param thirtyfive the thirtyfive to set
	 */
	public void setThirtyfive(DateButton thirtyfive) {
		this.thirtyfive = thirtyfive;
	}

	/**
	 * @return the thirtysix
	 */
	public DateButton getThirtysix() {
		return thirtysix;
	}

	/**
	 * @param thirtysix the thirtysix to set
	 */
	public void setThirtysix(DateButton thirtysix) {
		this.thirtysix = thirtysix;
	}

	/**
	 * @return the thirtyseven
	 */
	public DateButton getThirtyseven() {
		return thirtyseven;
	}

	/**
	 * @param thirtyseven the thirtyseven to set
	 */
	public void setThirtyseven(DateButton thirtyseven) {
		this.thirtyseven = thirtyseven;
	}



}
