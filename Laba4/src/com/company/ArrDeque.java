package com.company;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Stream;

public class ArrDeque<T> implements Serializable {
    private Vector<T> vector = new Vector<>();
    private ListIterator<T> listIterator;

    public int size(){
        return vector.size();
    }

    public void add(T e){
        vector.add(e);
    }

    public void addFirst(T e){
        if(vector.isEmpty()) vector.add(e);
        else{
            listIterator = vector.listIterator();
            listIterator.add(e);
        }
    }

    public void remove(T e){
        vector.remove(e);
    }

    public void remove(int index){
        vector.remove(index);
    }


    public void removeLast(){
        vector.remove(vector.size()-1);
    }

    public void removeFirst(){
        vector.remove(0);
    }

    public String toString(){
       StringBuffer result = new StringBuffer();
        listIterator = vector.listIterator();
        while(listIterator.hasNext()){
            result.append(listIterator.next() + "\n");
        }
        return  result.toString();

    }

    public T[] toArray(T[] a){
       return vector.toArray(a);
    }

    public ArrayList<T> toList(){
        return Collections.list(vector.elements());
    }

    public Stream<T> stream(){

        return Collections.list(vector.elements()).stream();
    }

}
