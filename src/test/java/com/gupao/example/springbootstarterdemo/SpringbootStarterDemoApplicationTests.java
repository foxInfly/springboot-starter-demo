package com.gupao.example.springbootstarterdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootStarterDemoApplicationTests {

    @Test
    public void contextLoads() {
//        System.out.println(dataSource.getClass());
    }


    @Autowired
    JdbcTemplate db1JdbcTemplate;

    @Resource(name = "db2JdbcTemplate")
    JdbcTemplate jdbcTemplate;
//    @Autowired
//    DataSource dataSource;

    @Test
    public void addData(){
        String sql = "insert into user_info(name,age) values('pupu',18)";


        db1JdbcTemplate.execute(sql);
    }

    @Test
    public void addData2(){
        String sql = "insert into user_info(name,age) values('pupu2',18)";


        jdbcTemplate.execute(sql);
    }

}
