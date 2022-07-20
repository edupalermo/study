package com.uniscon.conf;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.uniscon.rest.book.BookRestService;

public class ApplicationModule implements Module {

    public void configure(final Binder binder) {
        binder.bind(BookRestService.class);
    }
}