package ru.gutsol.sd.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.gutsol.sd.mvc.dao.ToDoListJdbcDao;

import javax.sql.DataSource;

/**
 * @author gutsolksenia
 */
public class JdbcDaoContextConfiguration {
    @Bean
    public ToDoListJdbcDao productJdbcDao(DataSource dataSource) {
        return new ToDoListJdbcDao(dataSource);
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.sqlite.JDBC");
        dataSource.setUrl("jdbc:sqlite:ToDo.db");
        dataSource.setUsername("");
        dataSource.setPassword("");
        return dataSource;
    }
}