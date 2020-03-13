package objectsclass.lab2;

class Demo
{
    int a, b;
     
    Demo()
    {
        a = 10;
        b = 20;
    }
     
    public void print()
    {
        System.out.println ("a = " + a + " b = " + b + "n");
    }
}
 
class Test
{
 
    public static void main(String[] args)
    {
    	Demo obj1 = new Demo();
    	Demo obj2 = obj1;
 
        obj1.a += 1;
        obj1.b += 1;
 
        System.out.println ("values of obj1 : ");
        obj1.print();
        System.out.println ("values of obj2 : ");
        obj2.print();
 
    }
}