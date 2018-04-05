package ru.gutsol.sd.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.gutsol.sd.mvc.dao.ToDoListDao;
import ru.gutsol.sd.mvc.model.ToDoList;

/**
 * @author gutsolksenia
 */

@Controller
public class ToDoController {
    @Autowired
    ToDoListDao toDoListDao;

    @RequestMapping(value = "/lists", method = RequestMethod.GET)
    public String getLists(ModelMap map) {
        map.addAttribute("lists", toDoListDao.getToDoLists());
        map.addAttribute("newList", new ToDoList());
        return "index";
    }

    @RequestMapping(value = "/add-list", method = RequestMethod.POST)
    public String addList(@ModelAttribute("newList") ToDoList newList) {
        toDoListDao.addToDoList(newList);
        return "redirect:/lists";
    }
}