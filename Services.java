package Miniproject;

public class Services {
	private boolean food, laundry, wifi;

    public Services(boolean food, boolean laundry, boolean wifi) {
        this.food = food;
        this.laundry = laundry;
        this.wifi = wifi;
    }

    public double totalServiceCost() {
        double cost = 0;
        if(food) cost += 500;
        if(laundry) cost += 300;
        if(wifi) cost += 200;
        return cost;
    }
}
