package com.srt.demo_ioc.di_other.collection_bean;

public class Course {

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }

    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }
}
