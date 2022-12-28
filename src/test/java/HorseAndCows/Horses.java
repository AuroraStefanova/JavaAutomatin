package HorseAndCows;

public class Horses extends Animal {

    boolean groomed;

    private int energy;

    // get and set energy
    public void setEnergy(int energy){

        this.energy = energy;
    }

    public int getEnergy(){
         return energy;
    }
    // groomed method
    void horseGrooming(){

        if(this.groomed == false){
            this.price = this.price + 10;
        }
    }


    public String toString(){
        return this.name + " " + this.price + " " + this.groomed;
    }

    @Override
    public void eat(){
        this.energy += 21;
    }
    public void run(){
        this.energy -= 20;
    }

}
/*
To class horse add:
    -> field energy (min 0, max 100) - Use getter/setter for validation
    -> functionality eat - one call of this function, removes 20 energy
    -> functionality run - one call of this function, restores 20 energy
 */
