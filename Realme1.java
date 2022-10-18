class Realme1
{
String cam="Camera";
boolean Ios=false;
boolean TouchDisp=true;
void Android()
{
System.out.println("Realme is the android mobile");
}
}
class Realme9pro extends Realme1
{
String model="Realme 9 pro";
boolean android=true;
void display()
{
System.out.println( "Rear 50 MP Qude camera ");
System.out.println( "Front 16 MP selfie camera");
System.out.println( "Amoled display");
} 
}
class RealmeWatch extends Realme1
{
String model="WatchPro";
String Design="SmartWatch";
void bluetooth()
{
System.out.println("answering call");
System.out.println("good battery life");
}
}
class Store3
{
public static void main(String[] args)
{
Realme9pro rm=new Realme9pro();
rm.Android();
System.out.println(rm.cam);
System.out.println(rm.Ios);
rm.display();
RealmeWatch rw=new RealmeWatch();
System.out.println(rw.cam);
rw.bluetooth();
}
}
