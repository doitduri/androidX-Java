package com.example.androidx;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Todo {
    @PrimaryKey(autoGenerate = true)
    private Integer id;
    private String title;


    public Todo(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}

