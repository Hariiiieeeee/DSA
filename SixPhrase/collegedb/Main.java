// package collegedb.data;
import java.util.Scanner;
// import collegedb.StudentPojo;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // int YOP = sc.nextInt();
        // String department = sc.nextLine();
        // String mobileNumber = sc.nextLine();
        // long rollNumber = sc.nextLong();

        StudentPojo pojo = new StudentPojo();

        pojo.setName("Hello");
        pojo.setMobileNumber("+919876543201");
        pojo.setDepartment("department");
        pojo.setRollNumber(932223048);
        pojo.setYOP(2026);

        ValidateData val = new ValidateData();
        
        val.validate(pojo);




    }
}
