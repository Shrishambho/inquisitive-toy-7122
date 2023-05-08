package com.masai.DAO;

import com.masai.Entity.Plant;
import com.masai.Entity.Seed;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;

public interface SeedDAO {

	public void addSeed(Seed seed)throws SomeThingWentWrongException;
	
	
}
