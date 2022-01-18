class A
{
   public void methodA()
   {
      System.out.println("method of Class A");
   }
}
class B extends A
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
}
class C extends A
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
}
class D extends A
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
class JavaExample
{
  public static void main(String args[])
  {
     B objB = new B();
     C objC = new C();
     D objD = new D();
     //All classes can access the method of class A
     objB.methodA();
     objC.methodA();
     objD.methodA();

     objB.methodB();
     objC.methodC();
     objD.methodD();
  }
}
