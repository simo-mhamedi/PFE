package com.example.back_dgi.helpers.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.ZoneId;
import java.time.ZonedDateTime;
@ControllerAdvice
public class MyAppExceptionHandler {
    @ExceptionHandler(value = {MyAppException.class})
    private ResponseEntity<Object> mAppExceptionHandler(MyAppException e){
        HttpStatus badRequest=HttpStatus.BAD_REQUEST;
        MyAppResponse myAppResponse = new MyAppResponse(
                e.getMessage(),
               badRequest,
                ZonedDateTime.now(ZoneId.of("Z")));
       return  new ResponseEntity<>(myAppResponse,badRequest);
    }
}
