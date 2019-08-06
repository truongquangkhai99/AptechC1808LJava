package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stack<T extends Stationary> {
    private ArrayList<T> list = new ArrayList<>();
    T object;
    Stack(){

    }
    public T pop() {
        if(list.size() == 0){
            return null;
        } else {
            return list.get(list.size()-1);
        }
    }
    public void push(T object) {
        if(object == null) {
            return;
        }
        list.add(object);
    }
    public ArrayList<T> getList() {
        return list;
    }
}
