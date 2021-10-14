package com.company;

public class Digital extends Audiobook{

    /////////////////////////////Attributes////////////////////////
    private double dataSize;
    /////////////////////////////Constructors//////////////////////
    public Digital(){
        this("Default digital audiobook title",000);
    }
    public Digital(String name) {
        super(name);
    }
    public Digital(String name, double dataSize){
        super(name);
        this.dataSize = dataSize;
    }



    //////////////////////////////Methods//////////////////////////


    public double getDataSize() {
        return dataSize;
    }
    public void setDataSize(double dataSize) {
        this.dataSize = dataSize;
    }


}