import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;

public class PuntoSeis {

	static Scanner scanner = new Scanner(System.in);
	static Map<Long, Integer> F = new HashMap<Long, Integer>();
	
	static void fact(long n)
	{
		F.clear();
		for(long p = 2; p*p <= n; p++)
		{
			while(n%p == 0)
			{

				F.put(p, (F.containsKey(p)) ? F.get(p)+1 : 1);
				n/=p;
			}
		}
		if(n> 1) F.put(n, (F.containsKey(n)) ? F.get(n)+1 : 1);
	}
	
	static long exp(long b, long e)
	{
		long ans = 1;
		while(e > 0)
		{
			if(e%2 == 1) ans*=b;
			b=b*b;
			e>>=1;
		}
		return ans;
	}
	
	static long SumDiv(long n){
	    fact(n);
	    long ans = 1;
	    Iterator<Long> it = F.keySet().iterator();
	    
	    while(it.hasNext())
	    {
	    	Long p = it.next();
	    	ans *= (exp(p, F.get(p)+1)-1)/(p-1);  	
	    }
	    return ans;
	}
	
	public static void main(String[] args) {
		
		
		try
		{
			long n = Long.parseLong(scanner.next());
			System.out.println((SumDiv(n)-n) == n ? "Es número perfecto." : "No es número perfecto");
		}
		catch (Exception e) {
			System.out.println("Se introdujo un número inválido, reintente.");
			main(args);
		}

	}
}
