package com.example.lab34.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonHoc {

    private String maMon;

    private String tenMon;

    private Integer soTinChi;

    private String chuyenNganh;

    private String giangVien;

    private Boolean batBuoc;
}
