package com.nabeel.shoppingcart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nabeel.shoppingcart.Model.Cart;
import com.nabeel.shoppingcart.Repository.ICartRepository;

@RestController
@RequestMapping("/cart")
@CrossOrigin("*")

public class CartController {

    @Autowired
    private ICartRepository repo;

    @PostMapping("/addcart")
    public void addcart(@RequestBody Cart cart) {
        repo.save(cart);
    }

    @GetMapping("/getcart")
    private List<Cart> getcart() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    private void deleteById(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @DeleteMapping("/all")
    private void deleteAlldata() {
        repo.deleteAll();
    }

}
