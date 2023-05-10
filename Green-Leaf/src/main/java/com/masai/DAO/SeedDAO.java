package com.masai.DAO;

import java.util.List;

import com.masai.Entity.Plant;
import com.masai.Entity.Seed;
import com.masai.Exception.SomeThingWentWrongException;

public interface SeedDAO {

	public void addSeed(Seed seed)throws SomeThingWentWrongException;
	public List<Seed> getAllSeeds() throws SomeThingWentWrongException;
}
