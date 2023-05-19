package com.example.lab34.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loa {

    private String maLoa;

    private String tenLoa;

    private Integer congSuat;

    private String mauSac;

    private String kenhAmThanh;
}
