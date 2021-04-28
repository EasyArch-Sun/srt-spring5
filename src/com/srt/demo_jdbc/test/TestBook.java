package com.srt.demo_jdbc.test;

import com.srt.demo_jdbc.entity.Book;
import com.srt.demo_jdbc.service.BookSevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    }
}
