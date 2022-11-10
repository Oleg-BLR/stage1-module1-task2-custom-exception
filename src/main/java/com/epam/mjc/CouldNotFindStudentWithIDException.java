package com.epam.mjc;

public class CouldNotFindStudentWithIDException extends IllegalArgumentException {

    public CouldNotFindStudentWithIDException(String message) {
        super(message);
    }

}
