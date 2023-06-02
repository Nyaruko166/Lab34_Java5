package com.example.lab34.repository;

import com.example.lab34.model.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISanPhamRepository extends JpaRepository<SanPham, Integer> {

    Page<SanPham> findByTenSanPhamContains(String tenSanPham, Pageable pageable);

}
