package com.example.lab34.repository;

import com.example.lab34.model.MonHoc;

import java.util.List;

public interface IMonHocRepository {

    List<MonHoc> getAll();

    void addMH(MonHoc mh);

    void deleteMH(MonHoc mh);

    MonHoc findOne(String maMH);
}
