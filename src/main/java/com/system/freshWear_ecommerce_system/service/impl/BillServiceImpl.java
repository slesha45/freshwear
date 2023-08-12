package com.system.freshWear_ecommerce_system.service.impl;

import com.system.freshWear_ecommerce_system.entity.Bill;
import com.system.freshWear_ecommerce_system.entity.Cart;
import com.system.freshWear_ecommerce_system.entity.User;
import com.system.freshWear_ecommerce_system.repo.BillRepo;
import com.system.freshWear_ecommerce_system.repo.CartRepo;
import com.system.freshWear_ecommerce_system.service.BillService;
import com.system.freshWear_ecommerce_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService {
    private  final BillRepo billRepo;
    private final CartRepo cartRepo;
    private final UserService userService;
    @Override
    public void generateBill() {
        Bill bill = new Bill();
        User user=userService.getActiveUser().get();
        bill.setUser(user);
        List<Cart> cartList=cartRepo.findAllByUserAndStatusUnpaid(user.getId());
        double total=0;
        for(Cart cart:cartList){
            total+=cart.getTotalPrice();
        }
        bill.setTotal(total);

        LocalDateTime localDateTime=LocalDateTime.now();
        bill.setDate(localDateTime);

        billRepo.save(bill);

        for(Cart cart:cartList){
            cart.setStatus("Paid");
            cart.setBill(bill);
            cartRepo.save(cart);
        }

    }

    @Override
    public List<Bill> getAllBillsByUser(int id) {
        return billRepo.findAllByUser(id);
    }

    @Override
    public List<Bill> getBillForTenDays() {
        User user=userService.getActiveUser().get();
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDate startDate=localDateTime.toLocalDate().minusDays(10);
        LocalDate endDate=localDateTime.toLocalDate().plusDays(1);
        return billRepo.findBillForTenDays(user.getId(),startDate,endDate);
    }
}
