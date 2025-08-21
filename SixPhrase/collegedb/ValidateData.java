// package collegedb.data;
import java.time.Year;
// import collegedb.StudentPojo;
import java.util.*;
public class ValidateData {
    public  ArrayList<StudentPojo> validate(StudentPojo student){
        StudentPojo pojo = new StudentPojo();
        ArrayList<StudentPojo> arr = new ArrayList<StudentPojo>();


        String nameRegex = "^[A-Z][a-z]*(?:\\s[A-Z][a-z]*)*$";
        String name = student.getName().trim();

        if(name.matches(nameRegex)){
            pojo.setName(name);
        }else{
            System.out.println("Invalid name!");
        }

        String department = student.getDepartment().trim();
        if(department.matches(nameRegex)){
            pojo.setDepartment(department);
        }else{
            System.out.println("Invalid department!");
        }

        String mobileRegex = "^\\+91[6-9]\\d{9}$";
        String mobile = student.getMobileNumber();
        if(mobile.matches(mobileRegex)){
            pojo.setMobileNumber(mobile);
        }else{
            System.out.println("Invalid Mobile Number");
        }

        String rollNumber = String.valueOf(student.getRollNumber()).trim();
        if(rollNumber.length() == 11){
            pojo.setMobileNumber(mobile);
        }else{
            System.out.println("Invalid RollNumber");
        }

        int YOP = student.getYOP();
        if(YOP > Year.now().getValue()-4 && YOP < Year.now().getValue()+4){
            pojo.setYOP(YOP);
        }else{
            System.out.println("Invalid Year of Passing");
        }
         System.out.println(
        pojo.getName());
        // + pojo.getRollNumber()
        // + pojo.getYOP());

        arr.add(pojo);
        return arr;   
    }
}
