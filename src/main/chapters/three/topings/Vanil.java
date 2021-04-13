package main.chapters.three.topings;

import main.chapters.three.Bevarage;

public class Vanil extends Toping {
    Bevarage bevarage;

    public Vanil(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDesription() {
        return bevarage.getDesription() + ", Vanil";
    }

    @Override
    public double cost() {
        return bevarage.cost() + 0.25;
    }
}
