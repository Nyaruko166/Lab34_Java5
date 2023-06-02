package com.example.lab34.b12;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Map;

@Repository
@SessionScope
public class GioHangRepository {

    private GioHangDomainModel gioHang = new GioHangDomainModel();

    public void themSP(Integer maSP, Integer soLuong) {
        Map<Integer, Integer> sanPhamTrongGio = gioHang.getDanhSachSP();
        sanPhamTrongGio.put(maSP, soLuong);
    }

    public void suaSoLuongSPTrongGio(Integer maSP, Integer soLuongCapNhat) {
        Map<Integer, Integer> sanPhamTrongGio = gioHang.getDanhSachSP();
        Integer soLuongHienCo = sanPhamTrongGio.get(maSP);
        sanPhamTrongGio.put(maSP, soLuongHienCo + soLuongCapNhat);
    }

    public GioHangDomainModel layGioHang() {
        return gioHang;
    }

    public Integer laySoLuongSPTrongGio(Integer maSP){
        return gioHang.getDanhSachSP().get(maSP);
    }

    public Boolean sanPhamDaCo(Integer maSP) {
        return gioHang.getDanhSachSP().containsKey(maSP);
    }
}
