package com.example.back_dgi.helpers.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;
@Data
public class MyAppResponse {
    private  final String message;
    private  final HttpStatus httpStatus;
    private  final ZonedDateTime timeStamp;
    public MyAppResponse(String message, HttpStatus httpStatus, ZonedDateTime timeStamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timeStamp = timeStamp;
    }
}
