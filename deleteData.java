public class deleteData
{
	public static LList delete(LList head,int value)
	{
		LList output=new LList();
		LList current=new LList();
		output=current;
		for(LList temporary=head;temporary!=null;temporary=temporary.next)
		{
			if(temporary.data!=value)
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
					break;
				}
			}
		}
		System.out.printf("%d deleted from LList.\n",value);
		return output;
	}
	public static LList nDelete(LList head,int n)
	{
		System.out.printf("%d. node deleted.\n",n);
		LList output=new LList();
		LList current=new LList();
		output=current;
		for(LList temporary=head;temporary!=null;temporary=temporary.next)
		{
			if(n!=0)
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
			n--;
		}
		current=null;
		return output;
	}
}