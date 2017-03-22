package com.supreme.FornixServices.Beans;

public class AllFourierFreqs {
	
	private Double[] allFourierfrequencies;

	public Double[] getAllFourierfrequencies() {
		return allFourierfrequencies;
	}

	public void setAllFourierfrequencies(Double[] allFourierfrequencies) {
		this.allFourierfrequencies = allFourierfrequencies;
	}
	
	public AllFourierFreqs(DataSetCreation dsc){
		
		this.allFourierfrequencies = dsc.getAllFourierfrequencies();
	}

}
