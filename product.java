package oop1;

public class product {
    private String name;
    private Double price;

    public product(String name, Double price){
        this(name);
        this.price = price;
    }
      
    public product(String name){
        this.name = name;
    }

    public String getName(){

        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }
    public void setPrice(Double value){
        if (value <=0) {
            return;
        }
        this.price = value;
    }

    @Override
    public String toString() {
      
        return String.format("%s, %,.2f ", this.name, this.price);
    }
}
