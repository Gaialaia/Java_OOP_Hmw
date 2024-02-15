package Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{  //VM for selling water

    List<Product> productList = new ArrayList<>();



    
    
    @Override
    public void addProductList(Product product) {  
        // ((BottleOfWater)product)
        productList.add(product); 
    }


    @Override
    public Product getProduct(double cost) {
        for (Product product : productList) {
            if(product.getCost() == cost)
            return product;
           }
           return null;

        
    }

    @Override
    public Product getProduct(String name) {
       for (Product product : productList) {
        if(product.getName().equals(name))
        return product;
       }
       return null;
    }

    public BottleOfWater getProduct(double volume) {
        for (Product bottleOfWater : productList) {
         if(Product bottleOfWater.getVolume() == volume)
         return ;
        }
        return null;





       

    }
        

}



    
    

