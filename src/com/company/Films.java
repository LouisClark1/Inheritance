package com.company;

public class Films extends DVDs{

    /////////////////////////////Attributes////////////////////////

    /////////////////////////////Constructors//////////////////////
    public Films(){
        this("Default film title", 0000000000);
    }
    public Films(String name) {
        super(name);
    }

    public Films(String name, double itemSize) {
        super(name);
        this.itemSize = itemSize;
    }

    //////////////////////////////Methods//////////////////////////

}
