public class myexception {
    public static void main (String[] args){
    userdefinedexception udf=new userdefinedexception();
    try{
        //udf.validate(12);
        udf.validate(19);
    }
    catch(invalidage e){
        System.out.println(e.getMessage());
    }
}
}
