public class Student {
int roll_no;
String name;
Student(int r, String n){
    name=n;
    roll_no=r;
}
void display(){
    System.out.println("Name is "+name);
    System.out.println("Roll Number: "+roll_no);
}
}
