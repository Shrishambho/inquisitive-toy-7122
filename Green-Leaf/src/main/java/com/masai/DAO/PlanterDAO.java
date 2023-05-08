package com.masai.DAO;

import com.masai.Entity.Planter;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;

public interface PlanterDAO {

	public void addPlanter(Planter planter)throws SomeThingWentWrongException;
	public void updatePlanter(int pid,int sid,int plid)throws SomeThingWentWrongException,NoRecordFoundException;
}
