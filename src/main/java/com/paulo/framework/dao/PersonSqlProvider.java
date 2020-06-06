package com.paulo.framework.dao;

import com.paulo.framework.pojo.Person;
import org.apache.ibatis.jdbc.SQL;

public class PersonSqlProvider {

    public String insertSelective(Person record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("person");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.VALUES("age", "#{age,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Person record) {
        SQL sql = new SQL();
        sql.UPDATE("person");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{age,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}