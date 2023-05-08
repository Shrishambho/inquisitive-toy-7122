package com.masai.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seed {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seedId;

	private String commonName;
	private String bloomTime;
	private String watering;
	private String difficultyLevel;
	private String temperature;
	private String typeOfSeed;
	private String seedsDescription;
	private String seedsStock;
	private double seedsCost;
	private int seedsPerPacket;
	public Seed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seed(String commonName, String bloomTime, String watering, String difficultyLevel, String temperature,
			String typeOfSeed, String seedsDescription, String seedsStock, double seedsCost, int seedsPerPacket) {
		super();
		this.commonName = commonName;
		this.bloomTime = bloomTime;
		this.watering = watering;
		this.difficultyLevel = difficultyLevel;
		this.temperature = temperature;
		this.typeOfSeed = typeOfSeed;
		this.seedsDescription = seedsDescription;
		this.seedsStock = seedsStock;
		this.seedsCost = seedsCost;
		this.seedsPerPacket = seedsPerPacket;
	}
	public int getSeedId() {
		return seedId;
	}
	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public String getBloomTime() {
		return bloomTime;
	}
	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}
	public String getWatering() {
		return watering;
	}
	public void setWatering(String watering) {
		this.watering = watering;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getTypeOfSeed() {
		return typeOfSeed;
	}
	public void setTypeOfSeed(String typeOfSeed) {
		this.typeOfSeed = typeOfSeed;
	}
	public String getSeedsDescription() {
		return seedsDescription;
	}
	public void setSeedsDescription(String seedsDescription) {
		this.seedsDescription = seedsDescription;
	}
	public String getSeedsStock() {
		return seedsStock;
	}
	public void setSeedsStock(String seedsStock) {
		this.seedsStock = seedsStock;
	}
	public double getSeedsCost() {
		return seedsCost;
	}
	public void setSeedsCost(double seedsCost) {
		this.seedsCost = seedsCost;
	}
	public int getSeedsPerPacket() {
		return seedsPerPacket;
	}
	public void setSeedsPerPacket(int seedsPerPacket) {
		this.seedsPerPacket = seedsPerPacket;
	}
	
}
