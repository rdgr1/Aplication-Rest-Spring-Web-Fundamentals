package rod.spring.learning_fundamentals.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rod.spring.learning_fundamentals.models.ProdutoModel;
import rod.spring.learning_fundamentals.services.ProdutoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
        @Autowired
        ProdutoService produtoService;

        @PostMapping(value = "/save")
        public ResponseEntity<ProdutoModel> salvaProduto(@RequestBody ProdutoModel produtoModel){
            return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produtoModel));
        }
        @GetMapping(value = "/{id}")
        public ResponseEntity<ProdutoModel> findById(@PathVariable(value = "id") Long id){
            return ResponseEntity.status(HttpStatus.OK).body(produtoService.findById(id));
        }
        @GetMapping
        public ResponseEntity<List<ProdutoModel>> getAllProducts(){
            return  ResponseEntity.status(HttpStatus.OK).body(produtoService.findAll());
        }
}
