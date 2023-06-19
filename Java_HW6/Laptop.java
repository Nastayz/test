

import java.util.ArrayList;
import java.util.List;

public class Laptop {

    private String name;

    private int ram;
    private String operSystem;
    private int price;
    private String model;

    public Laptop(String name, int ram, String operSystem, int price, String model) {
        this.name = name;
        this.ram = ram;
        this.operSystem = operSystem;
        this.price = price;
        this.model = model;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("ram");
        list.add("operationSystem");
        list.add("price");
        list.add("model");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + ram +
                ", операционная система: " + operSystem + '\'' +
                ", цена: " + price +
                ", модель: " + model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int amountRAM) {
        this.ram = ram;
    }

    public String getOperSystem() {
        return operSystem;
    }

    public void setOperSystem(String operatingSystem) {
        this.operSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}