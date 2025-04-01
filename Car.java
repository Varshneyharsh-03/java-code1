public class Car {
    String make;
    String model ;
    int year ;
    boolean isRunning= false;
    double price;
    Car(String make,String model,int year, double price){
        this.price=price;
        this.make = make;
        this.year=year;
        this.model=model;

    }

    void start(){
        isRunning=true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning=false;
        System.out.println("you stop the engine");
    }
    void drive(){
        System.out.println("You drive the " + model);

    }

    void brake(){
        System.out.println("You brake the " + model );
    }
}
