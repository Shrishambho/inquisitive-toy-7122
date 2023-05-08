package com.masai.DAO;

import com.masai.Entity.Customer;
import com.masai.Entity.Plant;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;

public interface CustomerDAO {

	public void addCustomer(Customer cst) throws  SomeThingWentWrongException;
	public Customer findCustomer(String username)throws SomeThingWentWrongException,NoRecordFoundException;
	public void updateCustomer(Customer customer)throws SomeThingWentWrongException,NoRecordFoundException;
	public void customerLogin(String username, String password)throws SomeThingWentWrongException;
	
	
}
