package com.example.lab34.b12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GioHangViewModel {

    private List<SanPhamTrongGioViewModel> sanPham;

    private BigDecimal tongTien;

}
