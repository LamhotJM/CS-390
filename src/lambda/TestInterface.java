package lambda;

public interface TestInterface {
	
	// A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("Hello Lamhot from interface"); 
    } 
    
    default String hello(String value)
    {
    	return value;
    }
    
    
    
    void abstractFun(int x);

}
