package com.example.lab34.service;

import com.example.lab34.model.MonHoc;
import com.example.lab34.repository.IMonHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonHocService implements IMonHocService {

    @Autowired
    private IMonHocRepository monHocRepository;

    @Override
    public List<MonHoc> getAll() {
        return monHocRepository.getAll();
    }

    @Override
    public void addMH(MonHoc mh) {
        monHocRepository.addMH(mh);
    }

    @Override
    public void deleteMH(MonHoc mh) {
        monHocRepository.deleteMH(mh);
    }

    @Override
    public MonHoc findOne(String maMH) {
        return monHocRepository.findOne(maMH);
    }
}
