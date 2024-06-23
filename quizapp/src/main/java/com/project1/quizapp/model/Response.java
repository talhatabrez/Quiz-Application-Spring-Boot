package com.project1.quizapp.model;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
    private Integer id;
    private String response;
    public Object getResponse() {
        throw new UnsupportedOperationException("Unimplemented method 'getResponse'");
        
    }   
}
