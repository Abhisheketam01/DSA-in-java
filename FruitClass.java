class Fruit{
    String name;
    String color;
    double weight;

    //constuctor
    Fruit(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    //Method to display fruit class
    void displayInfo() {
        System.out.println("Fruit Name: " + name );
        System.out.println("color: " + color);
        System.out.println("weight: " + weight + "kg");
    }

}

public class main {
   public static void main(String[] args){
    Fruit apple = new Fruit("apple" , "red" , 0.2);
    apple.displayInfo();

   } 
}

// output
//Fruit Name: apple
//color: red
//weight: 0.2kg
