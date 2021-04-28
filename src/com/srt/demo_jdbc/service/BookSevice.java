package com.srt.demo_jdbc.service;

import com.srt.demo_jdbc.dao.BookDao;
import com.srt.demo_jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookSevice {

    @Autowired
    private BookDao bookDao;


    //添加
    public void addBook(Book book){
        bookDao.add(book);
    }

    //修改
    public void updateBook(Book book){
        bookDao.update(book);
    }

    //删除
    public void deleteBook(String id){
        bookDao.delete(id);
    }

    //查询记录数
    public int findCount(){
        return bookDao.selectCount();
    }

    //查询返回对象
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }

    //查询返回集合
    public List<Book> findAll( ){
        return bookDao.findAllBook();
    }


}
