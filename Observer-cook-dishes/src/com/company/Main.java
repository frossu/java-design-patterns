package com.company;

public class Main {

    public static void main(String[] args) {
	    DishQueue dishQueue = new DishQueue();
	    Cook john = new Cook("John");
		Cook peter = new Cook("Peter");

	    dishQueue.registerObserver(john);
	    dishQueue.registerObserver(peter);

	    dishQueue.addDish("Sweet potato fries");
	    dishQueue.addDish("Collard greens");

	    john.cook();
	    john.cook();

	    dishQueue.addDish("House baked roll");
	    peter.cook();
    }
}
