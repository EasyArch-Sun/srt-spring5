package com.srt.demo_jdbc.dao;

import com.srt.demo_jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {

        String sql="insert into book values (?,?,?)";

//        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());

        Object[] args={book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);

        System.out.println(update);

    }

    @Override
    public void update(Book book) {


        String sql="update book set username=?,ustatus=? where userId=?";


        Object[] args={book.getUsername(), book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql,args);

        System.out.println(update);

    }



    @Override
    public void delete(String id) {


        String sql="delete from book where userId=?";

//        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());

        int update = jdbcTemplate.update(sql,id);

        System.out.println(update);

    }

    @Override
    public int selectCount() {

        String sql="select count(*) from book";

        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);

        return count;

    }

    @Override
    public Book findBookInfo(String id) {

        String sql="select * from book where userId=?";

        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);

        return book;
    }

    @Override
    public List<Book> findAllBook() {

        String sql="select * from book";

        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));

        return bookList;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {

        String sql="insert into book values (?,?,?)";

        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));


    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {

        String sql="update book set username=?,ustatus=? where userId=?";

        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchDeleteeBook(List<Object[]> batchArgs) {

        String sql="delete from book where userId=?";

        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));
    }


}
