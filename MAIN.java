public class MAIN
{
	public static void runprogram()
	{
		int[] array1=randomArray.create();
		int[] array2=randomArray.create();
		System.out.printf("\n");
		LList obj1=createLList.arraytoLList(array1);
		LList obj2=createLList.arraytoLList(array2);
		System.out.printf("\n");
		printLList.print(obj1);
		printLList.print(obj2);
		System.out.printf("\n");
		LList obj3=createLList.addEnd(obj1,32);
		printLList.print(obj3);
		LList obj4=createLList.addBegin(obj2,64);
		printLList.print(obj4);
		LList obj5=reverseLList.reverse(obj1);
		printLList.print(obj5);
		LList obj6=sortLList.sort(obj1);
		printLList.print(obj6);
		LList obj7=mergeLList.merge(obj1,obj2);
		printLList.print(obj7);
		LList obj8=deleteData.delete(obj1,array1.length);
		LList obj9=deleteData.nDelete(obj1,array1.length-3);
		printLList.print(obj8);
		printLList.print(obj9);
	}
}