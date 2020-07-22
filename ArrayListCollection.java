package list;
import java.util.*;
public class ArraylistCollection {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> a=new ArrayList<Integer>();
	for(int i=0;i<10;i++)
		a.add(i+1);
	while(true) {
		
		System.out.println("select operation to be performed\n");
		System.out.println("1.adding element in to the list\n"
				+ "2.removing the element form the list\n"
				+"3.fetching element form list\n"
				+ "4.printing all the elemments in the list\n"
				+ "5.exit");
		int n=sc.nextInt();
		
		switch(n){
		case 1:
			System.out.println("enter element to be added");
			int g=sc.nextInt();
			a.add(g);
			System.out.print(g+"element is added from list");
			break;
			
		case 2:	
			System.out.println("enter element to be removed");
			int h=sc.nextInt();
			int f=0;
			a.remove(a.indexOf(h));
			System.out.print(h+"element is removed from list");
		break;

		case 3:
			System.out.println("enter element to be retrived");
			int p=sc.nextInt();
			int j=0;
			
		System.out.println("element is found at "+a.indexOf(p)+" position");
			
		break;

		case 4:
			System.out.print("elements are");
			for(int i=0;i<a.size();i++) {
				System.out.print(a.get(i)+" ");
			}
			System.out.println();
			break;
		case 5:
			System.exit(0);
			}
		}
		
}
}
