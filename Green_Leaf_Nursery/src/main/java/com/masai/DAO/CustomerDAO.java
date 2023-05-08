package com.masai.DAO;

import com.masai.Entity.Customer;
import com.masai.Exception.SomeThingWentWrongException;

public interface CustomerDAO {

	public void addCustomer(Customer cst) throws  SomeThingWentWrongException;
}
