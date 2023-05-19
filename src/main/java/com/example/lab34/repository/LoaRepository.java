package com.example.lab34.repository;

import com.example.lab34.model.Loa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LoaRepository implements ILoaRepository {

    private static final List<Loa> lstLoa = new ArrayList<>();

    static {
        lstLoa.add(new Loa("L01", "Loa Marshall", 1000, "Đỏ", "Stereo"));
        lstLoa.add(new Loa("L02", "Loa JBL", 1100, "Hồng", "Stereo1"));
        lstLoa.add(new Loa("L03", "Loa Bose", 1020, "Cam", "Stereo1"));
        lstLoa.add(new Loa("L04", "Loa Sony", 1003, "Đỏ", "Stereo"));
        lstLoa.add(new Loa("L05", "Loa LG", 1110, "Hồng", "Stereo"));
    }

    @Override
    public List<Loa> getAll() {
        return lstLoa;
    }

    @Override
    public void addLoa(Loa loa) {
        lstLoa.add(loa);
    }

    @Override
    public void updateLoa(Loa loa) {
        for (int i = 0; i < lstLoa.size(); i++)
            if (lstLoa.get(i).getMaLoa().equals(loa.getMaLoa())) {
                lstLoa.set(i, loa);
            }
    }

    @Override
    public void deleteLoa(Loa loa) {
        lstLoa.remove(loa);
    }

    @Override
    public Loa findOne(String maLoa) {
        for (Loa x : lstLoa) {
            if (x.getMaLoa().equals(maLoa)) {
                return x;
            }
        }
        return null;
    }
}
