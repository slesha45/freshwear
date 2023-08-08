package com.system.freshWear_ecommerce_system.service;

import com.system.freshWear_ecommerce_system.entity.Bill;

import java.util.List;

public interface BillService {

    void generateBill();

    List<Bill> getAllBillsByUser(int id);

    List<Bill> getBillForTenDays();
}
