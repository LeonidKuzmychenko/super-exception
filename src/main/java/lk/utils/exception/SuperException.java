package lk.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class SuperException extends RuntimeException {

    private HttpStatus httpStatus;

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public SuperException(HttpStatus httpStatus) {
        super();
        this.httpStatus = httpStatus;
    }

    public SuperException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public ResponseEntity<String> getStringResponseEntity() {
        return new ResponseEntity<>(getMessage(), getHttpStatus());
    }

    public ResponseEntity<Void> getVoidResponseEntity() {
        return new ResponseEntity<>(getHttpStatus());
    }

    private SuperException() {

    }

    private SuperException(String message) {
        super(message);
    }

    private SuperException(String message, Throwable cause) {
        super(message, cause);
    }

    private SuperException(Throwable cause) {
        super(cause);
    }

    private SuperException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
