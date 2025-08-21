// package collegedb.data;
public class StudentPojo {
    private String name;
    private int YOP;
    private String department;
    private String mobileNumber;
    private long rollNumber;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(long rollNumber){
        this.rollNumber = rollNumber;
    }

    public int getYOP(){
        return YOP;
    }

    public void setYOP(int YOP){
        this.YOP = YOP;
    }

    public String getMobileNumber(){
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }


}
