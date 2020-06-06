package com.paulo.framework.dao;

import com.alibaba.fastjson.JSON;
import com.paulo.framework.pojo.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class PersonMapperTest {

    @Resource
    PersonMapper personMapper;

    @Test
    void selectByPrimaryKey() {
        Person person = personMapper.selectByPrimaryKey(1L);

        System.out.println(JSON.toJSONString(person));
        Assert.assertNotNull(person);
    }

    @Test
    void insertSelective(){
        Person person = new Person();
        person.setName("Lily");
        person.setAge(18);
        int ret = personMapper.insertSelective(person);
        Assert.assertTrue(ret > 0);
    }
}