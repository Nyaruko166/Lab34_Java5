package com.example.lab34.service;

import com.example.lab34.model.MonHoc;

import java.util.List;

public interface IMonHocService {
    List<MonHoc> getAll();

    void addMH(MonHoc mh);

    void deleteMH(MonHoc mh);
}
