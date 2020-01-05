package com.example.androidx;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Todo {

    private String titile;
    @PrimaryKey (autoGenerate = true)
    private Integer id;

    public String getTitile() {
        return titile;
    }

    public Integer getId() {
        return id;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "titile='" + titile + '\'' +
                ", id=" + id +
                '}';
    }
}

