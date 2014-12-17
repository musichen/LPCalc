
package gui;

import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import listeners.CalcButtonActionListener;


public class MainGUI {

    public static final String INPUT_CHISLO = "введите число";    
    private MyJButton btnAdd;
    private MyJButton btnSubtract;
    private MyJButton btnDivide;
    private MyJButton btnMultiply;
    private MyJButton btnPower;    
    private MyJButton btnDot;
    
    private MyJButton btnLastRes;
    private MyJButton btnSign;
    private MyJButton btnClean;
    private MyJButton btnEquals;
    
    private MyJButton btn1;
    private MyJButton btn2;
    private MyJButton btn3;
    private MyJButton btn4;
    private MyJButton btn5;
    private MyJButton btn6;
    private MyJButton btn7;
    private MyJButton btn8;
    private MyJButton btn9;
    private MyJButton btn0;
    

    
    private JTextField jtxtChislo1;
    private JTextField jtxtChislo2;
    private JTextField jtxtResult;
    
    private JPanel panel1;
    private JPanel panel2;

    
    private JFrame frame;

    public MyJButton getBtn1() {
        return btn1;
    }

    public MyJButton getBtn2() {
        return btn2;
    }

    public MyJButton getBtn3() {
        return btn3;
    }
   
   
   
    public static void main(String[] args) {
                      // System Settings
         System.setProperty("sun.java2d.d3d", "false");
         System.setProperty("sun.java2d.ddoffscreen", "false");
         System.setProperty("sun.java2d.noddraw", "true");
       // STYLE SET 
  try {
            UIManager.setLookAndFeel(new NoireLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFrame.setDefaultLookAndFeelDecorated(true);   // implement Style for all
    
        MainGUI mainGUI = new MainGUI();              // create main class instn
//        mainGUI.createLabels();
        mainGUI.createTextFields();
        mainGUI.createButtons();
        mainGUI.createPanels();
        mainGUI.createFrame();
        //  mainGUI.createLabels()
        //    createTextFields() createButtons()  createPanels()  createFrame()
  
  
    }
                      //  DEFINITION of creation METHODS for Components
    
    

    
    private void createTextFields (){

        Font font1 = new Font("Garamond", Font.BOLD, 25);
        
        jtxtResult = new JTextField("", 19);
        jtxtResult.setForeground(Color.yellow);
        jtxtResult.setFocusable(true);
        jtxtResult.setEditable(false);
        jtxtResult.setFont(font1);
        jtxtResult.setHorizontalAlignment(JTextField.CENTER);
        jtxtResult.setSize(370, 50);
        jtxtResult.setBounds(0, 0, 370, 50);
        
        addTextFieldFocusListeners();
    }
    
    private void createButtons (){
        btn1 = new MyJButton("1");
        btn2 = new MyJButton("2");
        btn3 = new MyJButton("3");
        btn4 = new MyJButton("4");
        btn5 = new MyJButton("5");
        btn6 = new MyJButton("6");
        btn7 = new MyJButton("7");
        btn8 = new MyJButton("8");
        btn9 = new MyJButton("9");
        btn0 = new MyJButton("0");
        
        btnAdd = new MyJButton("+");
        btnSubtract = new MyJButton("-");
        btnDivide = new MyJButton("/");
        btnMultiply = new MyJButton ("*");
        btnPower = new MyJButton("^");
        btnDot = new MyJButton(".");
        
        btnSign = new MyJButton("+-");
        btnLastRes = new MyJButton("LastRes");
        btnClean = new MyJButton("C");
        btnEquals = new MyJButton("=");
                          //  SET POSITION  and STYLE for all BUTTONS

//        Dimension dbtnLastRes = btnLastRes.getPreferredSize(); // dbtnLastRes.width, dbtnLastRes.height
        btnLastRes.setBounds(10, 10, 80, 30);
        btnPower.setBounds(100, 10, 80, 30);
        btnSign.setBounds(190, 10, 80, 30);
        btnEquals.setBounds(280, 10, 80, 30);
        
        btn1.setBounds(10, 50, 80, 30);
        btn2.setBounds(100, 50, 80, 30);
        btn3.setBounds(190, 50, 80, 30);
        btnAdd.setBounds(280, 50, 80, 30);
        
        btn4.setBounds(10, 90, 80, 30);
        btn5.setBounds(100, 90, 80, 30);
        btn6.setBounds(190, 90, 80, 30);
        btnSubtract.setBounds(280, 90, 80, 30);
        
        btn7.setBounds(10, 130, 80, 30);
        btn8.setBounds(100, 130, 80, 30);
        btn9.setBounds(190, 130, 80, 30);
        btnMultiply.setBounds(280, 130, 80, 30);
        
        btnClean.setBounds(10, 170, 80, 30);
        btn0.setBounds(100, 170, 80, 30);
        btnDot.setBounds(190, 170, 80, 30);
        btnDivide.setBounds(280, 170, 80, 30);
        
        
// btnLastRes btnPower btnSign btnEquals
//  btn1       btn2     btn3    btnAdd
//  btn4       btn5     btn6    btnSubtract
//  btn7       btn8     btn9    btnMultiply
//  btnClean   btn0     btnDot  btnDivide
        
        addButtonListeners();
    }
    
    private void createPanels (){
                  // PANEL 1
        panel1 = new JPanel();
        panel1.setSize(370, 50);
        panel1.setLayout(null);
                                    // elements of panel 1

        panel1.add(jtxtResult);
        
//        panel1.add(labelChislo1);
//        panel1.add(jtxtChislo1);
//        panel1.add(labelChislo2);
//        panel1.add(jtxtChislo2);
        
        
                  // PANEL 2
        panel2 = new JPanel();
        panel2.setSize(new Dimension(370, 400));
        panel2.setLayout(null);
                                      // elements of panel 2
        
        
        
        panel2.add(btnLastRes);
        panel2.add(btnPower);
        panel2.add(btnSign);
        panel2.add(btnEquals);

        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btnAdd);
        
    
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btnSubtract);


        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btnMultiply);
        
  
        panel2.add(btnClean);
        panel2.add(btn0);
        panel2.add(btnDot);
        panel2.add(btnDivide);
        
        
                  // PANEL 3
//        panel3 = new JPanel();
//        panel3.setSize(100, 50);
//        panel3.setPreferredSize(new Dimension(200, 50));
//        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                   // elements of panel 3
        
//        panel3.add(labelResult);
//        panel3.add(jtxtResult);
        
    }
    
    private void createFrame (){
                          // Main FRAME
        frame = new JFrame("LP Calc");
        frame.setSize(new Dimension(380, 290));
        frame.setLayout(null);
              panel1.setBounds(0, 0, 370, 50);
              panel2.setBounds(0, 50, 370, 210);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
//        try {
//    Image myImage = ImageIO.read(getClass().getResource("icon.png"));
//    frame.setContentPane();
//} catch (IOException e) {
//    e.printStackTrace();
//}
        
//        String imageResource = "icon.png"; //.... string to image resource path
//        Image myImage = null;
//        try {
//            myImage = ImageIO.read(getClass().getResourceAsStream(imageResource));
//        } catch (IOException ex) {
//            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Icon logo = new ImageIcon(myImage);
       
        frame.setIconImage(new ImageIcon("icon.png").getImage());
                                    //  frame components adding
        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);

        
        frame.setVisible(true);
       
