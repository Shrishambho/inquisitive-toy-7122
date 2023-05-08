package com.masai.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Planter {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int planterId;
	private double planterHeight;
	private int planterCapacity;
	private int drinageHoles;
	private int planterColor;
	private String planterShape;
	private int planterStock;
	private int planterCost;
	private Plant plant;
	private Seed seed;
	public Planter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planter(double planterHeight, int planterCapacity, int drinageHoles, int planterColor, String planterShape,
			int planterStock, int planterCost, Plant plant, Seed seed) {
		super();
		this.planterHeight = planterHeight;
		this.planterCapacity = planterCapacity;
		this.drinageHoles = drinageHoles;
		this.planterColor = planterColor;
		this.planterShape = planterShape;
		this.planterStock = planterStock;
		this.planterCost = planterCost;
		this.plant = plant;
		this.seed = seed;
	}
	public int getPlanterId() {
		return planterId;
	}
	public void setPlanterId(int planterId) {
		this.planterId = planterId;
	}
	public double getPlanterHeight() {
		return planterHeight;
	}
	public void setPlanterHeight(double planterHeight) {
		this.planterHeight = planterHeight;
	}
	public int getPlanterCapacity() {
		return planterCapacity;
	}
	public void setPlanterCapacity(int planterCapacity) {
		this.planterCapacity = planterCapacity;
	}
	public int getDrinageHoles() {
		return drinageHoles;
	}
	public void setDrinageHoles(int drinageHoles) {
		this.drinageHoles = drinageHoles;
	}
	public int getPlanterColor() {
		return planterColor;
	}
	public void setPlanterColor(int planterColor) {
		this.planterColor = planterColor;
	}
	public String getPlanterShape() {
		return planterShape;
	}
	public void setPlanterShape(String planterShape) {
		this.planterShape = planterShape;
	}
	public int getPlanterStock() {
		return planterStock;
	}
	public void setPlanterStock(int planterStock) {
		this.planterStock = planterStock;
	}
	public int getPlanterCost() {
		return planterCost;
	}
	public void setPlanterCost(int planterCost) {
		this.planterCost = planterCost;
	}
	public Plant getPlant() {
		return plant;
	}
	public void setPlant(Plant plant) {
		this.plant = plant;
	}
	public Seed getSeed() {
		return seed;
	}
	public void setSeed(Seed seed) {
		this.seed = seed;
	}
	
	
	
}
