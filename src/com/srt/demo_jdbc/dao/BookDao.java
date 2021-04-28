package com.srt.demo_jdbc.dao;

import com.srt.demo_jdbc.entity.Book;

import java.util.List;

public interface BookDao {

     void add(Book book);

     void update(Book book);

     void delete(String id);

     int selectCount();

     Book findBookInfo(String id);

    List<Book> findAllBook();
}
