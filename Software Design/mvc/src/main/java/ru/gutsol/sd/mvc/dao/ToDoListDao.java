package ru.gutsol.sd.mvc.dao;

import ru.gutsol.sd.mvc.model.ToDoList;

import java.util.List;

/**
 * @author gutsolksenia
 */

public interface ToDoListDao {
    int addToDoList(ToDoList toDoList);
    List<ToDoList> getToDoLists();
}