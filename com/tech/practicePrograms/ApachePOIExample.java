import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

public class PocTestReadExcel {
	
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@<hostname>:1521:<SID>","<username>", "<password>");
		FileInputStream myInput = null;
		try {
			
			
			conn.setAutoCommit(true);
			PreparedStatement pstm = null;
			String fileName = "C:/Users/vivedula/Documents/<ExcelName>.xls";
			 myInput = new FileInputStream(fileName);
			POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);
			HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);
			HSSFSheet sheet = myWorkBook.getSheetAt(0);
			Row row = null;
			
			// HashMap, we could also use HashMap, but avoiding now for iterations
			// First we need to get column index of all required Columns

			int noOfColumns = sheet.getRow(0).getLastCellNum();

			// To check the column indexes of all the columns
			int ticketColumn = 0,statusColumn = 0;
			String[] headers = new String[noOfColumns];
			for (int j = 0; j < noOfColumns; j++) {
				headers[j] = sheet.getRow(0).getCell(j).getStringCellValue();
			}
			for (int a = 0; a < noOfColumns; a++) {
				if (headers[a].equals("Key")) {
					ticketColumn = a;
				} else if (headers[a].equals("Status")) {
					statusColumn = a;
				}
			}
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				row = (Row) sheet.getRow(i);
				String parentTicket = row.getCell(ticketColumn)
						.getStringCellValue();
				String status = row.getCell(statusColumn).getStringCellValue();

				String sql = "INSERT INTO poctest (parentId, status) VALUES('"
						+ parentTicket
						+ "','"
						+ status + "')";
				pstm = (PreparedStatement) conn.prepareStatement(sql);
				pstm.execute();
				conn.commit();
				pstm.close();
			}
				System.out.println("Excel successfully imported into database");
		} catch (IOException e) {
			
			e.printStackTrace();
			
			/* Query to get rowCount
			 pstm = conn.prepareStatement("select count(*)  from RELATIVETICKET where parentticket = ? and relativetickets = ? and percentage = ?");
			pstm.setString(1, parentTicket);
			pstm.setString(2, relativeTickets);
			pstm.setInt(3, percentage);
			ResultSet rs = pstm.executeQuery();
			rs.next();
			rowCount = rs.getInt(1);*/
			
		} finally{
			conn.close();
			myInput.close();
		}

	}
}
