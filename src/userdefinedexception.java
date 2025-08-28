public class userdefinedexception {
    public void validate(int age)throws invalidage{
        if(age<18)
            throw new invalidage("not eligible to vote");
        else
            System.out.println("eligible to vote");


    }
}
