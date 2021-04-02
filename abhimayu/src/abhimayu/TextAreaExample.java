package abhimayu;
//package abhimayu;

import java.awt.Frame;
import java.awt.TextArea;

import java.awt.*;  
public class TextAreaExample  
{  
     TextAreaExample(){  
        Frame f= new Frame();  
            TextArea area=new TextArea("Welcome to javatpoint");  
        area.setBounds(10,30, 300,300);  
        f.add(area);  
        f.setSize(200,200);  
        f.setLayout(null);  
        f.setVisible(true);  
        Frame e= new Frame(); 
        Button b=new Button("Click Here");  
        b.setBounds(50,100,80,30);  
        e.add(b);  
        e.setSize(400,400);  
        e.setLayout(null);  
        e.setVisible(true);   
     }  
public static void main(String args[])  
{  
   new TextAreaExample();  
}  
}  