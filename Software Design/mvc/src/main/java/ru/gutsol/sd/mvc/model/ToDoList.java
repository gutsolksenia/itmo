package ru.gutsol.sd.mvc.model;

/**
 * Created by ksenia on 08.12.17.
 */
public class ToDoList {
    private int id;
    private String name;

    public ToDoList(){}

    public ToDoList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}