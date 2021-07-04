package com.example.topoftops.exception;

/**
 * Describes exception in Dao
 *
 * @author Ilya Tsvetkov
 * @see Exception
 */
public class DaoException extends Exception {
    public DaoException() {
        super();
    }

    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaoException(Throwable cause) {
        super(cause);
    }
}
