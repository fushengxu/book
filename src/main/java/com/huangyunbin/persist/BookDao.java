package com.huangyunbin.persist;

import com.huangyunbin.model.Book;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class BookDao {

    public Set<Book> getAll() {
        Set<Book> result=new HashSet<Book>() ;
        return result;
    }


}
