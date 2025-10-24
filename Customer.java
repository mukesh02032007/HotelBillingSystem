package Miniproject;
public class Customer {
	private String name;
    private int days;
    private int phno;
    private Room room;
    private Services services;

    public Customer(String name,int phno, int days, Room room, Services services) {
        this.name = name;
        this.days = days;
        this.room = room;
        this.phno=phno;
        this.services = services;
    }

    public double generateBill() {
        double roomCost = room.calculateCharge(days);
        double serviceCost = services.totalServiceCost();
        return roomCost + serviceCost;
    }

    public void printBill() {
        System.out.println("------ Hotel Bill ------");
        System.out.println("Customer: " + name);
        System.out.println("Phone: " + phno);
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Days Stayed: " + days);
        System.out.println("Room Charges: " + room.calculateCharge(days));
        System.out.println("Service Charges: " + services.totalServiceCost());
        System.out.println("Total Bill: " + generateBill());
        System.out.println("------------------------");
    }
}
