//throw key word 
class Ex5{
void div (int a,int b){
try{
System.out.println(a/b);
}catch(ArithmeticException e1){
System.out.println("div();divide by Zero -exception"+e1);
throw e1;
}}
public static void main(String[] ar){
int a=10;
int b=0;
//if zero it will throw Arithmetic Exception
Ex5 e=new Ex5();
try{
e.div(a,b);
}
catch(ArithmeticException ee){
System.out.println("main():divide by zero -exception"+ee);
}
}
}
