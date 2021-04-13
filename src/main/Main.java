package main;

import main.chapters.one.ChapterOneRunner;
import main.chapters.three.ChapterRunnerThree;
import main.chapters.two.ChapterTwoRunner;
import main.discovery.closable.ClosableRunner;

public class Main {
    static ChapterRunner chapterRunner;
    public static void main(String[] args){
        System.out.println("Main method");
//        new ChapterOneRunner().run();
     //   new ChapterTwoRunner().run();
//        new ChapterRunnerThree().run();
        new ClosableRunner().run();

    }
}
