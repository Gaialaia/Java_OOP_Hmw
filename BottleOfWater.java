package Lesson_1;

public class BottleOfWater extends Product{


    private double volume;
    public BottleOfWater (String name, double cost, double volume) {
        super(name, cost);  //create product example экземпляр продукта
        this.volume = volume;

    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void test (){


    }
    @Override
    public String toString() {
        return super.getName() + super.getCost() + volume;  
    }


    // public Product getProductbyVolume (double volume);
   
    }

    
    

