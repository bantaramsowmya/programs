class Ascending
{
public static void main(String args[])
{
int i,j;
int temp;
int a[]={20,10,40,30,60};
for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
System.out.println(temp);
}
}
}
for(i=0;i<5;i++)
{
System.out.println("ascending order"+a[i]);
}
}
}