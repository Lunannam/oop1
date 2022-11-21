package oop1;

public class Milk extends product{
    private Integer fateness;

    public Milk(String name) {
        super(name);
        
    }
    public Milk(String name, Double price, Integer fateness) {
        super(name, price);
        this.fateness = fateness;
        
    }
    
    public Integer getfateness(){
        return this.fateness;
    }

    @Override
    public String toString() {
     
        return String.format("%s, %d " , super.toString(), fateness);

    }
}
