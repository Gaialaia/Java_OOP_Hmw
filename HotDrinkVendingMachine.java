package Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    List<Product> ListHotDrinks = new ArrayList<>();


    @Override
    public void addProductList(Product product) {  
        // ((BottleOfWater)product).getVolume();
        ListHotDrinks.add(product);
        
    }

    @Override
    public Product getProduct(double cost) {
        for (Product product : ListHotDrinks) {
            if(product.getCost() == cost)
            return product;
           }
           return null;
    }

    @Override
    public Product getProduct(String name) {
       for (Product product : ListHotDrinks) {
        if(product.getName().equals(name))
        return product;
       }
       return null;
    }

    public Product getProduct (int temperature) {  

    for (Product product : ListHotDrinks) {   
        if(product.getTemperature() == temperature)
        return product;
       }
       return null;
      
    }

    public Product getProduct (String name, double cost, double volume,int temperature) { 

        for (Product product : ListHotDrinks) {   
            if(product.getTemperature() == temperature)
            return product;
           }
           return null;

    }

}

    





