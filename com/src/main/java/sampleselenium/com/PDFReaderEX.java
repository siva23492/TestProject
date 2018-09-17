package sampleselenium.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class PDFReaderEX {
	static String filepath = "C:\\Users\\LILT-71\\Desktop\\TRainTickest.pdf";

	public void readDatafromPDF(String filePathforPdf) throws Exception {
		File file = new File(filePathforPdf);
		FileInputStream fis = new FileInputStream(file);
		PDDocument doc = null;
		try {
			doc = PDDocument.load(fis);
			String output = new PDFTextStripper().getText(doc);
			//System.out.println("data in a pdf file is  " + output);
			String [] strAr=output.split("Ticket Type:");
            System.out.println("after spliting :  "+strAr[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {
		PDFReaderEX pdr = new PDFReaderEX();
		pdr.readDatafromPDF(filepath);
	}

}
