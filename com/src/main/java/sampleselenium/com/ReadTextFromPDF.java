package sampleselenium.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import junit.framework.Assert;

public class ReadTextFromPDF {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\LILT-71\\Desktop\\TRainTickest.pdf");
		FileInputStream fis = new FileInputStream(file);
		PDFParser pdfParser = new PDFParser(fis);
		pdfParser.parse();
		COSDocument doc = pdfParser.getDocument();
		PDDocument pddoc = new PDDocument(doc);
		PDFTextStripper stripper = new PDFTextStripper();
		String data = stripper.getText(pddoc);
		System.out.println("data in a pdf file is: " + data);
		Assert.assertTrue(data.contains("100001364560053"));
		System.out.println("text found on the pdf file: "+data.contains("100001364560053"));
	}

}
