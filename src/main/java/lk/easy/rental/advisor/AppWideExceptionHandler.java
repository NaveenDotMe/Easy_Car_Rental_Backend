package lk.easy.rental.advisor;

import lk.easy.rental.exception.DuplicateEntryException;
import lk.easy.rental.exception.NotFoundException;
import lk.easy.rental.exception.ValidationException;
import lk.easy.rental.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@CrossOrigin
@RestControllerAdvice
public class AppWideExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseUtil> exceptionHandler(Exception e){
        return new ResponseEntity<>(new ResponseUtil(500, "Error", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ResponseUtil> handleNotFondException(Exception e) {
        return new ResponseEntity<>(new ResponseUtil(404, "Error", e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ResponseUtil> handleValidationException(Exception e) {
        return new ResponseEntity<>(new ResponseUtil(500, "Error", e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DuplicateEntryException.class)
    public ResponseEntity<ResponseUtil> duplicateEntryException(Exception e) {
        return new ResponseEntity<>(new ResponseUtil(500, "Error", e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
