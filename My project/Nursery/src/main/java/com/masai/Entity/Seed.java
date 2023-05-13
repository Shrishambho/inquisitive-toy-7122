package com.masai.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Seed {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seedId;
	private String seedName;
	private int isBuyed;
    private String medicineOrOrdinaryUse;
    private String description;
    private int seedStock;
    private double cost;
    private int seedsPerPacket;
    
    @ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="planter_Id",joinColumns= {@JoinColumn(referencedColumnName="seedId")},inverseJoinColumns= {@JoinColumn(referencedColumnName="planterId")})
	private Set<Planter> planter;

	public Seed() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seed(String seedName, String medicineOrOrdinaryUse, String description, int seedStock, double cost,
			int seedsPerPacket, Set<Planter> planter) {
		super();
		this.seedName = seedName;
		this.medicineOrOrdinaryUse = medicineOrOrdinaryUse;
		this.description = description;
		this.seedStock = seedStock;
		this.cost = cost;
		this.seedsPerPacket = seedsPerPacket;
		this.planter = planter;
	}

	public int getSeedId() {
		return seedId;
	}

	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}

	public String getSeedName() {
		return seedName;
	}

	public void setSeedName(String seedName) {
		this.seedName = seedName;
	}

	public int getIsBuyed() {
		return isBuyed;
	}

	public void setIsBuyed(int isBuyed) {
		this.isBuyed = isBuyed;
	}

	public String getMedicineOrOrdinaryUse() {
		return medicineOrOrdinaryUse;
	}

	public void setMedicineOrOrdinaryUse(String medicineOrOrdinaryUse) {
		this.medicineOrOrdinaryUse = medicineOrOrdinaryUse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSeedStock() {
		return seedStock;
	}

	public void setSeedStock(int seedStock) {
		this.seedStock = seedStock;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getSeedsPerPacket() {
		return seedsPerPacket;
	}

	public void setSeedsPerPacket(int seedsPerPacket) {
		this.seedsPerPacket = seedsPerPacket;
	}

	public Set<Planter> getPlanter() {
		return planter;
	}

	public void setPlanter(Set<Planter> planter) {
		this.planter = planter;
	}
    
    
}
