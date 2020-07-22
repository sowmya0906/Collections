package list;
import java.util.*;
public class CustomlistCollection {
	public static void main(String args[]) {

int a[]=new int[50];
for(int i=0;i<10;i++)
	a[i]=i+1;
int c=10;


while(true) {
Scanner sc=new Scanner(System.in);
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
	a[c++]=g;
	System.out.print(g+"element is added from list");
	break;
	
case 2:	
	System.out.println("enter element to be removed");
	int h=sc.nextInt();
	int f=0;
	for(int i=0;i<c;i++) {
		if(a[i]==h){
			f=1;
			for(int j=i;j<c;j++) {
				a[j]=a[j+1];
			}
		}
	}
	if(f==0)
		System.out.println("element not found");
break;

case 3:
	System.out.println("enter element to be retrived");
	int p=sc.nextInt();
	int j=0;
    for(int i=0;i<c;i++) {
	if(a[i]==p) {
		j=1;
		System.out.println("element "+p+" found at "+(i+1)+" position");
	}
   }
    if(j==0)
	System.out.println("element not found");
break;

case 4:
	System.out.print("elements are");
	for(int i=0;i<c;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	break;
case 5:
	System.exit(0);
	}
}
}
}