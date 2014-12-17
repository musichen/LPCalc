package listeners;

import calc.CalcOperations;
import gui.MyJButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class CalcButtonActionListener implements ActionListener {

    private JTextField jtxtResult;
    private double firstNum;
    private double secondNum;
    private double lastResult;
    
                  //  STATE  MACHINE for Operational Buttons  + -  / *
    private boolean addClicked = false;
    private boolean subtractClicked = false;
    private boolean multiplyClicked = false;
    private boolean divideClicked = false;
    private boolean equalsClicked = false;
    private boolean lastResClicked = false;
    private boolean dotClicked;
    private boolean signClicked;
    private boolean powerClicked;
    
    private double current;           //  Storing var for multiple members cals
    
    
    // Cosntructor
    public CalcButtonActionListener (JTextField jtxtResult){

       this.jtxtResult = jtxtResult;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(!(e.getSource() instanceof MyJButton)){     // Filter other elements actions
            return;
        }
        JButton btn = (JButton) e.getSource();      // Нисходящее приведение
        //  Getting num A and num B from text Fields  and parsing them from txt to dbl
//        final double firstDouble = Double.parseDouble(jtxtChislo1.getText());
//        final double secondDouble = Double.parseDouble(jtxtChislo2.getText());
        // Define what button was pressed by getting its title (getActionCommand)
//set calc result to txtFieldResult by String.valueof parsing to text the num value from cal ops. Calling static CalcOperations.add(a,b) 
        switch (btn.getActionCommand()) {
            case "1":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;
                }
                jtxtResult.setText(jtxtResult.getText()+"1");
                break;
            case "2":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;

                }
                jtxtResult.setText(jtxtResult.getText()+"2");
                break;
            case "3":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;

                }
                jtxtResult.setText(jtxtResult.getText()+"3");
                break;
            case "4":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;

                }
                jtxtResult.setText(jtxtResult.getText()+"4");
                break;
            case "5":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;

                }
                jtxtResult.setText(jtxtResult.getText()+"5");
                break;
            case "6":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;

                }
                jtxtResult.setText(jtxtResult.getText()+"6");
                break;
            case "7":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;

                }
                jtxtResult.setText(jtxtResult.getText()+"7");
                break;
            case "8":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;

                }
                jtxtResult.setText(jtxtResult.getText()+"8");
                break;
            case "9":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;


                }
                jtxtResult.setText(jtxtResult.getText()+"9");
                break;
            case "0":
                if(equalsClicked|lastResClicked){
                    jtxtResult.setText("");
                    equalsClicked = false;
                    lastResClicked = false;

                }
                jtxtResult.setText(jtxtResult.getText()+"0");
                break;
                              //       MATH OPERATONS
                
            case "+":
                firstNum = Double.parseDouble(jtxtResult.getText());
                jtxtResult.setText(""); 
                addClicked = true;
                dotClicked = false;
                break;
            case "-":
                firstNum = Double.parseDouble(jtxtResult.getText());
                jtxtResult.setText(""); 
                subtractClicked = true;
                dotClicked = false;
                break;
            case "*":
                firstNum = Double.parseDouble(jtxtResult.getText());
                jtxtResult.setText(""); 
                multiplyClicked = true;
                dotClicked = false;
                break;                
            case "/":
                firstNum = Double.parseDouble(jtxtResult.getText());
                jtxtResult.setText(""); 
                divideClicked = true;
                dotClicked = false;
                break;  
            case "^":
                firstNum = Double.parseDouble(jtxtResult.getText());
                jtxtResult.setText("");
                powerClicked = true;
                dotClicked = false;

                break;

                            //   FUNCTION BUTTONS
            case "C":
                jtxtResult.setText("");  
                equalsClicked = false;
                dotClicked = false;
                break;
            case "LastRes":
                jtxtResult.setText(String.valueOf(lastResult));
                lastResClicked = true;
                break;

            case "+-":
                jtxtResult.setText(String.valueOf(Double.parseDouble(jtxtResult.getText())*-1.0));
                break;
            case ".":
                if(dotClicked){
                    break;
                }
                dotClicked = true;
                jtxtResult.setText(jtxtResult.getText()+".");
                break;
                
                                //  RESULTS  button
            case "=":
                equalsClicked = true;
                if (addClicked){
                    secondNum = Double.parseDouble(jtxtResult.getText());
                    jtxtResult.setText("");
                    addClicked = false;
                    jtxtResult.setText(String.valueOf(CalcOperations.add(firstNum,secondNum)));
                    lastResult = Double.parseDouble(jtxtResult.getText());
 
                }
                else if(subtractClicked){
                    secondNum = Double.parseDouble(jtxtResult.getText());
                    jtxtResult.setText("");
                    subtractClicked = false;
                    jtxtResult.setText(String.valueOf(CalcOperations.subtract(firstNum, secondNum)));
                    lastResult = Double.parseDouble(jtxtResult.getText());
                }
                else if(multiplyClicked){
                    secondNum = Double.parseDouble(jtxtResult.getText());
                    jtxtResult.setText("");
                    multiplyClicked = false;
                    jtxtResult.setText(String.valueOf(CalcOperations.multiply(firstNum, secondNum)));
                    lastResult = Double.parseDouble(jtxtResult.getText());
                }
                else if(divideClicked){
                    secondNum = Double.parseDouble(jtxtResult.getText());
                    jtxtResult.setText("");
                    divideClicked = false;
                    jtxtResult.setText(String.valueOf(CalcOperations.divide(firstNum, secondNum)));
                    lastResult = Double.parseDouble(jtxtResult.getText());
                    
                }
                else if (powerClicked){
                    secondNum = Double.parseDouble(jtxtResult.getText());
                    jtxtResult.setText("");
                    powerClicked = false;
                    jtxtResult.setText(String.valueOf(CalcOperations.power(firstNum, secondNum)));
                    lastResult = Double.parseDouble(jtxtResult.getText());                    
                }
           
                break;
                
        }
        
    }

}

//  round(200.3456, 2);

// btnLastRes btnPower btnSign btnEquals
//  btn1       btn2     btn3    btnAdd
//  btn4       btn5     btn6    btnSubtract
//  btn7       btn8     btn9    btnMultiply
//  btnClean   btn0     btnDot  btnDivide

               //  INSTEAD of IF  we can use SWITCH
//        switch (btn.getActionCommand()) {
//            case "ADD":
//                jtxtResult.setText(String.valueOf(CalcOperations.add(a,b)));     //set calc result to txtFieldResult by String.valueof parsing to text the num value from cal ops. Calling static CalcOperations.add(a,b) 
//                break;
//            case "SUBTRACT":
//                jtxtResult.setText(String.valueOf(CalcOperations.subtract(a,b)));
//                break;
//            case "MULTIPLY":
//                jtxtResult.setText(String.valueOf(CalcOperations.multiply(a,b)));
//                break;
//            case "DIVIDE":
//                jtxtResult.setText(String.valueOf(CalcOperations.divide(a,b)));
//                break;
//        }