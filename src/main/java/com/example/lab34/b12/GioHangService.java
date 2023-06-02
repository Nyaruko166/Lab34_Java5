package com.example.lab34.b12;

import com.example.lab34.model.Product;
import com.example.lab34.model.SanPham;
import com.example.lab34.repository.IProductRepository;
import com.example.lab34.repository.ISanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GioHangService {

    @Autowired
    private GioHangRepository repository;

    @Autowired
    private IProductRepository sanPhamRepository;

    public void themSPVaoGio(Integer maSP, Integer soLuongThem) {
        if (repository.sanPhamDaCo(maSP)) {
            repository.themSP(maSP, soLuongThem);
        } else {
            Integer soLuongHienCo = repository.laySoLuongSPTrongGio(maSP);
            Integer soLuongCongDon = soLuongHienCo + soLuongThem;
            repository.suaSoLuongSPTrongGio(maSP, soLuongCongDon);
        }
    }

    public void boSPKhoiGio(Integer maSP, Integer soLuongBo) {

    }

    public GioHangViewModel xemGioHang(Integer maSP, Integer soLuongBo) {
        GioHangDomainModel gioHangDomainModel = repository.layGioHang();
        Map<Integer, Integer> danhSachSP = gioHangDomainModel.getDanhSachSP();

        GioHangViewModel gioHangViewModel = new GioHangViewModel();
        for (Map.Entry<Integer, Integer> sp : danhSachSP.entrySet()) {
            Integer maSanPham = sp.getKey();
            Integer soLuong = sp.getValue();
            SanPhamTrongGioViewModel sptg = new SanPhamTrongGioViewModel();
            Product sanPham = sanPhamRepository.findById(maSanPham).get();
            sptg.setMaSP(maSP);
            sptg.setSoLuong(soLuong);
            sptg.setDonGia(sanPham.getPrice());
            sptg.setTenSP(sanPham.getProductName());

            gioHangViewModel.getSanPham().add(sptg);
        }
        return null;
    }
}
