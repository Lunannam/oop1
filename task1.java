
package oop1;

import java.util.ArrayList;
import java.util.List;

public class task1 {

    public static void main(String[] args) {
        List<product> prods = new ArrayList<>();
        prods.add(new Chocolate("Вдохновение", 33.0, 350));
        prods.add(new Milk("молоко", 55.0, 3));
        prods.add(new product("чипсы", 60.0));
        prods.add(new product("шоколад", 70.0));
        prods.add(new product("чупа чупс", 10.0));
        prods.add(new product("орешки", 90.0));
        prods.add(new product("палочки соленое", 50.0));
        vendingMachine v1 = new vendingMachine(prods);
        System.out.println(v1);
        System.out.println(v1.getProductBy("орешки"));
        System.out.println(v1.getProductBy(10.0));
        // prod.name = "чипсы";
        // prod.price = 60.0;
        // System.out.printf("%s, %,.2f \n", prod.getName(), prod.getPrice());
        // prod.setPrice(100.0);
        // System.out.printf("%s, %,.2f \n", prod.getName(), prod.getPrice());
        // vendingMachine v1 = new vendingMachine();
        // vendingMachine v2 = new vendingMachine();
        // System.out.println(prod);
    }

    
}
