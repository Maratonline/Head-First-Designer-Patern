package main.chapters.three;

public class Capucino extends Bevarage {
    public Capucino(){
        desription = "Capucino";
    }

    @Override
    public String getDesription() {
        return desription;
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
