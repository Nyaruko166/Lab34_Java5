package com.example.lab34.b12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SanPhamTrongGioViewModel {

    private Integer maSP;

    private String tenSP;

    private BigDecimal donGia;

    private Integer soLuong;

    public BigDecimal getThanhTien() {
        return donGia.multiply(BigDecimal.valueOf(soLuong));
    }

}
