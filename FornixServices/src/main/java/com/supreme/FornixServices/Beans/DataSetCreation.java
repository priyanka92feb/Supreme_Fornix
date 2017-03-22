package com.supreme.FornixServices.Beans;

import java.util.ArrayList;
import java.util.Arrays;

import braineeganalysis.Math.Fourier;

public class DataSetCreation {
	
	private Double[] alltimes;
	private Double[] allfp2_f4;
	private Double[] allf4_c4;
	private Double[] allc4_p4;
	private Double[] allp4_o2;
	private Double[] allfp1_f3;
	private Double[] allf3_c3;
	private Double[] allc3_p3;
	private Double[] allp3_o1;
	private Double[] allfp2_f8;
	private Double[] allf8_t4;
	private Double[] allt4_t6;
	private Double[] allt6_o2;
	private Double[] allfp1_f7;
	private Double[] allf7_t3;
	private Double[] allt3_t5;
	private Double[] allt5_o1;
	private Double[] allECG;
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
			
			
	
	public void createDataset(ArrayList[] data) {
		System.out.println("Inside createDataset");
		this.alltimes = new Double[data[0].size()];
		this.allfp2_f4 = new Double[data[1].size()];
		this.allf4_c4 = new Double[data[2].size()];
		this.allc4_p4 = new Double[data[3].size()];
		this.allp4_o2 = new Double[data[4].size()];
		this.allfp1_f3 = new Double[data[5].size()];
		this.allf3_c3 = new Double[data[6].size()];
		this.allc3_p3 = new Double[data[7].size()];
		this.allp3_o1 = new Double[data[8].size()];
		this.allfp2_f8 = new Double[data[9].size()];
		this.allf8_t4 = new Double[data[10].size()];
		this.allt4_t6 = new Double[data[11].size()];
		this.allt6_o2 = new Double[data[12].size()];
		this.allfp1_f7 = new Double[data[13].size()];
		this.allf7_t3 = new Double[data[14].size()];
		this.allt3_t5 = new Double[data[15].size()];
		this.allt5_o1 = new Double[data[16].size()];
		this.allECG = new Double[data[17].size()];

		for (int i = 0; i < data[0].size() - 1; ++i) {
			this.alltimes[i] = Double.valueOf(Double.parseDouble(data[0].get(i).toString()));
			this.allfp2_f4[i] = Double.valueOf(Double.parseDouble(data[1].get(i).toString()));
			this.allf4_c4[i] = Double.valueOf(Double.parseDouble(data[2].get(i).toString()));
			this.allc4_p4[i] = Double.valueOf(Double.parseDouble(data[3].get(i).toString()));
			this.allp4_o2[i] = Double.valueOf(Double.parseDouble(data[4].get(i).toString()));
			this.allfp1_f3[i] = Double.valueOf(Double.parseDouble(data[5].get(i).toString()));
			this.allf3_c3[i] = Double.valueOf(Double.parseDouble(data[6].get(i).toString()));
			this.allc3_p3[i] = Double.valueOf(Double.parseDouble(data[7].get(i).toString()));
			this.allp3_o1[i] = Double.valueOf(Double.parseDouble(data[8].get(i).toString()));
			this.allfp2_f8[i] = Double.valueOf(Double.parseDouble(data[9].get(i).toString()));
			this.allf8_t4[i] = Double.valueOf(Double.parseDouble(data[10].get(i).toString()));
			this.allt4_t6[i] = Double.valueOf(Double.parseDouble(data[11].get(i).toString()));
			this.allt6_o2[i] = Double.valueOf(Double.parseDouble(data[12].get(i).toString()));
			this.allfp1_f7[i] = Double.valueOf(Double.parseDouble(data[13].get(i).toString()));
			this.allf7_t3[i] = Double.valueOf(Double.parseDouble(data[14].get(i).toString()));
			this.allt3_t5[i] = Double.valueOf(Double.parseDouble(data[15].get(i).toString()));
			this.allt5_o1[i] = Double.valueOf(Double.parseDouble(data[16].get(i).toString()));
			this.allECG[i] = Double.valueOf(Double.parseDouble(data[17].get(i).toString()));
		}
	}
	
