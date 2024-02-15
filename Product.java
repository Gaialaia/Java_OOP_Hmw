package Lesson_1;

public abstract class Product {
    private String name;  //only in this class available
    private Double cost;  

    public Product(String nameProduct, double cost) {
        name = nameProduct; 
        this.cost = cost; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", cost=" + cost + "]";
    }

    public int getTemperature() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTemperature'");
    }

}