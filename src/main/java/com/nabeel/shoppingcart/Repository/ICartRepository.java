package com.nabeel.shoppingcart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nabeel.shoppingcart.Model.Cart;

public interface ICartRepository extends JpaRepository<Cart, Long>{
    
}
