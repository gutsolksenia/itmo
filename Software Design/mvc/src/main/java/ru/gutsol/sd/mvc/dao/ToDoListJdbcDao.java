package ru.gutsol.sd.mvc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import ru.gutsol.sd.mvc.model.ToDoList;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;

/**
 * @author gutsolksenia
 */
public class ToDoListJdbcDao extends JdbcDaoSupport implements ToDoListDao {

    public ToDoListJdbcDao(DataSource dataSource) {
        super();
        setDataSource(dataSource);
    }

    @Override
    public int addToDoList(ToDoList toDoList) {
        String sql = "INSERT INTO LIST (NAME) VALUES (?)";
        return getJdbcTemplate().update(sql, new Object[] { toDoList.getName()});
    }

    @Override
    public List<ToDoList> getToDoLists() {
        String sql = "SELECT * FROM LIST";
        return getToDoListsByRequest(sql);
    }

    private List<ToDoList> getToDoListsByRequest(String sql) {
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(ToDoList.class));
    }
}