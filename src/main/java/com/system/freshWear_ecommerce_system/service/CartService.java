package com.system.freshWear_ecommerce_system.service;

import com.system.freshWear_ecommerce_system.dto.CartDto;
import com.system.freshWear_ecommerce_system.entity.Cart;
import com.system.freshWear_ecommerce_system.entity.User;

import java.util.List;

public interface CartService {

    void addToCart(CartDto cartDto);

    List<Cart> getCartList(User user);

    List<Cart> getCartListByStatus(User user);

    List<Cart> getCartListByStatusUnpaid(User user);

    void deleteCart(int id);

    void editCart(CartDto cartDto);
}
