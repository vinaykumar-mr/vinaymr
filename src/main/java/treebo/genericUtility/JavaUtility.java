package treebo.genericUtility;

import java.util.Random;

import com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType;
import com.mysql.cj.util.DataTypeUtil;

/**
 * This class consist all the java reusable actions
 * @author nadaf
 *
 */
class JavaUtility {
	/**
	 * This method is use to generate Random Number
	 * @param limit
	 * @return
	 */
	public int getRandomNumber(int limit)
	{
		return new Random().nextInt(limit);
	}
	public Object converStringIntoDatatype(String data, DateType stratergy) {
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
}
