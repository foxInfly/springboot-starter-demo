package com.gupao.example.springbootstarterdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootStarterDemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void addData(){
        String sql = "insert into user_info(name,age) values('pupu',18)";


        jdbcTemplate.execute(sql);
    }

}
