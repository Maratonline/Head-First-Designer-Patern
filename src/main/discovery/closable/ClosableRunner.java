package main.discovery.closable;

import main.ChapterRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ClosableRunner implements ChapterRunner {
    FileInputStream fileInputStream;

    @Override
    public void run() {

        try(MyReader myReader = new MyReader(new File("C:\\Users\\MARAT\\IdeaProjects\\the book Head first\\testFile.txt"))){
           myReader.readFile();
            myReader.readFile2();
        }catch (Exception e){
            System.out.println("EXCEPTION " + e.toString());
            final Throwable[] suppressedExceptions = e.getSuppressed();
            final int numSuppressed = suppressedExceptions.length;
                for (Throwable throwable: suppressedExceptions)
                System.out.println("The result: "+throwable.toString());
          //  e.printStackTrace();
        }
    }

    private void secondMethod(){
        MyReader myReader;
        try{

        }finally {

        }
    }
}
