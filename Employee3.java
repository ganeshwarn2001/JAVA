public class Employee3
{
    int empId;  
    String empName;  
	public Employee3(int id, String name)
        {  
            empId = id;  
            empName = name;  
            }  
         void status()
            {
                System.out.println("Id: "+empId+" Name: "+empName);
                    }  
	   
         public static void main(String args[])
            {  
	            Employee3 obj1 = new Employee3(12345,"GANESH");  
	            Employee3 obj2 = new Employee3(12346,"DHINA");  
	            obj1.status();  
	            obj2.status();  
             }  
    }

