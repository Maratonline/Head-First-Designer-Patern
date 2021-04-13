package main.chapters.three;

public class Americano extends Bevarage {
    public Americano(){
        desription = "Americano";
    }

    @Override
    public String getDesription() {
        return desription;
    }

    @Override
    public double cost() {
        return 1.1;
    }
}
