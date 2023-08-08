package com.system.freshWear_ecommerce_system.repo;

import com.system.freshWear_ecommerce_system.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BillRepo extends JpaRepository<Bill, Integer> {
    @Query(value = "select * from bill where user_id=?1", nativeQuery = true)
    List<Bill> findAllByUser(int id);

    @Query(value="select * from bill  where user_id=?1 and date between ?2 and ?3 order by date ",nativeQuery = true)
    List<Bill> findBillForTenDays(int id, LocalDate startDate, LocalDate endDate);
}
