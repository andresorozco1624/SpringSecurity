package com.example.demo.services;

import com.example.demo.contracts.ProductDto;
import com.example.demo.entities.ProductEntity;
import com.example.demo.repositories.ProductRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto>  getAllProducts (){

        List<ProductEntity> productEntities = productRepository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();

        for (ProductEntity r: productEntities ){
            ProductDto productDto = ProductDto.builder()
                    .id(r.getId())
                    .name(r.getName())
                    .price(r.getPrice())
                    .build();
            productDtos.add(productDto);
        }

        return productDtos;
    }

    public ProductEntity createOneProduct(ProductDto productDto){
        ProductEntity productEntity = ProductEntity.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .price(productDto.getPrice())
                .build();
       return productRepository.save(productEntity);
    }
}
