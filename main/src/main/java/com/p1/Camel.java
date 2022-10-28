package com.p1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nhat Minh
 */
public class Camel {
    String desert;
    int step;

    public String getDesert() {
        return desert.toUpperCase();
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
    
    public Camel(){
        
    }
    public Camel(String desert, int step){
        setDesert(desert);
        setStep(step);
    }
}
