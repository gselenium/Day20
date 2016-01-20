package Pack1;

import Functions.XLS_Reader;

public class ReadWriteXlFile {
	public static void main(String[] args) {
		XLS_Reader xls=new XLS_Reader("D:/Online_Batches/VineelaSelenium/Workspace/Day20/src/XlFiles/testdata.xlsx");
		//row count
		System.out.println("Total Rows in the xl file: "+xls.getRowCount("mydata"));
		System.out.println("Total cols: "+xls.getColumnCount("mydata"));
		//get cell data or read the data from xl file
		System.out.println(xls.getCellData("mydata", "Username", 2));
		System.out.println(xls.getCellData("mydata", "Username", 3));
		System.out.println(xls.getCellData("mydata", "Password", 2));
		System.out.println(xls.getCellData("mydata", "Password", 3));
		
		//write the data from excel file or set cell data
		xls.setCellData("mydata", "Result", 2, "vardhan");
		xls.setCellData("mydata", "Result", 3, "Pass");
		xls.setCellData("mydata", "Result", 4, "Fail");
	}

}
