package main.discovery.closable;

import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyReader implements AutoCloseable {
    private File file;
    private FileReader fileReader;

    public MyReader(File file) throws IOException{
        this.file = file;
        fileReader = new FileReader(file);


    }

    public void readFile(){
        int f = Integer.valueOf("sdf");
        throw new NullPointerException("FUCK OFFF");
    }

    public void readFile2(){
        throw new NullPointerException("FUCK OFFF");
    }
    @Override
    public void close() throws Exception {
        fileReader.close();
        int f = Integer.valueOf("ddddd");
        throw new RuntimeException("some fucking exception");
    }
}
