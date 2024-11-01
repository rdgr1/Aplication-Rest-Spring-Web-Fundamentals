package rod.spring.learning_fundamentals.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import rod.spring.learning_fundamentals.services.ProdutoNullException;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ProdutoControllerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ProdutoNullException.class)
    public ResponseEntity<Object> capturaErroNull(){
        Map<String,Object> body = new HashMap<>();
        body.put("message","Os campos não podem ser nulos, verifique os campos");
          return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
        }
}
