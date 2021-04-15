package main.algorithm.sorts;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import main.ChapterRunner;

import java.util.Arrays;

public class MergenSort implements ChapterRunner {

String[] strings ={"der","ter","ar", "bar"};
    @Override
    public void run() {
        mergeSrot(strings);
        for (int i = 0; i < strings.length; i++)
            System.out.println(strings[i]);
    }

    public void mergeSrot(Object[] array){
        for(int i = 0; i<array.length; i++){
            for(int j=i; j>0 && ((Comparable)array[j]).compareTo((Comparable)array[j-1])>0; j--)
                swap(array,  j, j-1);
        }
    }

    private void swap(Object[] array, int a,int b){
        Object obj = array[a];
        array[a] = array[b];
        array[b] = obj;
    }
}
