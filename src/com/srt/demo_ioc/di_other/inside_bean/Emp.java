package com.srt.demo_ioc.di_other.inside_bean;

public class Emp {

    private String ename;
    private String gender;

    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add(){
        System.out.println(ename+" "+gender+" "+dept);
    }
}
