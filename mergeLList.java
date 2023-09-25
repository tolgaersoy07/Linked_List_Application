public class mergeLList
{
	public static LList merge(LList head1,LList head2)
	{
		LList output=new LList();
		LList current=new LList();
		output=current;
		for(LList temporary=head1;temporary!=null;temporary=temporary.next)
		{
			current.data=temporary.data;
			current.next=new LList();
			current=current.next;
		}
		for(LList temporary=head2;temporary!=null;temporary=temporary.next)
		{
			current.data=temporary.data;
			if(temporary.next!=null)
				{
					current.next=new LList();
					current=current.next;
				}
				else 
				{
					current=null;
				}
		}
		System.out.printf("LList merged.\n");
		return output;
	}
}