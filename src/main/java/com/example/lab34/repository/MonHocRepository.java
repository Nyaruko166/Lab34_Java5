package com.example.lab34.repository;

import com.example.lab34.model.MonHoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MonHocRepository implements IMonHocRepository {

    private static final List<MonHoc> lstMH = new ArrayList<>();

    static {
        lstMH.add(new MonHoc("MH01", "Java 1", 10, "PTPM", "TienNH21, NguyenVV4", true));
        lstMH.add(new MonHoc("MH02", "Java 2", 12, "PTPM", "TienNH21, MinhDQ8", true));
        lstMH.add(new MonHoc("MH03", "C# 1", 11, "PTPM", "DungNA29, NguyenVV4", true));
        lstMH.add(new MonHoc("MH04", "PHP", 13, "WEB", "DungNA29, NguyenVV4", false));
        lstMH.add(new MonHoc("MH05", "JS", 14, "WEB", "TienNH21, NguyenVV4", true));
    }

    @Override
    public List<MonHoc> getAll() {
        return lstMH;
    }

    @Override
    public void addMH(MonHoc mh) {
        lstMH.add(mh);
    }

    @Override
    public void deleteMH(MonHoc mh) {
        lstMH.remove(mh);
    }

    @Override
    public MonHoc findOne(String maMH) {
        for (MonHoc x : lstMH) {
            if (x.getMaMon().equals(maMH)) {
                return x;
            }
        }
        return null;
    }
}