	public void createFourierDataset() {
		
		System.out.println("Inside createFourierDataset");
		Fourier fp2_f4Transform = new Fourier(new ArrayList(Arrays.asList(this.allfp2_f4)), 256.0D);
		Fourier f4_c4Transform = new Fourier(new ArrayList(Arrays.asList(this.allf4_c4)), 256.0D);
		Fourier c4_p4Transform = new Fourier(new ArrayList(Arrays.asList(this.allc4_p4)), 256.0D);
		Fourier p4_o2Transform = new Fourier(new ArrayList(Arrays.asList(this.allp4_o2)), 256.0D);
		Fourier fp1_f3Transform = new Fourier(new ArrayList(Arrays.asList(this.allfp1_f3)), 256.0D);
		Fourier f3_c3Transform = new Fourier(new ArrayList(Arrays.asList(this.allf3_c3)), 256.0D);
		Fourier c3_p3Transform = new Fourier(new ArrayList(Arrays.asList(this.allc3_p3)), 256.0D);
		Fourier p3_o1Transform = new Fourier(new ArrayList(Arrays.asList(this.allp3_o1)), 256.0D);
		Fourier fp2_f8Transform = new Fourier(new ArrayList(Arrays.asList(this.allfp2_f8)), 256.0D);
		Fourier f8_t4Transform = new Fourier(new ArrayList(Arrays.asList(this.allf8_t4)), 256.0D);
		Fourier t4_t6Transform = new Fourier(new ArrayList(Arrays.asList(this.allt4_t6)), 256.0D);
		Fourier t6_o2Transform = new Fourier(new ArrayList(Arrays.asList(this.allt6_o2)), 256.0D);
		Fourier fp1_f7Transform = new Fourier(new ArrayList(Arrays.asList(this.allfp1_f7)), 256.0D);
		Fourier f7_t3Transform = new Fourier(new ArrayList(Arrays.asList(this.allf7_t3)), 256.0D);
		Fourier t3_t5Transform = new Fourier(new ArrayList(Arrays.asList(this.allt3_t5)), 256.0D);
		Fourier t5_o1Transform = new Fourier(new ArrayList(Arrays.asList(this.allt5_o1)), 256.0D);
		Fourier ECGTransform = new Fourier(new ArrayList(Arrays.asList(this.allECG)), 256.0D);

		this.allFourierfrequencies = ((Double[]) fp2_f4Transform.getFrequencies().toArray(new Double[0]));
		this.allFourierfp2_f4 = ((Double[]) fp2_f4Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierf4_c4 = ((Double[]) f4_c4Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierc4_p4 = ((Double[]) c4_p4Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierp4_o2 = ((Double[]) p4_o2Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierfp1_f3 = ((Double[]) fp1_f3Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierf3_c3 = ((Double[]) f3_c3Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierc3_p3 = ((Double[]) c3_p3Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierp3_o1 = ((Double[]) p3_o1Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierfp2_f8 = ((Double[]) fp2_f8Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierf8_t4 = ((Double[]) f8_t4Transform.getAmplitude().toArray(new Double[0]));
		this.allFouriert4_t6 = ((Double[]) t4_t6Transform.getAmplitude().toArray(new Double[0]));
		this.allFouriert6_o2 = ((Double[]) t6_o2Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierfp1_f7 = ((Double[]) fp1_f7Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierf7_t3 = ((Double[]) f7_t3Transform.getAmplitude().toArray(new Double[0]));
		this.allFouriert3_t5 = ((Double[]) t3_t5Transform.getAmplitude().toArray(new Double[0]));
		this.allFouriert5_o1 = ((Double[]) t5_o1Transform.getAmplitude().toArray(new Double[0]));
		this.allFourierECG = ((Double[]) ECGTransform.getAmplitude().toArray(new Double[0]));
	}

	public Double[] getAlltimes() {
		return alltimes;
	}

	public void setAlltimes(Double[] alltimes) {
		this.alltimes = alltimes;
	}

	public Double[] getAllfp2_f4() {
		return allfp2_f4;
	}

	public void setAllfp2_f4(Double[] allfp2_f4) {
		this.allfp2_f4 = allfp2_f4;
	}

	public Double[] getAllf4_c4() {
		return allf4_c4;
	}

	public void setAllf4_c4(Double[] allf4_c4) {
		this.allf4_c4 = allf4_c4;
	}

	public Double[] getAllc4_p4() {
		return allc4_p4;
	}

	public void setAllc4_p4(Double[] allc4_p4) {
		this.allc4_p4 = allc4_p4;
	}

	public Double[] getAllp4_o2() {
		return allp4_o2;
	}

	public void setAllp4_o2(Double[] allp4_o2) {
		this.allp4_o2 = allp4_o2;
	}

	public Double[] getAllfp1_f3() {
		return allfp1_f3;
	}

	public void setAllfp1_f3(Double[] allfp1_f3) {
		this.allfp1_f3 = allfp1_f3;
	}

	public Double[] getAllf3_c3() {
		return allf3_c3;
	}

	public void setAllf3_c3(Double[] allf3_c3) {
		this.allf3_c3 = allf3_c3;
	}

	public Double[] getAllc3_p3() {
		return allc3_p3;
	}

	public void setAllc3_p3(Double[] allc3_p3) {
		this.allc3_p3 = allc3_p3;
	}

	public Double[] getAllp3_o1() {
		return allp3_o1;
	}

	public void setAllp3_o1(Double[] allp3_o1) {
		this.allp3_o1 = allp3_o1;
	}

	public Double[] getAllfp2_f8() {
		return allfp2_f8;
	}

	public void setAllfp2_f8(Double[] allfp2_f8) {
		this.allfp2_f8 = allfp2_f8;
	}

	public Double[] getAllf8_t4() {
		return allf8_t4;
	}

	public void setAllf8_t4(Double[] allf8_t4) {
		this.allf8_t4 = allf8_t4;
	}

	public Double[] getAllt4_t6() {
		return allt4_t6;
	}

	public void setAllt4_t6(Double[] allt4_t6) {
		this.allt4_t6 = allt4_t6;
	}

	public Double[] getAllt6_o2() {
		return allt6_o2;
	}

	public void setAllt6_o2(Double[] allt6_o2) {
		this.allt6_o2 = allt6_o2;
	}

	public Double[] getAllfp1_f7() {
		return allfp1_f7;
	}

	public void setAllfp1_f7(Double[] allfp1_f7) {
		this.allfp1_f7 = allfp1_f7;
	}

	public Double[] getAllf7_t3() {
		return allf7_t3;
	}

	public void setAllf7_t3(Double[] allf7_t3) {
		this.allf7_t3 = allf7_t3;
	}

	public Double[] getAllt3_t5() {
		return allt3_t5;
	}

	public void setAllt3_t5(Double[] allt3_t5) {
		this.allt3_t5 = allt3_t5;
	}

	public Double[] getAllt5_o1() {
		return allt5_o1;
	}

	public void setAllt5_o1(Double[] allt5_o1) {
		this.allt5_o1 = allt5_o1;
	}

	public Double[] getAllECG() {
		return allECG;
	}

	public void setAllECG(Double[] allECG) {
		this.allECG = allECG;
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
