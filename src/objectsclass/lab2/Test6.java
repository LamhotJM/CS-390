package objectsclass.lab2;

class Test6
{
    int a = 1;
    int b = 2;
 
    Test func(Test obj)
    {
        //Test obj = new Test();
       // obj3 = obj;
        //obj3.a = obj.a++ + ++obj.b;
       // obj.b = obj.b;
        return obj;
    }
 
    public static void main(String[] args)
    {
        Test obj1 = new Test();
       // Test obj2 = obj1.func(obj1);
 
       // System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
      //  System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b);
 
    }
}