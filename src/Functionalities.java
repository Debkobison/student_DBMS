import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Functionalities {
    Connect connect = new Connect();
    Connection con;
    ImageIcon icon = new ImageIcon("school.png");
    public Student getStudent(String matricNo){
        Student student = new Student();
        try {
            student.setMatricNo(matricNo);
            con = connect.setCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from Records where concat(prefix,id) = \"" + matricNo + "\"");
            rs.next();

            student.setName(rs.getNString(3));
            student.setAge(rs.getInt(4));
            student.setSex(rs.getString(5));
            student.setD_O_B(rs.getDate(6));
            student.setAddress(rs.getString(7));
            student.setGuardNo(rs.getString(8));

            System.out.println(student.getMatricNo() + "\t\t\t" + student.getName() + "\t\t\t"
                    + student.getAge() + "\t\t\t" + student.getSex() + "\t\t\t"
                    + student.getD_O_B() + "\t\t\t" + student.getAddress() + "\t\t\t"
                    + student.getGuardNo()
            );

        }catch (Exception e){
            System.out.println(e);
        }
        return student;
    }
    protected void addStudent(Student student) {
        try {
            String query = "insert into students(Full_name,Date_Of_Birth,Religion) values (?,?,?)";
            con = connect.setCon();

            PreparedStatement st = con.prepareStatement(query);
            st.setString(3, student.getName());
            st.setInt(4,student.getAge());
            st.setString(5, student.getSex());
            st.setDate(6,student.getD_O_B());
            st.setString(7,student.getAddress());
            st.setString(8,student.getGuardNo());
            int count = st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registration Successful!!","Successful",JOptionPane.INFORMATION_MESSAGE,icon);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
