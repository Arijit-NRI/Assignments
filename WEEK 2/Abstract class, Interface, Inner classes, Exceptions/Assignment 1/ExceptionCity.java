import java.util.*;
public class ExceptionCity {
    static void findCityByZipCode(int zipcode)
	{
		HashMap<Integer,String> mp=new HashMap<>();
		mp.put(3478,"kolkata");
		mp.put(3475,"bangalore");
		mp.put(3470,"mumbai");
		mp.put(3479,"chennai");
		try
		{
			if(mp.containsKey(zipcode))
			{
				System.out.println("City Found is : "+mp.get(zipcode));
			}
			else
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception catched : No city found");
		}
	}
	public static void main(String[] args)
	{ 
		findCityByZipCode(3477);
	}
    
}
