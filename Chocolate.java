package oop1;

public class Chocolate extends product{
    private Integer calories;
    
    public Chocolate(String name) {
        super(name);
        
    }

    public Chocolate(String name, Double price, Integer calories) {
        super(name, price);
        this.calories = calories;
    }

    public Integer getCalories(){
        return this.calories;
    }
    @Override
    public String toString() {
        
        return String.format("%s, %d ", super.toString() , calories );
    }

}
    

