import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

public class PocTestReadExcel {
	public static void main(String[] args) throws Exception {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@<hostnamen>:1521:SID",
					"<username>", "<password>");
			conn.setAutoCommit(true);
			PreparedStatement pstm = null;
			String fileName = "C:/Users/vivedula/Documents/PythonPOC.xls";
			FileInputStream myInput = new FileInputStream(fileName);
			POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);
			HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);
			HSSFSheet sheet = myWorkBook.getSheetAt(0);
			Row row;
			int rowCount = 0;
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				row = (Row) sheet.getRow(i);
			String parentTicket = row.getCell(0).getStringCellValue();
			String relativeTickets = row.getCell(1).getStringCellValue();
			int percentage = (int) row.getCell(2).getNumericCellValue();

			pstm = conn
					.prepareStatement("select count(*)  from RELATIVETICKET where parentticket = ? and relativetickets = ? and percentage = ?");
			pstm.setString(1, parentTicket);
			pstm.setString(2, relativeTickets);
			pstm.setInt(3, percentage);
			ResultSet rs = pstm.executeQuery();
			rs.next();
			rowCount = rs.getInt(1);

			if (rowCount == 0) {
				String sql = "INSERT INTO RELATIVETICKET (parentticket, relativetickets, percentage) VALUES('"
						+ parentTicket
						+ "','"
						+ relativeTickets
						+ "','"
						+ percentage + "')";
				pstm = (PreparedStatement) conn.prepareStatement(sql);
				pstm.execute();
				System.out.println("Total number of rows " + i);
			}

		}

			conn.commit();
			pstm.close();
			conn.close();
			myInput.close();
			System.out.println("Excel successfully imported into database");
		}catch (IOException e) {
		}

	}

}
