package treebo.genericUtility;
/**
 * This interface consist all the external file path
 * @author nadaf
 *
 */
public interface IconstantPath {
	String PROJECT_PATH=System.getProperty("user.dir");
	String EXCEL_PATH=PROJECT_PATH+"/src/test/resources/TestData1.xlsx";
	String PROPERTY_FILE_PATH=PROJECT_PATH+"/src/test/resources/Tcdata.properties";
	String DB_URL="jdbc:mysql://localhost:3306/tyss";

}
