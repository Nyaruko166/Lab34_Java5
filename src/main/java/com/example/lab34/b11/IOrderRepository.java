package com.example.lab34.b11;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Integer> {

    @Query("""
            SELECT o FROM Order o ORDER BY o.createdDate
            """)
    List<Order> timHet();

    @Query("""
            SELECT o FROM Order o WHERE o.customerNumber like :sdt
            """)
    List<Order> timHoaDonTheo(@Param("sdt") String sdt);

    @Query("""
            SELECT new com.example.lab34.b11.OrderVangLai(o.id, o.createdDate) FROM Order o WHERE o.customerNumber IS NULL
            """)
    List<OrderVangLai> timHoaDonTheoKhachVangLai();
}
