//Marchella Sylvadenta Lastetria
//123180133

package formbio;
import java.awt.event.*;
import javax.swing.*;
class Login {
    public static void main(String[] args) {
    Loginform l = new Loginform();
    }
}

class Loginform extends JFrame{
    JLabel username = new JLabel (" Username ");
    final JTextField fuser = new JTextField(10);
    JLabel pass = new JLabel (" Password ");
    final JTextField fpass = new JTextField(10);
    JButton log = new JButton (" Login ");
    
    
public Loginform(){
    setTitle("Login");
    setDefaultCloseOperation(3);
    setSize(300,175);
    setLocation(500, 100);
    
    log.addActionListener(new ActionListener(){  
    @Override

        public void actionPerformed(ActionEvent e){
        if(fuser.getText().equals("admin")&&fpass.getText().equals("12345")){
            GUI objek = new GUI();
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Login Failed!");
        }
    }
    });             
    setLayout(null);
    add(username);
    add(fuser);
    add(pass);
    add(fpass);
    add(log);
    
    username.setBounds(10,10,120,20);
    fuser.setBounds(120,10,120,20);
    pass.setBounds(10,35,120,20);
    fpass.setBounds(120,35,120,20);
    log.setBounds(85,75,100,20);
    setVisible(true);
}
}
