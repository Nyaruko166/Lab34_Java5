package com.example.lab34.b11;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//@AllArgsConstructor
public class OrderVangLai {

    private Integer id;

    private Date createdDate;

    public Integer getId() {
        return id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public OrderVangLai(Integer id, Date createdDate) {
        this.id = id;
        this.createdDate = createdDate;
    }

    public OrderVangLai() {
    }
}
