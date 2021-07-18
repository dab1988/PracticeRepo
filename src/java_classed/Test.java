package java_classed;
class ParentTest 
{
   String parentName;
   ParentTest(String n1)
   {
      parentName = n1;
   }
   public void display() 
   {
      System.out.println(parentName);
   }
}
class ChildTest extends ParentTest 
{
   String childName;
   ChildTest(String n2) 
   {
      super(n2);
      childName = n2;
   }
   public void display() 
   {
      System.out.println(childName);
   }
}
public class Test 
{
   public static void main(String args[]) 
   {
      ChildTest ct1 = new ChildTest("Jai");
      ParentTest pt1 = new ParentTest("Adithya");
      pt1 = ct1;
      pt1.display();

      ParentTest pt2 = new ChildTest("Sai");
      ChildTest ct2 = (ChildTest)pt2;
   }
}