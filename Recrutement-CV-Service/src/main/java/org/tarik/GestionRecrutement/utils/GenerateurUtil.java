package org.tarik.GestionRecrutement.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.tarik.GestionRecrutement.model.Candidat;

public class GenerateurUtil {
	
	public static byte[] generateFormaWordCV(Candidat candidat ) throws IOException
	{
		try(
				XWPFDocument document= new XWPFDocument();
				ByteArrayOutputStream out = new ByteArrayOutputStream();
		){
			generateInformationGeneraleSection(document,candidat);
//			XWPFParagraph paragraph= document.createParagraph();
//			XWPFRun run= paragraph.createRun();
//			run.setText("mercedes");
//			run.setText(" volkswagen");
//			run.setFontSize(12);
//			run.addBreak();
//			run.setText("my favorite cars ");
//			paragraph.setBorderBottom(Borders.BASIC_THIN_LINES);
//			paragraph.setBorderTop(Borders.BASIC_THIN_LINES);
//			paragraph.setAlignment(ParagraphAlignment.CENTER);
//			XWPFTable table =document.createTable();
//			XWPFTableRow row0= table.getRow(0);
//			XWPFTableCell cell0=row0.getCell(0);
//			XWPFTableCell cell1=row0.createCell();
//			cell0.setText("MyText0");
//			cell1.setText("MyText1");
			document.write(out);
			return out.toByteArray();
		}
		
	}
	private static void generateInformationGeneraleSection(XWPFDocument document,Candidat candidat) {
		XWPFParagraph informationGenerale= document.createParagraph();
		XWPFRun run= informationGenerale.createRun();
		run.setText(candidat.getNomComplet().getNom());
		run.setText(candidat.getNomComplet().getPrenom());
		
		run.setFontSize(12);
		run.addBreak();
	};
	private static void generateFormationsSection(XWPFDocument document,Candidat candidat) {};
	private static void generateExperiencesSection(XWPFDocument document,Candidat candidat) {};
	private static void generateCompetencesesSection(XWPFDocument document,Candidat candidat) {};

}
