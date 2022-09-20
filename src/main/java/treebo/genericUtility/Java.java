package treebo.genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType;


/**
 * This class consist all the java reusable actions
 * @author nadaf
 *
 */
public class Java {
	/**
	 * This method is use to generate Random Number
	 * @param limit
	 * @return
	 */
	public int getRandomNumber(int limit)
	{
		return new Random().nextInt(limit);
	}
	public  Object converStringIntoAnyDatatype(String data, DataType stratergy) {
		Object obj = null;
		if(stratergy.toString().equalsIgnoreCase("long"))
		{
			 obj = Long.parseLong(data);
		}
		else  if(stratergy.toString().equalsIgnoreCase("int"))
		{
			obj=Integer.parseInt(data);
		}
		else if(stratergy.toString().equalsIgnoreCase("double"))
		{
			obj=Double.parseDouble(data);
		}
		return obj;
	}
	/**
	 * This method is use to convert the current date and time into ("dd_MM_yyyy_hh_mm_sss");
	 * @return 
	 */
	public String currentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_sss");
		String actualdate = sdf.format(date);
		return actualdate;
	}
}
