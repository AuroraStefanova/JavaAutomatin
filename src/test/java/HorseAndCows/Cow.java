package HorseAndCows;

public class Cow extends Animal {

    int milkContent;

    public void eat(){
        this.milkContent += 20;
    }

    // milked method
    public  int milked(){
        if(this.milkContent < 20){
            System.out.println("No milk in the cow");
            return this.milkContent;
        }
        else{
            this.milkContent -= 20;
            return 20;
        }
    }

    public void setMilkContent(int milkContent){
        this.milkContent = milkContent;
    }

    public int getMilkContent(){

        return milkContent;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;

    }
}
/*
- Create class cow, that has:
    -> fields - name, price, milkContent(min 0, max 100),
    -> functionality eat - one call of this function, removes 20 milk
    -> functionality milked - one call of this function, restores 20 milk
 */
