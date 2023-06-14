import java.sql.Date;

public class Student {
    private String matricNo,name,sex,address,guardNo;
    private int age;
    private Date D_O_B;

    Student(){

    }
    Student(String name,int age,String sex,Date D_O_B,String address,String guardNo){
        setName(name);
        setAge(age);
        setSex(sex);
        setD_O_B(D_O_B);
        setAddress(address);
        setGuardNo(guardNo);
    }

    public String getMatricNo() {return matricNo;}

    public String getName() {return name;}

    public int getAge() {return age;}

    public String getSex() {return sex;}

    public Date getD_O_B() {return D_O_B;}

    public String getAddress() {return address;}

    public String getGuardNo() {return guardNo;}

    public void setMatricNo(String matricNo) {this.matricNo = matricNo;}

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public void setSex(String sex) {this.sex = sex;}

    public void setD_O_B(Date d_O_B) {D_O_B = d_O_B;}

    public void setAddress(String address) {this.address = address;}

    public void setGuardNo(String guardNo) {this.guardNo = guardNo;}
}
