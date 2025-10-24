package Miniproject;
import java.util.*;
public class HotelBillingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input Customer Details
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone number: ");
        int phno=sc.nextInt();
        
        System.out.print("Enter Days of Stay: ");
        int days = sc.nextInt();

        System.out.println("Choose Room Type: 1.Standard 2.Deluxe 3.Suite");
        int choice = sc.nextInt();
        Room room;
        switch(choice) {
            case 1: room = new StandardRoom(); break;
            case 2: room = new DeluxeRoom(); break;
            case 3: room = new SuiteRoom(); break;
            default: room = new StandardRoom();
        }

        // Services
        System.out.print("Need Food service? (true/false): ");
        boolean food = sc.nextBoolean();
        System.out.print("Need Laundry service? (true/false): ");
        boolean laundry = sc.nextBoolean();
        System.out.print("Need WiFi service? (true/false): ");
        boolean wifi = sc.nextBoolean();

        Services services = new Services(food, laundry, wifi);

        // Generate Bill
        Customer customer = new Customer(name,phno, days, room, services);
        customer.printBill();
        sc.close();
	}
	
}
