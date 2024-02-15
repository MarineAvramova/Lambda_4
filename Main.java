import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*Make the same impression as the previous point, but through method reference.*/ 
		Main main = new Main();
        main.printMonths();

	}

	 private List<String> months;

	    public Main() {
	        months = new ArrayList<>();
	        months.add("January");
	        months.add("February");
	        months.add("March");
	        months.add("April");
	        months.add("May");
	        months.add("June");
	        months.add("July");
	        months.add("August");
	        months.add("September");
	        months.add("October");
	        months.add("November");
	        months.add("December");
	    }

	    public void printMonths() {
	        months.forEach(System.out::println); // Method Reference
	    }
}
