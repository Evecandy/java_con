package oop;

public class Banana extends Fruit {


    private String type;
    Integer price;

    //Primitive data types



    //Constant
    public static final String bananaTaste = "Sweet";

    public static Integer bananasCreated = 0;

    public Banana(String c, Boolean ri, String size, String type, Integer price) {
        this.color = c;
        this.ripe = ri;
        this.size = size;
        this.type = type;
        this.price = price;
        bananasCreated++;
        this.fruitType = "paste";
    }

    public Banana(String type) {
        this.type = type;
        bananasCreated++;
    }

    public Banana() {
        bananasCreated++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getRipe() {
        return ripe;
    }

    public void setRipe(Boolean ripe) {
        this.ripe = ripe;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setBananaPrice(Integer price) {
        this.price = price * 2;
    }

    public void setBananaPrice(Double price) {
        this.price = price.intValue() * 3;
    }

    public void setBananaPrice(String price) {
        this.price = 0;
    }


    public Integer getBananasCreated() {
        return bananasCreated;
    }

    public void setBananasCreated(Integer bananasCreated) {
        this.bananasCreated = bananasCreated;
    }

    public String getNutrients() {
        return super.getNutrients() + ", potassium, magnesium";
    }
}
