public class reverseLList
{
	public static LList reverse(LList head)
	{
		LList output=null;
		for(LList temporary=head;temporary!=null;temporary=temporary.next)
		{
			LList node=new LList();
			node.data=temporary.data;
			node.next=output;
			output=node;
		}
		System.out.printf("LList reversed.\n");
		return output;
	}
} 