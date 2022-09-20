package org.treebo.practice;

import java.sql.SQLException;
import java.util.List;

import treebo.genericUtility.DatabaseUtility;
import treebo.genericUtility.IconstantPath;

public class FetchDataFromDB1 {
public static void main(String[] args) throws SQLException {
	DatabaseUtility db=new DatabaseUtility();
    db.openDbConnection(IconstantPath.DB_URL, "root", "root");
    List<String> data = db.getDataFromDatabase("select * from sdet40;", "emp_name");
    System.out.println(data);
    System.out.println(data);
    db.closeDb();
}
}
