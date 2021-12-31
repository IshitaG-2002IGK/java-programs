class SampleException{
    public static void main(String args[]){
    try{
    throw new UserException(<value>); // used to create new exception and throw
    }
    catch(Exception e){
    System.out.println(e);
    }
    }
    }
    class UserException extends Exception{
    // code for exception class
    }
    
    