package com.sagar.todospringbootapplication.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "todo")
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean complete;

    @Getter
    @Setter
    private Instant createdDate;
    @Getter
    @Setter
    private Instant modifiedDate;

    public TodoItem(String description){
        this.description= description;
        this.complete=false;
        this.createdDate=Instant.now();
        this.modifiedDate=Instant.now();
    }
    public TodoItem() {}
    @Override
    public String toString(){
        return String.format("TodoItem{id=%d, descrption='%s',complete='%s',createdDate='%s',modifiedDate='%s'}",id,description,complete,createdDate,modifiedDate);
    }


}
