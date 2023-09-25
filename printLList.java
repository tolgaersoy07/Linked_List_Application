public class printLList
{
	public static void print(LList head)
	{
		if(head==null)
		{
			System.out.printf("NULL");
		}
		for(LList temporary=head;temporary!=null;temporary=temporary.next)
		{
			if(temporary.next!=null)
			{
				System.out.printf("%d -> ",temporary.data);
			}
			else 
			{
				System.out.printf("%d -> NULL",temporary.data);
			}
		}
		System.out.printf("\n\n");
	}
}