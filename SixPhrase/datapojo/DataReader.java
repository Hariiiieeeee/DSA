

class DataReader{
    public static void main(String[] args) {
        DataPojo1 data = new DataPojo1();

        data.setName("Hari");
        data.setAge(21);
        data.setAddress("1234, Palani");
        data.setMobileNumber("9876543210");
        
        System.out.println(data.getName());
        System.out.println(data.getAge());
        System.out.println(data.getAddress());
        System.out.println(data.getMobileNumber());
    }
}