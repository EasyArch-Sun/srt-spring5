package com.srt.demo_jdbc.test;

import com.srt.demo_jdbc.entity.Book;
import com.srt.demo_jdbc.service.BookSevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @org.junit.Test
    public void testJdbcTemplate(){

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean_jdbc.xml");

        BookSevice bookSevice = context.getBean("bookSevice", BookSevice.class);

        //增加
        Book book=new Book();
        book.setUserId("2");
        book.setUsername("java");
        book.setUstatus("b");
        bookSevice.addBook(book);


        //修改
        Book book1=new Book();
        book.setUserId("1");
        book.setUsername("c++");
        book.setUstatus("a");
        bookSevice.updateBook(book1);


        //删除
        bookSevice.deleteBook("2");


        //查询记录数
        bookSevice.findCount();


        //查询返回对象
        Book book2 = bookSevice.findOne("1");
        System.out.println(book2);


        //查询返回集合
        List<Book> all = bookSevice.findAll();
        System.out.println(all);


//        //批量增加
//        List<Object[]> batchArgs=new ArrayList<>();
//        Object[] o1={"3","php","c"};
//        Object[] o2={"4","mysql","e"};
//        Object[] o3={"5","go","d"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookSevice.batchAdd(batchArgs);
//
//
//        //批量修改
//        List<Object[]> batchArgs1=new ArrayList<>();
//        Object[] o11={"php11","c7","7"};
//        Object[] o22={"mysql22","e8","5"};
//        Object[] o33={"go33","d4","4"};
//        batchArgs1.add(o11);
//        batchArgs1.add(o22);
//        batchArgs1.add(o33);
//        bookSevice.batchUpdate(batchArgs1);


        //批量删除
        List<Object[]> batchArgs3=new ArrayList<>();
        Object[] o111={"3"};
        Object[] o222={"4"};
        batchArgs3.add(o111);
        batchArgs3.add(o222);
        bookSevice.batchDelete(batchArgs3);



    }
}
