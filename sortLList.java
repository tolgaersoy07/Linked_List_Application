import java.util.*;
public class sortLList
{
	public static LList sort(LList head)
	{
		ArrayList<Integer> array=new ArrayList<>();
		for(LList temporary=head;temporary!=null;temporary=temporary.next)
		{
			array.add(temporary.data);
		}
		int[] outarray=new int[array.size()];
		for(int i=0;i<array.size();i++)
		{
			outarray[i]=array.get(i);
		}
		Arrays.sort(outarray);
		System.out.printf("LList sorted.\n");
		return createLList.arraytoLList(outarray);
	}
}