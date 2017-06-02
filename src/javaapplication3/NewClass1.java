
package javaapplication3;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
public class NewClass1 extends Frame {
  Label lblsecond;
  
  public NewClass1(){
      setLayout(new FlowLayout());
      setTitle("awt counter");
      setSize(400,500);
     lblsecond=new Label("second Lable Test");
    add(lblsecond); 
    TextField tfC =new TextField("test",10);
    add(tfC);
    Button b=new Button("New button");
    add(b);
     setVisible(true);
     
  }
  public static void main(String[] args){
      NewClass1 n=new NewClass1();
  }
}
