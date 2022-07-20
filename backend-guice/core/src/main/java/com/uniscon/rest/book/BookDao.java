package com.uniscon.rest.book;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.persistence.EntityManager;
import java.util.Optional;

@Singleton
public class BookDao {

    private final EntityManager em;

    @Inject
    public BookDao(EntityManager em) {
        this.em = em;
    }


    public BookEntity create(BookEntity bookEntity) {
        em.getTransaction().begin();
        em.persist(bookEntity);
        em.getTransaction().commit();
        return bookEntity;
    }

    public Optional<BookEntity> get(long id) {
        return Optional.ofNullable(em.find(BookEntity.class, id));
    }
}
