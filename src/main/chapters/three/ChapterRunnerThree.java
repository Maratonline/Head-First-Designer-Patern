package main.chapters.three;

import main.ChapterRunner;
import main.chapters.three.topings.Chocolate;
import main.chapters.three.topings.Vanil;

import java.io.*;

public class ChapterRunnerThree implements ChapterRunner {
    @Override
    public void run() {
        try {
            FileInputStream fileInputStream = new FileInputStream("new FileInputStream()");
            FilterInputStream  gf = new BufferedInputStream(fileInputStream);
            gf = new DataInputStream(gf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Bevarage bevarage1 = new Americano();
        bevarage1 = new Chocolate(bevarage1);
        bevarage1 = new Vanil(bevarage1);
        System.out.println("You order: "+bevarage1.getDesription()+ " price is : "+bevarage1.cost());

        Bevarage bevarage2 = new Capucino();
        bevarage2 = new Chocolate(bevarage2);
        bevarage2 = new Chocolate(bevarage2);
        System.out.println("You order: "+bevarage2.getDesription()+ " price is : "+bevarage2.cost());
    }
}
