package com.medipol.ecommerce.service;

import com.medipol.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<Product>();

    public ProductService() {

        products.add(new Product(1, "nike air", 200));
        products.add(new Product(2, "addidas", 300));
    }

    public void add(String name, Integer quantity){
        //TODO
    }

    public void delete(Integer id) {
        //TODO
    }

    public void update(Integer id, String name, Integer price){
        //TODO
    }

    public List<Product> list(){
        return products;
    }
}
