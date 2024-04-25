package com.example.demo.controllers;

import com.example.demo.contracts.ProductDto;
import com.example.demo.entities.ProductEntity;
import com.example.demo.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public ResponseEntity<List<ProductDto>> getAllProducts (){
        List<ProductDto> productDtos = productService.getAllProducts();

        if (productDtos != null && !productDtos.isEmpty()){
                return ResponseEntity.ok(productDtos);
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<ProductEntity> createOneProduct(@RequestBody @Valid ProductDto productDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.createOneProduct(productDto));
    }


}
