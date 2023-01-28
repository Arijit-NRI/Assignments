import java.util.*;

class NoCityFoundException extends Exception
{
	public NoCityFoundException(String message)
	{
		super(message);
	}
	
}
public class City {
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
				NoCityFoundException nc= new NoCityFoundException("No city found");
				throw nc;
			}
		}
		catch(NoCityFoundException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{ 
		findCityByZipCode(3477);
	}
}
