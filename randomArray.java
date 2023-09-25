import java.util.*;
public class randomArray
{
	public static int[] create()
	{
		Random r1=new Random();
		int size=r1.nextInt(20);
		int[] array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=10+r1.nextInt(90);
		}
		if(size>0)
		{
			array[0]=size;
		}
		System.out.printf("Random array created. Size is %d.\n",size);
		return array;
	}
}