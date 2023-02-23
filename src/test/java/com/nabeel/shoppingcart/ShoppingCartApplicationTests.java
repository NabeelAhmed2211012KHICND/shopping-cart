package com.nabeel.shoppingcart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.nabeel.shoppingcart.Model.Cart;

@SpringBootTest
class ShoppingCartApplicationTests {

	@Test
	void contextLoads() {
	}
@Test
	void getAndSetCartID(){
		Cart cut = new Cart();
		Long myid = 1L;
		cut.setId(myid);
		assertEquals(myid, cut.getId());
	}
	@Test
	void getAndSetproductId(){
		Cart cut = new Cart();
		Long myproductId = 1L;
		cut.setProductId(myproductId);
		assertEquals(myproductId, cut.getProductId());
	}
	@Test
	void getAndSetQuantity(){
		Cart cut = new Cart();
		Integer myQuantity = 1;
		cut.setQuantity(myQuantity);
		assertEquals(myQuantity, cut.getQuantity());
	}
	@Test
	void getAndSetproductprice(){
		Cart cut = new Cart();
		Long myPrice = 1L;
		cut.setPrice(myPrice);
		assertEquals(myPrice, cut.getPrice());
	}




}
