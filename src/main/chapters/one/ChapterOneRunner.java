package main.chapters.one;

import main.ChapterRunner;
import main.chapters.one.weapons.AxeBehavior;
import main.chapters.one.weapons.BowAndArrowBehavior;
import main.chapters.one.weapons.SwordBehavior;

public class ChapterOneRunner implements ChapterRunner {
    @Override
    public void run() {
        new King(new AxeBehavior()).fight();
        new Troll(new BowAndArrowBehavior()).fight();
        new Queen(new SwordBehavior()).fight();
    }
}
