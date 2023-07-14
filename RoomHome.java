package assignment;

class Room {
    protected double length;
    protected double breadth;
    protected double height;

    public void getData(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void showData() {
        System.out.println("Length: " + length + " feet");
        System.out.println("Breadth: " + breadth + " feet");
        System.out.println("Height: " + height + " feet");
    }

    public double calculateDesignArea() {
        return (length * breadth) + 2 * (length * height) + 2 * (breadth * height);
    }
}

class KitchenRoom extends Room {
    private double ratePerSqFt = 120;

    public void interiorDesignCost() {
        double cost = calculateDesignArea() * ratePerSqFt;
        System.out.println("Cost of interior design for the kitchen: $" + cost);
    }
}

class LivingRoom extends Room {
    private double ratePerSqFt = 80;

    public void interiorDesignCost() {
        double cost = calculateDesignArea() * ratePerSqFt;
        System.out.println("Cost of interior design for the living room: $" + cost);
    }
}

public class RoomHome {
    public static void main(String[] args) {
        KitchenRoom kitchen = new KitchenRoom();
        kitchen.getData(15, 10, 8); // Assuming length = 15 ft, breadth = 10 ft, height = 8 ft
        kitchen.showData();
        kitchen.interiorDesignCost();

        System.out.println();

        LivingRoom livingRoom = new LivingRoom();
        livingRoom.getData(20, 12, 10); // Assuming length = 20 ft, breadth = 12 ft, height = 10 ft
        livingRoom.showData();
        livingRoom.interiorDesignCost();
    }
}

