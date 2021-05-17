package com.srt.demo_ioc.di_con;

public class Orders {

    private String oname;
    private String address;


    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oname+"::"+address);

    }
}
