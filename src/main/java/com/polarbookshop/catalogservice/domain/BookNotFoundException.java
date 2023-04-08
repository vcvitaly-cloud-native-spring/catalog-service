package com.polarbookshop.catalogservice.domain;

/**
 * BookNotFoundException.
 *
 * @author Vitalii Chura
 */
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
