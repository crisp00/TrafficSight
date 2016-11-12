/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexapix.jjcrisp.trafficsight.util;

import java.util.ArrayList;

/**
 *
 * @author INFORMATICA
 */
public class BiArrayList<T> extends ArrayList<ArrayList<T>>{
    
    public BiArrayList(){
        super();
    }
    
    public void set(int x, int y, T element){
        while (x >= this.size()) {
            this.add(new ArrayList<T>());
        }

        ArrayList<T> inner = this.get(x);
        while (y >= inner.size()) {
            inner.add(null);
        }

        inner.set(y, element);
    }
    
    public T get(int x, int y){
        System.out.println(this.size() + " " + this.get(5).size());
        if(x < 0 || y < 0 || this.size() - 1 < x || this.get(x).size() - 1 < y)
            return null;
        return this.get(x).get(y);
    }
    
}
