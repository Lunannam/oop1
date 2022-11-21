package oop1;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class vendingMachine {
    private List<product> products = new ArrayList<product>();
    private final static List<product> initProduct = new ArrayList<>();
    static {
        initProduct.add(new product("Сникерс", 80.0));
    }

    public vendingMachine(){
        this(initProduct);
    }

    public vendingMachine(List<product> products) {
        this.products = products;
    }

    public vendingMachine(String name, Double price){
        this.products = new ArrayList<>();
        products.add(new product(name, price));
    }

    public product getProductBy(String inpName){
        for (product product : products) {
            if (product.getName().contains(inpName)){
                return product;
            }
        }
        return null;
    }
    
    public product getProductBy(Double inpPrice){
        for (product product : products) {
            if (product.getPrice().equals(inpPrice)){
                return product; 
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (product product : products) {
            result = result.concat(product.toString() + "\n");
        }
        return result;
    }
}
