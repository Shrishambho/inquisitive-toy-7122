package com.masai.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

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
	@Column(name = "is_buyed", nullable = false)
	private int isDeleted;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="planterId")
	private Set<Plant> plant;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="planterId")
	private Set<Seed> seed;

	@OneToMany(mappedBy = "planter", cascade = CascadeType.ALL)
	private Set<Order> orderset;

	public Planter(double height, int capacity, int drinageHoles, String planterColor, String planterShape,
			int planterStock, double planterCost, Set<Plant> plant, Set<Seed> seed, Set<Order> orderset) {
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
		this.orderset = orderset;
	}

	public Planter() {
		super();
		// TODO Auto-generated constructor stub
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

	public Set<Order> getOrderset() {
		return orderset;
	}

	public void setOrderset(Set<Order> orderset) {
		this.orderset = orderset;
	}
	
	
	
	
}
