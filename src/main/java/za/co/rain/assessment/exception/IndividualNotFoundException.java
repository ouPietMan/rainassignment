package za.co.rain.assessment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class IndividualNotFoundException extends RuntimeException{

    public IndividualNotFoundException() {
    }

    public IndividualNotFoundException(String message) {
        super(message);
    }
}
