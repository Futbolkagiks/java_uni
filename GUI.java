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
   private static JComboBox<String> choose;
   public static void main (String[] args){
      JPanel panel = new JPanel();
      JFrame frame = new JFrame();
      frame.setSize(350,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);
      panel.setLayout(null);

      String[] types={"Salesman","Delivery","Provider"};

      choose = new JComboBox<>(types);
      choose.setBounds(10,20,255,25);
      panel.add(choose);

      userlabel = new JLabel("User");
      userlabel.setBounds(10, 50, 80, 25);
      panel.add(userlabel);

      userText = new JTextField();
      userText.setBounds(100, 50, 165, 25);
      panel.add(userText);

      passwordlabel = new JLabel("Password");
      passwordlabel.setBounds(10, 80, 80, 25);
      panel.add(passwordlabel);

      passwordText = new JPasswordField();
      passwordText.setBounds(100,80,165,25);
      panel.add(passwordText);
      
      loginbutton = new JButton("Login");
      loginbutton.setBounds(10,110,80,25);
      loginbutton.addActionListener(new GUI());
      panel.add(loginbutton);

      success = new JLabel("");
      success.setBounds(10,140,300,25);
      panel.add(success);
      // 
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      
      String user = userText.getText();
      String password = passwordText.getText();
      String selectedType = choose.getItemAt(choose.getSelectedIndex());
      System.out.println(user+","+password+" - "+selectedType);

      if (user.equals("Admin") && password.equals("Admin") && selectedType.equals("Salesman")){
         JPanel newpanel = new JPanel();
         JFrame newframe = new JFrame();
         newframe.setSize(350,200);
         newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         newframe.add(newpanel);
         newpanel.setLayout(null);
         JLabel newlabel = new JLabel();
         newlabel = new JLabel("Salesman Menu");
         newlabel.setBounds(50, 20, 80, 25);
         newpanel.add(newlabel);
         JButton button1 = new JButton("button");
         button1 = new JButton();
         button1.setBounds(50, 50, 80, 25);
         newpanel.add(button1);
         
         JButton button2 = new JButton("button");
         button2 = new JButton();
         button2.setBounds(50, 80, 80, 25);
         newpanel.add(button2);

         JButton button3 = new JButton("button");
         button3 = new JButton();
         button3.setBounds(50, 110, 80, 25);
         newpanel.add(button3);
         newframe.setVisible(true);
      }
      else if(user.equals("Admin") && password.equals("Admin") && selectedType.equals("Provider")){
         JPanel newpanel = new JPanel();
         JFrame newframe = new JFrame();
         newframe.setSize(350,200);
         newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         newframe.add(newpanel);
         newpanel.setLayout(null);
         JLabel newlabel = new JLabel();
         newlabel = new JLabel("Provider Menu");
         newlabel.setBounds(50, 20, 80, 25);
         newpanel.add(newlabel);
         JButton button1 = new JButton("button");
         button1 = new JButton();
         button1.setBounds(50, 50, 80, 25);
         newpanel.add(button1);
         
         JButton button2 = new JButton("button");
         button2 = new JButton();
         button2.setBounds(50, 80, 80, 25);
         newpanel.add(button2);

         JButton button3 = new JButton("button");
         button3 = new JButton();
         button3.setBounds(50, 110, 80, 25);
         newpanel.add(button3);
         newframe.setVisible(true);
      }
      else if(user.equals("Admin") && password.equals("Admin") && selectedType.equals("Delivery")){
         JPanel newpanel = new JPanel();
         JFrame newframe = new JFrame();
         newframe.setSize(350,200);
         newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         newframe.add(newpanel);
         newpanel.setLayout(null);
         JLabel newlabel = new JLabel();
         newlabel = new JLabel("Delivery Menu");
         newlabel.setBounds(50, 20, 80, 25);
         newpanel.add(newlabel);
         JButton button1 = new JButton("button");
         button1 = new JButton();
         button1.setBounds(50, 50, 80, 25);
         newpanel.add(button1);
         
         JButton button2 = new JButton("button");
         button2 = new JButton();
         button2.setBounds(50, 80, 80, 25);
         newpanel.add(button2);

         JButton button3 = new JButton("button");
         button3 = new JButton();
         button3.setBounds(50, 110, 80, 25);
         newpanel.add(button3);
         newframe.setVisible(true);
      }
      else{
         success.setText("Login unsuccessful");
      }

   }
}