package com.system.freshWear_ecommerce_system.service;

import com.system.freshWear_ecommerce_system.entity.UserHistory;

import java.util.List;

public interface UserHistoryService {


    void generateAllUserHistory();

    List<UserHistory> getAllUserHistoryByUser(int id);


}
