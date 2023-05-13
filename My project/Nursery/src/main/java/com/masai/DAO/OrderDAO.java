package com.masai.DAO;

import com.masai.Exception.SomeThingWentWrongException;

public interface OrderDAO {

	public void placeOrder(int plantId,int seedId,int planterId)throws  SomeThingWentWrongException;
}
