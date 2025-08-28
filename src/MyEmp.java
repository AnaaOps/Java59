public class MyEmp {
    private int empId;
    private String empName;
    
    // Constructor
    public MyEmp(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    
    // Display method
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
    
    // Main method - this is required to run the class
    public static void main(String[] args) {
        MyEmp emp1 = new MyEmp(12, "Ankit");
        emp1.display();
        
        MyEmp emp2 = new MyEmp(25, "Amit");
        emp2.display();
    }
}
