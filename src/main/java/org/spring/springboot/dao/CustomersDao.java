package org.spring.springboot.dao;

import java.util.List;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.spring.springboot.domain.Customers;
import org.spring.springboot.tkmapper.MyMapper;
import org.springframework.stereotype.Component;
@Mapper
@Component
public interface CustomersDao extends MyMapper<Customers>{
 @Select("select id,name,phone,email,school,education,profession,profile from customers")
 List<Customers> findAll();
 Customers getOneById(Long id);
 //Customers getOneByName(String name);
 Page<Customers>findByPage();
 
}
