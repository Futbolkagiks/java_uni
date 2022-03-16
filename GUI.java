import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.*;

public class GUI implements ActionListener {

   private static JLabel userlabel;
   private static JTextField userText;
   private static JLabel passwordlabel;
   private static JTextField passwordText;
   private static JButton loginbutton;
   private static JLabel success;
   public static void main (String[] args){
      JPanel panel = new JPanel();
      JFrame frame = new JFrame();
      frame.setSize(350,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);
      panel.setLayout(null);

      userlabel = new JLabel("User");
      userlabel.setBounds(10, 20, 80, 25);
      panel.add(userlabel);

      userText = new JTextField();
      userText.setBounds(100, 20, 165, 25);
      panel.add(userText);

      passwordlabel = new JLabel("Password");
      passwordlabel.setBounds(10, 50, 80, 25);
      panel.add(passwordlabel);

      passwordText = new JPasswordField();
      passwordText.setBounds(100,50,165,25);
      panel.add(passwordText);
      
      loginbutton = new JButton("Login");
      loginbutton.setBounds(10,80,80,25);
      loginbutton.addActionListener(new GUI());
      panel.add(loginbutton);

      success = new JLabel("");
      success.setBounds(10,110,300,25);
      panel.add(success);
      // 

      frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      String user = userText.getText();
      String password = passwordText.getText();
      System.out.println(user+","+password);
      if (user.equals("Admin") && password.equals("Admin")){
         JPanel newpanel = new JPanel();
         JFrame newframe = new JFrame();
         newframe.setSize(350,200);
         newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         newframe.add(newpanel);
         newpanel.setLayout(null);
         JLabel newlabel = new JLabel();
         newlabel = new JLabel("Text of sorts");
         newlabel.setBounds(10, 20, 80, 25);
         newpanel.add(newlabel);
         newframe.setVisible(true);
      }
      else{
         success.setText("Login unsuccessful");
      }

   }
}