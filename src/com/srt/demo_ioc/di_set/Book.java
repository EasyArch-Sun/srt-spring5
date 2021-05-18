package com.srt.demo_ioc.di_set;

public class Book {


    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }


    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo(){
        System.out.println(bname+"::"+bauthor);
    }
}
