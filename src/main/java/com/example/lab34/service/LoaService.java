package com.example.lab34.service;

import com.example.lab34.model.Loa;
import com.example.lab34.repository.ILoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaService implements ILoaService {

    @Autowired
    private ILoaRepository repository;

    @Override
    public List<Loa> getAll() {
        return repository.getAll();
    }

    @Override
    public void addLoa(Loa loa) {
        repository.addLoa(loa);
    }

    @Override
    public void updateLoa(Loa loa) {
        repository.updateLoa(loa);
    }

    @Override
    public void deleteLoa(Loa loa) {
        repository.deleteLoa(loa);
    }

    @Override
    public Loa findOne(String maLoa) {
        return repository.findOne(maLoa);
    }
}
