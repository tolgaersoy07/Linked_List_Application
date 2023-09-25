public class createLList
{
	public static LList arraytoLList(int[] array)
	{
		if(array.length==0)
		{
			return null;
		}
		LList head=new LList();
		LList current=new LList();
		head=current;
		for(int i=0;i<array.length;i++)
		{
			current.data=array[i];
			if((i+1)<array.length)
			{
				current.next=new LList();
				current=current.next;

			}
			else 
			{
				current.next=null;
			}
		}
		System.out.printf("Array transformed to LList.\n");
		return head;
	}
	public static LList addEnd(LList head,int data)
	{
		if(head==null)
		{
			LList temporary=new LList();
			temporary.data=data;
			temporary.next=null;
			return temporary;
		}
		for(LList temporary=head;temporary!=null;temporary=temporary.next)
		{
			if(temporary.next==null)
			{
				temporary.next=new LList();
				temporary.next.data=data;
				temporary.next.next=null;
				break;
			}
		}
		System.out.printf("%d added end of LList.\n",data);
		return head;
	}
	public static LList addBegin(LList head,int data)
	{
		LList begin=new LList();
		begin.data=data;
		begin.next=head;
		System.out.printf("%d added begin of LList.\n",data);
		return begin;
	}
}