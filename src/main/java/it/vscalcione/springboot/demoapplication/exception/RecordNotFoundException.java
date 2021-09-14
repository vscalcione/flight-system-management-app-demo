package it.vscalcione.springboot.demoapplication.exception;

public class RecordNotFoundException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public RecordNotFoundException(String message) {
        super(message);
    }
}
