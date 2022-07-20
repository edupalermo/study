package com.uniscon.rest.book;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/book")
public class BookRestService {

    private static Logger logger = LoggerFactory.getLogger(BookRestService.class);

    private final BookService bookService;

    @Inject
    public BookRestService(BookService bookService) {
        this.bookService = bookService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public BookEntity get(@PathParam("id") long id) {
        logger.info("Calling GET book API");
        return bookService.get(id).orElseThrow(() -> new WebApplicationException(Response.Status.NOT_FOUND));
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    public void create(BookEntity bookEntity) {
        logger.info("Calling POST book API");
        bookService.create(bookEntity);
    }
}
