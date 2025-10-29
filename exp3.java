class Vehicle{
    int maxSpeed;
    String color;
    
    Vehicle(int s, String c){
        maxSpeed = s;
        color = c;
    }
    
    void display(){
        System.out.println("This is a Vehicle\nWith Max Speed: " + maxSpeed + "\nand Color: " + color);
    }
}

class LandVehicle extends Vehicle{
    int numDoors;
    int wheels;
    
    LandVehicle(int s, String c, int d, int w){
        super(s, c);
        numDoors = d;
        wheels = w;
    }
    
    void display(){
        super.display();
        System.out.println("This is a Land Vehicle\nWith Number of Doors: " + numDoors + "\nand Number of Wheels: " + wheels);
    }
}

class Car extends LandVehicle{
    Car(int s, String c, int d){
        super(s, c, d, 4);
    }
    
    void display(){
        super.display();
        System.out.println("This is a Car");
    }
}

class WaterVehicle extends Vehicle{
    int numPropellers;
    
    WaterVehicle(int s, String c, int p){
        super(s, c);
        numPropellers = p;
    }
    
    void display(){
        super.display();
        System.out.println("This is a Water Vehicle\nWith Number of Propellers: " + numPropellers);
    }
}

class Boat extends WaterVehicle{
    String name;
    
    Boat(int s, String c, int p, String n){
        super(s, c, p);
        name = n;
    }
    
    void display(){
        super.display();
        System.out.println("This is a Boat\nWith Name: " + name);
    }
}


interface LandCapable{
    void showLandFeatures();
    int getDoors();
    int getWheels();
}

interface WaterCapable{
    void showWaterFeatures();
    int getPropellers();
}


class AmphibiousVehicle extends Vehicle implements LandCapable, WaterCapable{
    int numDoors;
    int wheels;
    int numPropellers;
    
    AmphibiousVehicle(int s, String c, int d, int p){
        super(s, c);
        numDoors = d;
        wheels = 4;
        numPropellers = p;
    }
    
    public void showLandFeatures(){
        System.out.println("This is a Land Vehicle\nWith Number of Doors: " + numDoors + "\nand Number of Wheels: " + wheels);
    }
    
    public void showWaterFeatures(){
        System.out.println("This is a Water Vehicle\nWith Number of Propellers: " + numPropellers);
    }
    
    public int getDoors(){ return numDoors; }
    public int getWheels(){ return wheels; }
    public int getPropellers(){ return numPropellers; }
    
    void display(){
        super.display();
        showLandFeatures();
        showWaterFeatures();
        System.out.println("This is an Amphibious Vehicle");
    }
}


class CarBoat extends Vehicle implements LandCapable, WaterCapable{
    int numDoors;
    int wheels;
    int numPropellers;
    String name;
    
    CarBoat(int s, String c, int d, int p, String n){
        super(s, c);
        numDoors = d;
        wheels = 4;
        numPropellers = p;
        name = n;
    }
    
    public void showLandFeatures(){
        System.out.println("This is a Land Vehicle\nWith Number of Doors: " + numDoors + "\nand Number of Wheels: " + wheels);
        System.out.println("This is a Car");
    }
    
    public void showWaterFeatures(){
        System.out.println("This is a Water Vehicle\nWith Number of Propellers: " + numPropellers);
        System.out.println("This is a Boat\nWith Name: " + name);
    }
    
    public int getDoors(){ return numDoors; }
    public int getWheels(){ return wheels; }
    public int getPropellers(){ return numPropellers; }
    
    void display(){
        super.display();
        showLandFeatures();
        showWaterFeatures();
        System.out.println("This is a Car-Boat");
    }
}

class exp3{
    public static void main(String[] args){
        System.out.println("=== Vehicle Demo ===\n");
        
    
        System.out.println("1. Basic Vehicle:");
        Vehicle v = new Vehicle(100, "Blue");
        v.display();
        System.out.println("\n" + "=".repeat(40) + "\n");
        
       
        System.out.println("2. Land Vehicle:");
        LandVehicle lv = new LandVehicle(120, "Red", 4, 4);
        lv.display();
        System.out.println("\n" + "=".repeat(40) + "\n");
        

        System.out.println("3. Car:");
        Car car = new Car(180, "Black", 4);
        car.display();
        System.out.println("\n" + "=".repeat(40) + "\n");
        
       
        System.out.println("4. Water Vehicle:");
        WaterVehicle wv = new WaterVehicle(60, "White", 2);
        wv.display();
        System.out.println("\n" + "=".repeat(40) + "\n");
        

        System.out.println("5. Boat:");
        Boat boat = new Boat(80, "Yellow", 3, "Sea Breeze");
        boat.display();
        System.out.println("\n" + "=".repeat(40) + "\n");
        
 
        System.out.println("6. Amphibious Vehicle:");
        AmphibiousVehicle av = new AmphibiousVehicle(90, "Green", 2, 2);
        av.display();
        System.out.println("\n" + "=".repeat(40) + "\n");
        

        System.out.println("7. Car-Boat:");
        CarBoat cb = new CarBoat(150, "Silver", 2, 1, "Aqua Rider");
        cb.display();
        System.out.println("\n" + "=".repeat(40) + "\n");
        

    }
}