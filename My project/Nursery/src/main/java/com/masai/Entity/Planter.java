package com.masai.Entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Planter {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int planterId;
	private double height;
	private int capacity;
	private int drinageHoles;
	private String planterColor;
	private String planterShape;
	private int planterStock;
	private double planterCost;
	private int isBuyed;
	@ManyToMany(mappedBy="planter")
	private Set<Plant> plant;
	
	@ManyToMany(mappedBy="planter")
	private Set<Seed> seed;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;

	public Planter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Planter(double height, int capacity, int drinageHoles, String planterColor, String planterShape,
			int planterStock, double planterCost, Set<Plant> plant, Set<Seed> seed, Order order) {
		super();
		this.height = height;
		this.capacity = capacity;
		this.drinageHoles = drinageHoles;
		this.planterColor = planterColor;
		this.planterShape = planterShape;
		this.planterStock = planterStock;
		this.planterCost = planterCost;
		this.plant = plant;
		this.seed = seed;
		this.order = order;
	}

	public int getPlanterId() {
		return planterId;
	}

	public void setPlanterId(int planterId) {
		this.planterId = planterId;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDrinageHoles() {
		return drinageHoles;
	}

	public void setDrinageHoles(int drinageHoles) {
		this.drinageHoles = drinageHoles;
	}

	public String getPlanterColor() {
		return planterColor;
	}

	public void setPlanterColor(String planterColor) {
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

	public double getPlanterCost() {
		return planterCost;
	}

	public void setPlanterCost(double planterCost) {
		this.planterCost = planterCost;
	}

	public int getIsBuyed() {
		return isBuyed;
	}

	public void setIsBuyed(int isBuyed) {
		this.isBuyed = isBuyed;
	}

	public Set<Plant> getPlant() {
		return plant;
	}

	public void setPlant(Set<Plant> plant) {
		this.plant = plant;
	}

	public Set<Seed> getSeed() {
		return seed;
	}

	public void setSeed(Set<Seed> seed) {
		this.seed = seed;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
