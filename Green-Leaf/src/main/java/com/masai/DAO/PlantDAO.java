package com.masai.DAO;

import com.masai.Entity.Plant;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;

public interface PlantDAO {

	public void addPlant(Plant plant)throws SomeThingWentWrongException;
	public Plant findPlant(int id)throws SomeThingWentWrongException, NoRecordFoundException;
}
