package startPackage;

public class Test {

	public static void main(String[] args) {
		DateGenerator dg = new DateGenerator();
		dg.genDateTo(3, 2);
		dg.storeInFile();
	}

}
