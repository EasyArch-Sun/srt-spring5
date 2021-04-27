package com.srt.demo_life;

public class Orders {

    private String oname;


    //无参构造
    public Orders() {
        System.out.println("1．无参构造创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("2．调用set方法设置属性值");
    }

    public void initMethod(){
        System.out.println("3．调用bean的初始化方法");
    }

    public void destoryMethod(){
        System.out.println("5．调用bean的销毁方法");

    }
}
