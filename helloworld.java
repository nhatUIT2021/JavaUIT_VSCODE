import java.util.Scanner ;// Import the Scanner class
import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class
import java.util.LinkedList;
import java.util.HashMap; // import the HashMap class
import java.util.HashSet; // Import the HashSet class
import java.util.Iterator;


public class helloworld {
	 public static void main(String[] args) {
 /*
		Scanner myObj =new Scanner(System.in);// Create a Scanner object
		System.out.println("Enter username");
		String userName =myObj.nextLine();// Read user input
		System.out.println("Username is: "+userName);// Output user input
		
		System.out.println("Enter name, age and salary:");
		// String input
		String name =myObj.nextLine();
		// Numerical input
		int age =myObj.nextInt();
		double salary =myObj.nextDouble();
		// Output input by user
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
*/
		 LocalDate date = LocalDate.now(); // Create a date object
		 System.out.println(date); // Display the current date
		 
		 LocalTime time = LocalTime.now();
		 System.out.println(time);
		 
		 LocalDateTime datetime = LocalDateTime.now();
		 System.out.println(datetime);
		 
		 LocalDateTime myDateObj = LocalDateTime.now();
		 System.out.println("Before formatting: " + myDateObj);
		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		 String formattedDate = myDateObj.format(myFormatObj);
		 System.out.println("After formatting: " + formattedDate);
		 
		 ArrayList<String> xemay = new ArrayList<String>();
		 xemay.add("honda");
		 xemay.add("suzuki");
		 xemay.add("bmw");
		 xemay.add("kawasaki");
		 System.out.println(xemay);
		 xemay.size();
		 
		 System.out.println("sort lai danh sach xe may");
		 Collections.sort(xemay);  // Sort cars
		    for (String i : xemay) {
		      System.out.println(i);
		    }
		
		 
		 xemay.get(0);
		 
		 xemay.set(0, "da set lai");
		 xemay.get(0);
		 
		 xemay.remove(0);
		 System.out.println(xemay);
		
		
		 for (int i = 0; i < xemay.size(); i++) {
		      System.out.println(xemay.get(i));
		    }
		
		 for (String i : xemay) {
		      System.out.println(i);
		    }
		 
		 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		 myNumbers.add(19);
		 myNumbers.add(10);
		 myNumbers.add(25);
		 myNumbers.add(20);
		 for (int i : myNumbers) {
		 System.out.println(i);
			}
		 
		 System.out.println("sort lai danh sach so nguyen");

		Collections.sort(myNumbers);  // Sort myNumbers

			for (int i : myNumbers) {
		      System.out.println(i);
		    }
			LinkedList<String> cars = new LinkedList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		    
		    cars.addFirst("them xe 1");
		    System.out.println(cars);
		    
		    cars.addLast("them xe cuoi");
		    System.out.println(cars);
		    System.out.println("iterator qua danh sach cars");

		 // Get the iterator
		    Iterator<String> it = cars.iterator();
		    
		    
		    // Print the first item
		    System.out.println(it.next());
		    
		 // Loop through a collection
		    while(it.hasNext()) {
		      System.out.println(it.next());
		    }		  
		    cars.removeFirst();
		    System.out.println(cars);
		    
		    cars.removeLast();
		    System.out.println(cars);
		    
		    System.out.println(cars.getFirst());
		    
		    System.out.println(cars.getLast());

		 // Create a HashMap object called capitalCities
		    HashMap<String, String> capitalCities = new HashMap<String, String>();

		    // Add keys and values (Country, City)
		    capitalCities.put("vietnam", "hanoi");
		    capitalCities.put("trungquoc", "backinh");
		    capitalCities.put("thailand", "bangkok");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities);
		    System.out.println(capitalCities.size());
		    System.out.println("ten danh sach cac nuoc");

		    for (String i : capitalCities.keySet()) {
		    	  System.out.println(i);
		    	}
		    
		    System.out.println("ten danh sach cac thu do");
		    
		 // Print values
		    for (String i : capitalCities.values()) {
		      System.out.println(i);
		    }
		    System.out.println("ten danh sach cac nuoic va thu do");

		 // Print keys and values
		    for (String i : capitalCities.keySet()) {
		      System.out.println("key: " + i + " value: " + capitalCities.get(i));
		    }
		    capitalCities.get("England");

		    capitalCities.remove("USA");

		    System.out.println("danh sach thu do da xoa usa" +capitalCities);

		    System.out.println(capitalCities.size());


		    capitalCities.clear();

		    System.out.println("danh sach thu do da xoa het" +capitalCities);
		    System.out.println(capitalCities.size());

		    HashSet<String> xehoi_hashset = new HashSet<String>();
		    xehoi_hashset.add("Volvo");
		    xehoi_hashset.add("BMW");
		    xehoi_hashset.add("Ford");
		    xehoi_hashset.add("BMW");
		    xehoi_hashset.add("Mazda");
		    System.out.println(xehoi_hashset);
		    System.out.println(xehoi_hashset.contains("Mazda"));
		    System.out.println(xehoi_hashset.size());

		    for (String i : xehoi_hashset) {
		    	  System.out.println(i);
		    	}
		    xehoi_hashset.remove("Volvo");
		    System.out.println(xehoi_hashset);
		  
		    xehoi_hashset.clear();
		    System.out.println(xehoi_hashset);
	 }
}

