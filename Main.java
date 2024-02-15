package Lesson_1;

class Main {
    public static void main(String[] args) {
           
            BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine();
           machine.addProductList(new BottleOfWater("aqua",200, 450));
           machine.addProductList(new BottleOfWater("coke",300, 405));
           machine.addProductList(new BottleOfWater("carror juice",500, 250));
           machine.addProductList(new BottleOfWater("mineral water",150, 450));
           machine.addProductList(new BottleOfWater("green tea",245, 450));
        

           HotDrinkVendingMachine hotdrink = new HotDrinkVendingMachine();
           hotdrink.addProductList(new HotDrink("cappuccino", 600, 700, 85));
           hotdrink.addProductList(new HotDrink("grog", 800, 280, 70));
           hotdrink.addProductList(new HotDrink("mulled wine",250, 280, 75));
           hotdrink.addProductList(new HotDrink("hot chocolate", 500, 500, 80));
           
           
        //    printProductByName(hotdrink, "grog");
           printProductByTemp(hotdrink, 70);
        //    printProductByCost(hotdrink,250);

    }

    HotDrink milkDrink = new HotDrink("milk", 200, 250, 70);

    public static void printProductByName (VendingMachine vendingMachine, String name) {
        System.out.println(vendingMachine.getProduct(name));
    };

    public static void printProductByTemp (VendingMachine HotDrinkVendingMachine, int temperature) {
        System.out.println(HotDrinkVendingMachine.getProduct(temperature));
    };

    public static void printProductByCost (VendingMachine vendingMachine, double cost) {
        System.out.println(vendingMachine.getProduct(cost));
    };



  
    


    









    
}
