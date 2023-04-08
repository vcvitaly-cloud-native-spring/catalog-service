package com.polarbookshop.catalogservice.domain;

/**
 * BookAlreadyExistsException.
 *
 * @author Vitalii Chura
 */
public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
