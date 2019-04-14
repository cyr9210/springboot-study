package bong.springboot153;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class SampleControllerAdvice {

//    @ExceptionHandler(SampleException.class)
//    public @ResponseBody ResponseEntity<AppError> sampleError(SampleException e){
//        AppError appError = new AppError();
//        appError.setMessage("error.app.key");
//        appError.setReasons("I don't know");
//        return new ResponseEntity<>(appError, HttpStatus.OK);
//    }
}
