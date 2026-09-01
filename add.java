class add{
//to add two number -styatic method with void return no value
static void add1(int a,int b){
//this method is void so will not return any value to main
System.out.println(a+b);
}
static int add2(int a,int b){
return a+b;
}
public static void main(String[] args)
{
add1(12,23);
add.add1(1,2);
  int sum=add2(10,20);
System.out.println("sum is:"+sum);
}
}