package com.uniscon.rest.book;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.Optional;

@Singleton
public class BookService {

    private final BookDao bookDao;

    @Inject
    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookEntity create(BookEntity bookEntity) {
        bookDao.create(bookEntity);
        return bookEntity;
    }

    public Optional<BookEntity> get(long id) {
        return bookDao.get(id);
    }
}
