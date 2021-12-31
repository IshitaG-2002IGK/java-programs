class MyException extends Exception 
{
    String str1;
    MyException(String str2)
    {
        str1 = str2 ;

    }

    public String tostring()
    {
        return (" My Exception occurred : " +str1);

    }
}

class MainException 
{
    public static void main( String args [])
    {
        try 
        {
            System.out.println ("Starting of try block ");
            throw new MyException ("This is my error message");
        
        }

        catch ( MyException e)
        {
            System.out.println( "Catch Block") ;
            System.out.println(e) ;


        }
    }
}
