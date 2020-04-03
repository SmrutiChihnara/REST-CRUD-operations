package com.src.exception;

public class ItemException extends Exception {
private long book_id;
public ItemException(long id) {
        super(String.format("Item is not found with id : '%s'", id));
        }
}