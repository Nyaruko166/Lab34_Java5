package com.example.lab34.service;

import com.example.lab34.model.Loa;

import java.util.List;

public interface ILoaService {
    List<Loa> getAll();

    void addLoa(Loa loa);

    void updateLoa(Loa loa);

    void deleteLoa(Loa loa);

    Loa findOne(String maLoa);
}
