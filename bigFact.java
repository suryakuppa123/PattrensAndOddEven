import java.math.BigInteger;
class bigFact 
{
	public static void main(String[] args) 
	{
		int n= 500000;
		BigInteger mul= new BigInteger("1");
		for(int i=0; i<n; i++)
		{
			 mul=mul.multiply(BigInteger.value(i));

		}
		System.out.println(mul);
	}
}
