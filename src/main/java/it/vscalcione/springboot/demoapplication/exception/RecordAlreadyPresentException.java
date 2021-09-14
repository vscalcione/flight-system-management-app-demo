package it.vscalcione.springboot.demoapplication.exception;

public class RecordAlreadyPresentException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public RecordAlreadyPresentException(String message) {
        super(message);
    }
}
