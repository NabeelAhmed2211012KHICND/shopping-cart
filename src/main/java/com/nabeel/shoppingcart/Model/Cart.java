package com.nabeel.shoppingcart.Model;

import org.hibernate.internal.build.AllowSysOut;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart")
@Getter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private Long productId;
    @Setter
    private Integer quantity;
    @Setter
    private long price;
  
}
