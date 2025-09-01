public class MyExceptionTest {
    public static void main(String[] args) {
        UserDefinedException udf = new UserDefinedException();
        try {
            // Test with minor (should throw exception)
            udf.validate(12);
            // Test with adult (should pass)
            udf.validate(19);
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
