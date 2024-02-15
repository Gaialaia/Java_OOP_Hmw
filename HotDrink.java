package Lesson_1;



// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
// и реализовать перегруженный метод getProduct(String name, int volume, int temperature), 
// выдающий продукт соответствующий имени, объёму и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат 
// и воспроизвести логику, заложенную в программе
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

// Формат сдачи:
// Ссылка на гитхаб проект
// Подписать фамилию и номер группы


public class HotDrink extends BottleOfWater{

    int temperature;

    HotDrink (String name, double cost, double volume, int temperature) {
        super(name, cost,volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    
    }
    
    public String toString() {
        return super.getName() + super.getCost() + super.getVolume() + temperature;  
    }


    }


