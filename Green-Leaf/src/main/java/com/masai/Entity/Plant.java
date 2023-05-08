package com.masai.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int plantId;
	private int plantHeight;
	private String plantSpread;
	private String commonName;
	private String bloomTime;
	private String medicineOrOrdinaryUse;
	private String difficultyLevel;
	private String temperature;
	private String typeOfPlant;
	private String plantDescription;
	private String plantStock;
	private double cost;
	public Plant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plant(int plantHeight, String plantSpread, String commonName, String bloomTime, String medicineOrOrdinaryUse,
			String difficultyLevel, String temperature, String typeOfPlant, String plantDescription, String plantStock,
			double cost) {
		super();
		this.plantHeight = plantHeight;
		this.plantSpread = plantSpread;
		this.commonName = commonName;
		this.bloomTime = bloomTime;
		this.medicineOrOrdinaryUse = medicineOrOrdinaryUse;
		this.difficultyLevel = difficultyLevel;
		this.temperature = temperature;
		this.typeOfPlant = typeOfPlant;
		this.plantDescription = plantDescription;
		this.plantStock = plantStock;
		this.cost = cost;
	}
	public int getPlantId() {
		return plantId;
	}
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}
	public int getPlantHeight() {
		return plantHeight;
	}
	public void setPlantHeight(int plantHeight) {
		this.plantHeight = plantHeight;
	}
	public String getPlantSpread() {
		return plantSpread;
	}
	public void setPlantSpread(String plantSpread) {
		this.plantSpread = plantSpread;
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
	public String getMedicineOrOrdinaryUse() {
		return medicineOrOrdinaryUse;
	}
	public void setMedicineOrOrdinaryUse(String medicineOrOrdinaryUse) {
		this.medicineOrOrdinaryUse = medicineOrOrdinaryUse;
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
	public String getTypeOfPlant() {
		return typeOfPlant;
	}
	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}
	public String getPlantDescription() {
		return plantDescription;
	}
	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}
	public String getPlantStock() {
		return plantStock;
	}
	public void setPlantStock(String plantStock) {
		this.plantStock = plantStock;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
	
}
