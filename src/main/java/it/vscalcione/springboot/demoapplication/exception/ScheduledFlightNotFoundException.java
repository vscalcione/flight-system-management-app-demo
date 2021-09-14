package it.vscalcione.springboot.demoapplication.exception;

public class ScheduledFlightNotFoundException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public ScheduledFlightNotFoundException(String message) {
        super(message);
    }
}
