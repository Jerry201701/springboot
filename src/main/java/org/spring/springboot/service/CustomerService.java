package org.spring.springboot.service;

import java.util.List;

import com.github.pagehelper.Page;
import org.spring.springboot.domain.Customers;

public interface CustomerService {
	
 List<Customers>  findAllCustomers();
 Customers getCustomerById(Long id);
 List<Customers> getCustomersByName(Customers customer);
 int addCustomers(Customers customer);
 int updateCustomer(Customers customer);
 int moveCustomers(Customers customers);
 List<Customers> queryOnConditions(Customers customers);
 Page<Customers> findByPage(int pageNo, int pageSize);

}