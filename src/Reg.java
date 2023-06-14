import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class Reg extends JFrame implements ActionListener {

    JLabel label,label1,label2,label3,label4,label5,label6,background;
    JTextField textField1,textField2,textField3,textField4,textField5,textField6;
    JButton submit;
     Student student = new Student();
     Functionalities function = new Functionalities();
   Reg(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        background = new JLabel(new ImageIcon("school.png"));
        background.setBounds(0,0,700,700);
        background.setLayout(null);

        label = new JLabel("STUDENT MANAGEMENT SYSTEM");
        label.setBounds(40,20,600,70);
        label.setFont(new Font(Font.DIALOG,Font.PLAIN,35));


        label1 = new JLabel("NAME:");
        label1.setBounds(20,100,300,25);
        textField1 = new JTextField();
        textField1.setBounds(100,0,200,25);
        textField1.setOpaque(false);
        label1.add(textField1);

        label2 = new JLabel("AGE:");
        label2.setBounds(20,155,300,25);
        textField2 = new JTextField();
        textField2.setOpaque(false);
        textField2.setBounds(100,0,200,25);
        label2.add(textField2);

        label3 = new JLabel("SEX:");
        label3.setBounds(20,210,300,25);
        textField3 = new JTextField();
        textField3.setBounds(100,0,200,25);
        textField3.setOpaque(false);
        label3.add(textField3);

        label4 = new JLabel("DATE OF BIRTH:");
        label4.setBounds(20,275,300,25);
        textField4 = new JTextField();
        textField4.setBounds(100,0,200,25);
        textField4.setOpaque(false);
        label4.add(textField4);

        label5 = new JLabel("ADDRESS:");
        label5.setBounds(20,340,300,25);
        textField5 = new JTextField();
        textField5.setBounds(100,0,200,25);
        textField5.setOpaque(false);
        label5.add(textField5);

        label6 = new JLabel("GUARDIAN'S NUMBER:");
        label6.setBounds(20,405,325,25);
        textField6 = new JTextField();
        textField6.setBounds(125,0,200,25);
        textField6.setColumns(11);
        textField6.setOpaque(false);
        label6.add(textField6);

        submit = new JButton("SUBMIT");
        submit.setBounds(300,600,100,50);
        submit.setBackground(new Color(247,148,29));
        submit.setFocusable(false);
        submit.setOpaque(true);
        submit.addActionListener(this);

        background.add(label);
        background.add(label1);
        background.add(label2);
        background.add(label3);
        background.add(label4);
        background.add(label5);
        background.add(label6);
        background.add(submit);

        this.add(background);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit){
             student.setName(textField1.getText());
             student.setAge(Integer.parseInt(textField2.getText()));
             student.setSex(textField3.getText());
             student.setD_O_B(Date.valueOf(textField4.getText()));
             student.setAddress(textField5.getText());
             student.setGuardNo(textField6.getText());

             function.addStudent(student);
        }

    }
}
