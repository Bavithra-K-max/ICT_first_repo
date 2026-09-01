//Father is the base class 
class Father{
void job(){
System.out.println("retirred profeessor");
}
void hobby(){
System.out.println("Reading newspapper,Watching tv");
}
void property(){
System.out.println("a house in native villlage ");
}
}
class Daughter extends Father {
void job()
{
System.out.println("no jab-student");
}
void hobby(){
System.out.println("Plaing games ,social Media");
}
void property(){
System.out.println("noooo ");
}
public static void main(String[] args)
{
Father f1=new Father();
f1.job();
f1.hobby();
f1.property();
Daughter d=new Daughter();
d.job();
d.hobby();
d.property();
Father f2=new Daughter();
f2.job();
f2.hobby();
f2.property();
/* Job is there in both father and daugher class,
doesnot decide which is invoke st the complie time .
but it can decide which class is invoked st the runtime.
that is called dynamic meethod */
}
}

