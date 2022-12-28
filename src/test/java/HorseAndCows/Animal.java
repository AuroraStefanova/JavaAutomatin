package HorseAndCows;

abstract class Animal {
     String name;
     int price;

    public  void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;

    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;

    }

    public void eat(){
        this.price = this.price + price;
    }

    public String toString(){
        return this.name + " " + this.price;
    }

}
