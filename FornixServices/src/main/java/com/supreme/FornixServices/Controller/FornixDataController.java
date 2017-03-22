package com.supreme.FornixServices.Controller;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.supreme.FornixServices.Beans.DataSetCreation;
import com.supreme.FornixServices.Beans.FourierData;
import com.supreme.FornixServices.Exceptions.FileNotFoundException;
import braineeganalysis.util.DataReader;
import braineeganalysis.util.EDF2ASCII;


@RequestMapping("/fornix")
@RestController
public class FornixDataController {
	
	@RequestMapping(value="/test/fileupload", method=RequestMethod.POST)
	public FourierData handleFileUpload(@RequestParam("file") MultipartFile file) throws FileNotFoundException{
		
			try{
				byte[] bytes=file.getBytes();
				BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(new File("test.edf")));
				stream.write(bytes);
				stream.close();
				EDF2ASCII eDF2ASCII=new EDF2ASCII(0, "test.edf");
				//System.out.println(EDF2ASCII.LINES);
				eDF2ASCII.edf2ascii();
				ArrayList[] data = DataReader.read("test_data.txt");
				DataSetCreation dataSetCreation = new DataSetCreation();
				System.out.println("Entering Data set creation");
				dataSetCreation.createDataset(data);				
				dataSetCreation.createFourierDataset();
				FourierData fourierDate = new FourierData(dataSetCreation);
				/*AllFourierFreqs allFreqObj = new AllFourierFreqs(dataSetCreation);
				return allFreqObj;	*/
				return fourierDate;
			
		 
			}
			catch(Exception e){
				e.getMessage();
			}
		
		
	return null;
	}
	
	

	
	
}
