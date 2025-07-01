package com.example.springExceptionDemo.exception;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {

    private LocalDateTime timestamp;
    private String message;
    private String details;
//
//    public ErrorResponse(LocalDateTime timestamp, String message, String details) {
//        this.timestamp = timestamp;
//        this.message = message;
//        this.details = details;
//    }
//
//    // Getters
//    public LocalDateTime getTimestamp() { return timestamp; }
//    public String getMessage() { return message; }
//    public String getDetails() { return details; }
}

