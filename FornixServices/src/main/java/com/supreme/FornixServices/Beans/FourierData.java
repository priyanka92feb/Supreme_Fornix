package com.supreme.FornixServices.Beans;


public class FourierData {
	private Double[] allFourierfrequencies;
	private Double[] allFourierfp2_f4;
	private Double[] allFourierf4_c4;
	private Double[] allFourierc4_p4;
	private Double[] allFourierp4_o2;
	private Double[] allFourierfp1_f3;
	private Double[] allFourierf3_c3; 
	private Double[] allFourierc3_p3;
	private Double[] allFourierp3_o1;
	private Double[] allFourierfp2_f8;
	private Double[] allFourierf8_t4;
	private Double[] allFouriert4_t6;
	private Double[] allFouriert6_o2;
	private Double[] allFourierfp1_f7;
	private Double[] allFourierf7_t3;
	private Double[] allFouriert3_t5;
	private Double[] allFouriert5_o1;
	private Double[] allFourierECG;

	public FourierData(){}
	
	public FourierData(DataSetCreation dsc){
		
		this.allFourierfrequencies = dsc.getAllFourierfrequencies();
				this.allFourierfp2_f4 = dsc.getAllFourierfp2_f4();
				this.allFourierf4_c4 = dsc.getAllFourierf4_c4();
				this.allFourierc4_p4 = dsc.getAllFourierc4_p4();
				this.allFourierp4_o2 = dsc.getAllFourierp4_o2();
				this.allFourierfp1_f3 = dsc.getAllFourierfp1_f3();
				this.allFourierf3_c3 = dsc.getAllFourierf3_c3();
				this.allFourierc3_p3 = dsc.getAllFourierc3_p3();
				this.allFourierp3_o1 = dsc.getAllFourierp3_o1();
				this.allFourierfp2_f8 = dsc.getAllFourierfp2_f8();
				this.allFourierf8_t4 = dsc.getAllFourierf8_t4();
				this.allFouriert4_t6 = dsc.getAllFouriert4_t6();
				this.allFouriert6_o2 = dsc.getAllFouriert6_o2();
				this.allFourierfp1_f7 = dsc.getAllFourierfp1_f7();
				this.allFourierf7_t3 = dsc.getAllFourierf7_t3();
				this.allFouriert3_t5 = dsc.getAllFouriert3_t5();
				this.allFouriert5_o1 = dsc.getAllFouriert3_t5();
				this.allFourierECG = dsc.getAllFourierECG();
		
	}

	public Double[] getAllFourierfrequencies() {
		return allFourierfrequencies;
	}

	public void setAllFourierfrequencies(Double[] allFourierfrequencies) {
		this.allFourierfrequencies = allFourierfrequencies;
	}

	public Double[] getAllFourierfp2_f4() {
		return allFourierfp2_f4;
	}

	public void setAllFourierfp2_f4(Double[] allFourierfp2_f4) {
		this.allFourierfp2_f4 = allFourierfp2_f4;
	}

	public Double[] getAllFourierf4_c4() {
		return allFourierf4_c4;
	}

	public void setAllFourierf4_c4(Double[] allFourierf4_c4) {
		this.allFourierf4_c4 = allFourierf4_c4;
	}

	public Double[] getAllFourierc4_p4() {
		return allFourierc4_p4;
	}

	public void setAllFourierc4_p4(Double[] allFourierc4_p4) {
		this.allFourierc4_p4 = allFourierc4_p4;
	}

	public Double[] getAllFourierp4_o2() {
		return allFourierp4_o2;
	}

	public void setAllFourierp4_o2(Double[] allFourierp4_o2) {
		this.allFourierp4_o2 = allFourierp4_o2;
	}

	public Double[] getAllFourierfp1_f3() {
		return allFourierfp1_f3;
	}

	public void setAllFourierfp1_f3(Double[] allFourierfp1_f3) {
		this.allFourierfp1_f3 = allFourierfp1_f3;
	}

	public Double[] getAllFourierf3_c3() {
		return allFourierf3_c3;
	}

	public void setAllFourierf3_c3(Double[] allFourierf3_c3) {
		this.allFourierf3_c3 = allFourierf3_c3;
	}

	public Double[] getAllFourierc3_p3() {
		return allFourierc3_p3;
	}

	public void setAllFourierc3_p3(Double[] allFourierc3_p3) {
		this.allFourierc3_p3 = allFourierc3_p3;
	}

	public Double[] getAllFourierp3_o1() {
		return allFourierp3_o1;
	}

	public void setAllFourierp3_o1(Double[] allFourierp3_o1) {
		this.allFourierp3_o1 = allFourierp3_o1;
	}

	public Double[] getAllFourierfp2_f8() {
		return allFourierfp2_f8;
	}

	public void setAllFourierfp2_f8(Double[] allFourierfp2_f8) {
		this.allFourierfp2_f8 = allFourierfp2_f8;
	}

	public Double[] getAllFourierf8_t4() {
		return allFourierf8_t4;
	}

	public void setAllFourierf8_t4(Double[] allFourierf8_t4) {
		this.allFourierf8_t4 = allFourierf8_t4;
	}

	public Double[] getAllFouriert4_t6() {
		return allFouriert4_t6;
	}

	public void setAllFouriert4_t6(Double[] allFouriert4_t6) {
		this.allFouriert4_t6 = allFouriert4_t6;
	}

	public Double[] getAllFouriert6_o2() {
		return allFouriert6_o2;
	}

	public void setAllFouriert6_o2(Double[] allFouriert6_o2) {
		this.allFouriert6_o2 = allFouriert6_o2;
	}

	public Double[] getAllFourierfp1_f7() {
		return allFourierfp1_f7;
	}

	public void setAllFourierfp1_f7(Double[] allFourierfp1_f7) {
		this.allFourierfp1_f7 = allFourierfp1_f7;
	}

	public Double[] getAllFourierf7_t3() {
		return allFourierf7_t3;
	}

	public void setAllFourierf7_t3(Double[] allFourierf7_t3) {
		this.allFourierf7_t3 = allFourierf7_t3;
	}

	public Double[] getAllFouriert3_t5() {
		return allFouriert3_t5;
	}

	public void setAllFouriert3_t5(Double[] allFouriert3_t5) {
		this.allFouriert3_t5 = allFouriert3_t5;
	}

	public Double[] getAllFouriert5_o1() {
		return allFouriert5_o1;
	}

	public void setAllFouriert5_o1(Double[] allFouriert5_o1) {
		this.allFouriert5_o1 = allFouriert5_o1;
	}

	public Double[] getAllFourierECG() {
		return allFourierECG;
	}

	public void setAllFourierECG(Double[] allFourierECG) {
		this.allFourierECG = allFourierECG;
	}
	

}