//        frame = new MyJFrame("Musichen Calculator", 430, 200, new BorderLayout(2, 2));
//        frame.setMinimumSize(new Dimension(430, 200));
//
//        frame.setResizable(true);
//
//        frame.getContentPane().add(panel1, BorderLayout.NORTH);
//        frame.getContentPane().add(panel2, BorderLayout.CENTER);
//        frame.getContentPane().add(panel3, BorderLayout.SOUTH);
//
//        frame.setVisible(true);
    }
    
    
        //   CREATE  Listeners
    
    private void addButtonListeners (){
                //create the instance of CalcButtonListener with our constructor
        CalcButtonActionListener btnListener = new CalcButtonActionListener(jtxtResult);
        
//        btnAdd.addActionListener(btnListener);
//        btnSubtract.addActionListener(btnListener);
//        btnDivide.addActionListener(btnListener);
//        btnMultiply.addActionListener(btnListener);
        
        btnLastRes.addActionListener(btnListener);
        btnPower.addActionListener(btnListener);
        btnSign.addActionListener(btnListener);
        btnEquals.addActionListener(btnListener);
        
        btn1.addActionListener(btnListener);
        btn2.addActionListener(btnListener);
        btn3.addActionListener(btnListener);
        btnAdd.addActionListener(btnListener);
        
        btn4.addActionListener(btnListener);
        btn5.addActionListener(btnListener);
        btn6.addActionListener(btnListener);
        btnSubtract.addActionListener(btnListener);
        
        btn7.addActionListener(btnListener);
        btn8.addActionListener(btnListener);
        btn9.addActionListener(btnListener);
        btnMultiply.addActionListener(btnListener);
        
        btnClean.addActionListener(btnListener);
        btn0.addActionListener(btnListener);
        btnDot.addActionListener(btnListener);
        btnDivide.addActionListener(btnListener);
        
        
    }
    
    private void addTextFieldFocusListeners(){
        
    }
    
    
}
