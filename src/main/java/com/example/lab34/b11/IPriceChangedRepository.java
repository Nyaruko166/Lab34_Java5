package com.example.lab34.b11;

import com.example.lab34.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPriceChangedRepository extends JpaRepository<Product, Integer> {

//    @Query("""
//                    SELECT o.PurchasedMoney, o.CreatedDate
//                    FROM OrderDetail od
//                        LEFT JOIN [Order] o on o.OrderId = od.OrderId
//                    WHERE p.ProductId = :maSanPham
//                    ORDER BY o.CreatedDate
//            """)
//    List<PriceChanged> getPriceChangeOfProduct(@Param("maSanPham") Integer productId);

}
