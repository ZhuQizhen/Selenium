package Selenium29;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
//Data has 3 factors
//Type  Size  Range  
public class dataDriven2 {

	
	//addition functionality
	@Test (dataProvider = "testdata")
	public void add(String s1, String s2, String s3)
	{
		int a1= Integer.parseInt(s1);
		int a2= Integer.parseInt(s2);
		int a3= Integer.parseInt(s3);
		int result = a1 + a2 + a3;
		System.out.println(result);
	}
	
	@DataProvider (name = "testdata")
	public Object [][] readExcel()
	{
		File f = new File("src/input2.xls");
		Workbook w=null;
		
		try {
			w=Workbook.getWorkbook(f);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet s = w.getSheet(0);
		
		String [][] inputData = new String [s.getRows()][s.getColumns()];
		
		for (int i=0;i<s.getRows();i++)
		{
			for(int j=0; j <s.getColumns(); j++)
			{
				inputData[i][j]=s.getCell(j,i).getContents();
			}
		}
		return inputData;
	}
	
	
}
