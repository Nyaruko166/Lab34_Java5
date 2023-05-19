package com.example.lab34.repository;

import com.example.lab34.model.Loa;

import java.util.List;

public interface ILoaRepository {

    List<Loa> getAll();

    void addLoa(Loa loa);

    void updateLoa(Loa loa);

    void deleteLoa(Loa loa);

    Loa findOne(String maLoa);

}
