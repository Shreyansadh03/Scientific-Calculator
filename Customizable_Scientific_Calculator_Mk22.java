import java.text.*;
import java.util.*;
import java.math.*;
import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math;
import java.lang.Object;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.border.Border;
public class Customizable_Scientific_Calculator_Mk22 extends JApplet implements ActionListener,ItemListener,AdjustmentListener,Runnable 
{
    Date date;
    SimpleDateFormat formatter;
    String dispdate;
    public Calendar d;
    Thread t1;
    Container container;
    JTextField f1,f3,fd,ft;
    JButton b1,b2,b3,b4,b5,b6,b10,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72;
    JScrollBar s1,s2,s3;
    Label l1,l4,l5,l6,l9,l10,l11,l12,l19,l20,l0;
    JLabel l21,l22,l23;
    JPanel panel1,panel2,panel3,panel4,panel5,panel6;
    Color co;
    JComboBox c1,c2,c3;
    int x=1;
    Thread t;
    Font fon=new Font("monospaced",Font.BOLD|Font.ITALIC,18);
    Font fon1=new Font("serif",Font.BOLD,14);
    Font fon2=new Font("TimesRoman",Font.ITALIC,14);
    Font fon3=new Font("casteller",Font.BOLD|Font.ITALIC,14);
    ScriptEngineManager sem=new ScriptEngineManager();
    ScriptEngine se=sem.getEngineByName("JavaScript");
    public void init()
    { 
        t1=new Thread(this);
        t1.start();
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch(Exception e)
        {
        }
        FlowLayout ex = new FlowLayout();
        container=getContentPane();
        container.setLayout(ex);
        date=new Date();
        formatter=new SimpleDateFormat("   EEEE MMM dd yyyy"+"\t"+"                  hh:mm:ss",Locale.getDefault());
        dispdate=formatter.format(date);
        f1=new JTextField(107);
        f1.setBackground(Color.red);
        f1.setForeground(Color.yellow);
        f1.setFont(fon3);
        f3=new JTextField(107);
        f3.setBackground(Color.red);
        f3.setForeground(Color.yellow);
        f3.setFont(fon3);
        fd=new JTextField(28);
        fd.setFont(fon3);
        fd.setBackground(Color.red);
        fd.setForeground(Color.yellow);
        fd.setEditable(false);
        ft=new JTextField(12);
        ft.setFont(fon);
        ft.setBackground(Color.red);
        ft.setForeground(Color.yellow);
        ft.setEditable(false);
        b1=new JButton("+");
        b1.setFont(fon1);
        b2=new JButton("-");
        b2.setFont(fon1);
        b3=new JButton("×");
        b3.setFont(fon1);
        b4=new JButton("÷");
        b4.setFont(fon1);
        b5=new JButton("Power");
        b5.setFont(fon1);
        b6=new JButton("Sqrt(√)");
        b6.setFont(fon1);
        b10=new JButton("٪");
        b10.setFont(fon1);
        b14=new JButton("1");
        b14.setFont(fon1);
        b15=new JButton("2");
        b15.setFont(fon1);
        b16=new JButton("3");
        b16.setFont(fon1);
        b17=new JButton("4");
        b17.setFont(fon1);
        b18=new JButton("5");
        b18.setFont(fon1);
        b19=new JButton("6");
        b19.setFont(fon1);
        b20=new JButton("7");
        b20.setFont(fon1);
        b21=new JButton("8");
        b21.setFont(fon1);
        b22=new JButton("9");
        b22.setFont(fon1);
        b23=new JButton("0");
        b23.setFont(fon1);
        b24=new JButton("n!");
        b24.setFont(fon1);
        b25=new JButton("sin(θ)");
        b25.setFont(fon1);
        b26=new JButton("cos(θ)");
        b26.setFont(fon1);
        b27=new JButton("tan(θ)");
        b27.setFont(fon1);
        b28=new JButton("cosec(θ)");
        b28.setFont(fon1);
        b29=new JButton("sec(θ)");
        b29.setFont(fon1);
        b30=new JButton("cot(θ)");
        b30.setFont(fon1);
        b31=new JButton("sin-1(x)");
        b31.setFont(fon1);
        b32=new JButton("cos-1(x)");
        b32.setFont(fon1);
        b33=new JButton("tan-1(x)");
        b33.setFont(fon1);
        b34=new JButton("ln");
        b34.setFont(fon1);
        b35=new JButton("log(base 10)");
        b35.setFont(fon1);
        b36=new JButton("To Degrees");
        b36.setFont(fon1);
        b37=new JButton("To Radians");
        b37.setFont(fon1);
        b38=new JButton("| x |");
        b38.setFont(fon1);
        b39=new JButton("e^x");
        b39.setFont(fon1);
        b40=new JButton("Hyp sinh(x)");
        b40.setFont(fon1);
        b41=new JButton("Hyp cosh(x)");
        b41.setFont(fon1); 
        b42=new JButton("Hyp tanh(x)");
        b42.setFont(fon1);
        b43=new JButton("Decimal to Binary");
        b43.setFont(fon1);
        b44=new JButton("Decimal to Octal");
        b44.setFont(fon1);
        b45=new JButton("Decimal to Hexadecimal");
        b45.setFont(fon1);
        b46=new JButton("nPr");
        b46.setFont(fon1);
        b47=new JButton("nCr");
        b47.setFont(fon1);
        b48=new JButton("cbrt");
        b48.setFont(fon1);
        b49=new JButton("xth root");
        b49.setFont(fon1);
        b50=new JButton("AC");
        b50.setFont(fon);
        b51=new JButton("Next Color");
        b51.setFont(fon1);
        b58=new JButton("Coloured Buttons");
        b58.setFont(fon1);
        b52=new JButton("DEL");
        b52.setFont(fon);
        b53=new JButton("=");
        b53.setFont(fon1);
        b54=new JButton("(");
        b54.setFont(fon1);
        b55=new JButton(")");
        b55.setFont(fon1);
        b56=new JButton("ANS");
        b56.setFont(fon1);
        b57=new JButton(".");
        b57.setFont(fon1);
        b59=new JButton("Power Sign (^)");
        b59.setFont(fon1);
        b60=new JButton("Permutation Sign (P)");
        b60.setFont(fon1);
        b61=new JButton("Combination Sign (C)");
        b61.setFont(fon1);
        b62=new JButton("Root Sign (√)");
        b62.setFont(fon1);
        b63=new JButton("Binary to Decimal");
        b63.setFont(fon1);
        b64=new JButton("Octal to Decimal");
        b64.setFont(fon1);
        b65=new JButton("A");
        b65.setFont(fon1);
        b66=new JButton("B");
        b66.setFont(fon1);
        b67=new JButton("C");
        b67.setFont(fon1);
        b68=new JButton("D");
        b68.setFont(fon1);
        b69=new JButton("E");
        b69.setFont(fon1);
        b70=new JButton("F");
        b70.setFont(fon1);
        b71=new JButton("HexaDecimal to Decimal");
        b71.setFont(fon1);
        b72=new JButton("CE");
        b72.setFont(fon);
        s1=new JScrollBar(s1.HORIZONTAL,0,0,0,255);
        s2=new JScrollBar(s2.HORIZONTAL,0,0,0,255);
        s3=new JScrollBar(s3.HORIZONTAL,0,0,0,255);
        l0=new Label("Time and Date and Start Time-->");
        l0.setFont(fon2);
        l1=new Label("Input Field - ");
        l1.setFont(fon2);
        l4=new Label("Result Field - ");
        l4.setFont(fon2);
        l5=new Label("Number System Conversion -");
        l5.setFont(fon2);
        l6=new Label("Input Numbers -");
        l6.setFont(fon2);
        l9=new Label("--------------------------RED------------------------>");
        l9.setFont(fon2);
        l10=new Label("------------------------GREEN---------------------->");
        l10.setFont(fon2);
        l11=new Label("-------------------------BLUE----------------------->");
        l11.setFont(fon2); 
        l12=new Label("Fonts Base(Buttons) ------------------------------->");
        l12.setFont(fon2);
        l19=new Label("Font Base(Labels) --------------------------------->");
        l19.setFont(fon2);
        l21=new JLabel("");
        l22=new JLabel("");
        l23=new JLabel("");
        c1=new JComboBox();
        c1.addItem("Bold");
        c1.addItem("Italics");
        c1.addItem("Plain");
        c1.addItem("Bold & Italics");
        c2=new JComboBox();
        c2.addItem("Italics");
        c2.addItem("Bold");
        c2.addItem("Plain");
        c2.addItem("Bold & Italics");
        c3=new JComboBox();
        c3.addItem("Nimbus");
        c3.addItem("Windows");
        c3.addItem("Motif");
        c3.addItem("Metal");
        l20=new Label("Button Style ---------------------------------------->");
        l20.setFont(fon2);
        panel1=new JPanel();
        panel1.setLayout(new GridLayout(4,1,0,0));
        panel1.setBorder(BorderFactory.createRaisedBevelBorder());
        panel2=new JPanel();
        panel2.setLayout(new GridLayout(0,7,3,0));
        panel2.setBorder(BorderFactory.createRaisedBevelBorder());
        panel3=new JPanel();
        panel3.setLayout(new GridLayout(0,3,4,4));
        panel3.setBorder(BorderFactory.createRaisedBevelBorder());
        panel4=new JPanel();
        panel4.setLayout(new GridLayout(7,2,2,1));
        panel4.setBorder(BorderFactory.createRaisedBevelBorder());
        panel5=new JPanel();
        panel5.setLayout(new GridLayout(0,2,4,2));
        panel5.setBorder(BorderFactory.createRaisedBevelBorder());
        l0.setBackground(Color.yellow);
        l1.setBackground(Color.yellow);
        l4.setBackground(Color.yellow);
        l5.setBackground(Color.yellow);
        l6.setBackground(Color.yellow);
        l9.setBackground(Color.yellow);
        l10.setBackground(Color.yellow);
        l11.setBackground(Color.yellow);
        l12.setBackground(Color.yellow);
        l19.setBackground(Color.yellow);
        l20.setBackground(Color.yellow);
        fd.setText(dispdate);
        container.add(l0);
        container.add(ft);
        container.add(fd);
        container.add(panel1,BorderLayout.NORTH);
        panel1.add(l1);
        panel1.add(f1);
        panel1.add(l4);
        panel1.add(f3);
        container.add(panel2);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b48);
        panel2.add(b49);
        panel2.add(b10);
        panel2.add(b24);
        panel2.add(b46);
        panel2.add(b47);
        panel2.add(b25);
        panel2.add(b26);
        panel2.add(b27);
        panel2.add(b28);
        panel2.add(b29);
        panel2.add(b30);
        panel2.add(b31);
        panel2.add(b32);
        panel2.add(b33);
        panel2.add(b34);
        panel2.add(b35);
        panel2.add(b36);
        panel2.add(b37);
        panel2.add(b38);
        panel2.add(b39);
        panel2.add(b40);
        panel2.add(b41);
        panel2.add(b42);
        panel2.add(b59);
        panel2.add(b60);
        panel2.add(b61);
        panel2.add(b62);
        panel2.add(b57);
        panel2.add(b54);
        panel2.add(b55);
        panel2.add(b56);
        panel2.add(b52);
        panel2.add(b72);
        panel2.add(b50);
        panel2.add(b53);
        container.add(panel5);
        //panel5.add(l5);
        panel5.add(b43);
        panel5.add(b44);
        panel5.add(b45);
        panel5.add(b63);
        panel5.add(b64);
        panel5.add(b71);
        panel5.add(b65);
        panel5.add(b66);
        panel5.add(b67);
        panel5.add(b68);
        panel5.add(b69);
        panel5.add(b70);
        container.add(panel3);
        panel3.add(l21);
        panel3.add(l6);
        panel3.add(l22);
        panel3.add(b20);
        panel3.add(b21);
        panel3.add(b22);
        panel3.add(b17);
        panel3.add(b18);
        panel3.add(b19);
        panel3.add(b14);
        panel3.add(b15);
        panel3.add(b16);
        panel3.add(l23);
        panel3.add(b23);
        container.add(panel4);
        //panel4.add(l2);
        panel4.add(l9);
        panel4.add(s1);
        panel4.add(l10);
        panel4.add(s2);
        panel4.add(l11);
        panel4.add(s3);
        panel4.add(l12);
        panel4.add(c1);
        panel4.add(l19);
        panel4.add(c2);
        panel4.add(l20);
        panel4.add(c3);
        panel4.add(b51);
        panel4.add(b58);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b10.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);
        b31.addActionListener(this);
        b32.addActionListener(this);
        b33.addActionListener(this);
        b34.addActionListener(this);
        b35.addActionListener(this);
        b36.addActionListener(this);
        b37.addActionListener(this);
        b38.addActionListener(this);
        b39.addActionListener(this);
        b40.addActionListener(this);
        b41.addActionListener(this);
        b42.addActionListener(this);
        b43.addActionListener(this);
        b44.addActionListener(this);
        b45.addActionListener(this);
        b46.addActionListener(this);
        b47.addActionListener(this);
        b48.addActionListener(this);
        b49.addActionListener(this);
        b50.addActionListener(this);
        b51.addActionListener(this);
        b52.addActionListener(this);
        b53.addActionListener(this);
        b54.addActionListener(this);
        b55.addActionListener(this);
        b56.addActionListener(this);
        b57.addActionListener(this);
        b58.addActionListener(this);
        b59.addActionListener(this);
        b60.addActionListener(this);
        b61.addActionListener(this);
        b62.addActionListener(this);
        b63.addActionListener(this);
        b64.addActionListener(this);
        b65.addActionListener(this);
        b66.addActionListener(this);
        b67.addActionListener(this);
        b68.addActionListener(this);
        b69.addActionListener(this);
        b70.addActionListener(this);
        b71.addActionListener(this);
        b72.addActionListener(this);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        t=new Thread(this);
        t.start();
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            f1.setText(f1.getText()+"+");
        }
        if(ae.getSource()==b2)
        {
            f1.setText(f1.getText()+"-");
        }
        if(ae.getSource()==b3)
        {
            f1.setText(f1.getText()+"*");
        }
        if(ae.getSource()==b4)
        {
            f1.setText(f1.getText()+"/");
        }
        if(ae.getSource()==b5)
        {
            String ss=f1.getText();
            String wrd="",wrd1="",ss1="";
            int i,op=0,a=0,b=0;
            ss1=ss+" ";
            int ln=ss1.length();
            double x=0.0,y=0.0,z=0.0;
            for(i=0;i<ln;++i)
            {
                if(ss1.charAt(i)=='^')
                    op=ss1.indexOf('^');
            }
            wrd=ss1.substring(0,op);
            a=ss1.indexOf(ss1.charAt(ln-1));
            b=ss1.indexOf(ss1.charAt(op+1));
            wrd1=ss1.substring(b,a);
            x=Double.parseDouble(wrd);
            y=Double.parseDouble(wrd1);
            z=Math.pow(x,y);
            f3.setText(String.valueOf(z));
        }
        if(ae.getSource()==b6)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double c=Math.sqrt(a);
            f3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b10)
        {
            f1.setText(f1.getText()+"%");
        }
        if(ae.getSource()==b24)
        {
            long a=Long.parseLong(f1.getText());
            BigInteger c=BigInteger.valueOf(1);
            if(a==0)
            {
                c=c.multiply(BigInteger.valueOf(1));
                f3.setText(String.valueOf(c));
            }
            for(long i=1;i<=a;i++)
            {
                c=c.multiply(BigInteger.valueOf(i));
                f3.setText(String.valueOf(c));
            }
        }
        if(ae.getSource()==b25)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double b=a*Math.PI/180;
            double c=Math.sin(b);
            f3.setText(Double.toString(c));
        }
        if(ae.getSource()==b26)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double b=a*Math.PI/180;
            double c=Math.cos(b);
            f3.setText(Double.toString(c));
            if(a==90)
                f3.setText("0");
        }
        if(ae.getSource()==b27)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double b=a*Math.PI/180;
            double c=Math.tan(b);
            f3.setText(Double.toString(c));
            if(a==45)
                f3.setText("1");
        }
        if(ae.getSource()==b28)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double r=Math.toRadians(a);
            double s=1/Math.sin(r);
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b29)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double r=Math.toRadians(a);
            double c=1/Math.cos(r);
            f3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b30)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double r=Math.toRadians(a);
            double t=1/Math.tan(r);
            f3.setText(String.valueOf(t));
            if(a==45)
                f3.setText("1");
        }
        if(ae.getSource()==b31)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double s=Math.asin(a)*180/Math.PI;
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b32)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double s=Math.acos(a)*180/Math.PI;
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b33)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double s=Math.atan(a)*180/Math.PI;
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b34)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double s=Math.log(a);
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b35)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double s=Math.log10(a);
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b36)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double s=a*180/Math.PI ;
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b37)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Double.parseDouble(ss);
            double s=a*Math.PI/180;
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b38)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            float a=Float.parseFloat(ss);
            float s=Math.abs(a);
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b39)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Float.parseFloat(ss);
            double s=Math.exp(a);
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b40)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Float.parseFloat(ss);
            double s=Math.sinh(a);
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b41)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Float.parseFloat(ss);
            double s=Math.cosh(a);
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b42)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double a=Float.parseFloat(ss);
            double s=Math.tanh(a);
            f3.setText(String.valueOf(s));
        }
        if(ae.getSource()==b46)
        {
            String ss=f1.getText();
            String wrd="",wrd1="",ss1="";
            ss1=ss+" ";
            int ln=ss1.length();
            int op=0;
            long n=0,r=0;
            for(int i=0;i<ln;++i)
            {
                if(ss1.charAt(i)=='P')
                    op=ss1.indexOf('P');
            }
            wrd=ss1.substring(0,op);
            wrd1=ss1.substring(op+1,ln-1);
            n=Long.parseLong(wrd);
            r=Long.parseLong(wrd1);
            BigInteger fact=BigInteger.valueOf(1);
            BigInteger perfact=BigInteger.valueOf(1);
            for(long i=1;i<=n;i++)
            {
                fact=fact.multiply(BigInteger.valueOf(i));
            }
            for(long j=1;j<=n-r;j++)
            {
                perfact=perfact.multiply(BigInteger.valueOf(j));
            }
            BigInteger permute=fact.divide(perfact);
            f3.setText(String.valueOf(permute));
        }
        if(ae.getSource()==b47)
        {
            String ss=f1.getText();
            String wrd="",wrd1="",ss1="";
            ss1=ss+" ";
            int ln=ss1.length();
            int op=0;
            long n=0,r=0;
            for(int i=0;i<ln;++i)
            {
                if(ss1.charAt(i)=='C')
                    op=ss1.indexOf('C');
            }
            wrd=ss1.substring(0,op);
            wrd1=ss1.substring(op+1,ln-1);
            n=Long.parseLong(wrd);
            r=Long.parseLong(wrd1);
            BigInteger num_fact=BigInteger.valueOf(1);
            BigInteger denom_fact=BigInteger.valueOf(1);
            BigInteger combi_fact=BigInteger.valueOf(1);
            for(long i=1;i<=n;i++)
            {
                num_fact=num_fact.multiply(BigInteger.valueOf(i));
            }
            for(long j=1;j<=n-r;j++)
            {
                denom_fact=denom_fact.multiply(BigInteger.valueOf(j));
            }
            for(long k=1;k<=r;k++)
            {
                combi_fact=combi_fact.multiply(BigInteger.valueOf(k));
            }
            BigInteger combine=num_fact.divide(denom_fact.multiply(combi_fact));
            f3.setText(String.valueOf(combine));
        }
        if(ae.getSource()==b48)
        {
            String ss="";
            try
            {
                String a=f1.getText();
                ss=(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            double n=Double.parseDouble(ss);
            double m=Math.cbrt(n);
            f3.setText(String.valueOf(m));
        }
        if(ae.getSource()==b49)
        {
            String ss=f1.getText();
            String wrd="",wrd1="",ss1="";
            int i,op=0,a=0,b=0;
            ss1=ss+" ";
            int ln=ss1.length();
            double x=0.0,y=0.0,z=0.0;
            for(i=0;i<ln;++i)
            {
                if(ss1.charAt(i)=='√')
                    op=ss1.indexOf('√');
            }
            wrd=ss1.substring(0,op);
            a=ss1.indexOf(ss1.charAt(ln-1));
            b=ss1.indexOf(ss1.charAt(op+1));
            wrd1=ss1.substring(b,a);
            x=Double.parseDouble(wrd);
            y=Double.parseDouble(wrd1);
            z=Math.pow(y,(1/x));
            f3.setText(String.valueOf(z));
        }
        if(ae.getSource()==b50)
        {
            f1.setText(null);
            f3.setText(null);
        }
        if(ae.getSource()==b51)
        {
            int a,b,c;
            a=(int)(Math.random()*255);
            b=(int)(Math.random()*255);
            c=(int)(Math.random()*255);
            co=new Color(a,b,c);
            container.setBackground(co);
            panel1.setBackground(co);
            panel2.setBackground(co);
            panel3.setBackground(co);
            panel4.setBackground(co);
            panel5.setBackground(co);
        }
        if(ae.getSource()==b52)
        {
            f1.setText(f1.getText().substring(0,f1.getText().length()-1));
        }
        if(ae.getSource()==b53)
        {
            try
            {
                String a=f1.getText();
                f3.setText(String.valueOf(se.eval(a)));
            }
            catch(Exception e){}  
            String ss=f1.getText();
            String wrd="",wrd1="",ss1="";
            int i,op=0,a=0,b=0;
            ss1=ss+" ";
            int ln=ss1.length();
            double x=0.0,y=0.0,z=0.0;
            for(i=0;i<ln;++i)
            {
                if(ss1.charAt(i)=='%')
                    op=ss1.indexOf('%');
            }
            wrd=ss1.substring(0,op);
            a=ss1.indexOf(ss1.charAt(ln-1));
            b=ss1.indexOf(ss1.charAt(op+1));
            wrd1=ss1.substring(b,a);
            x=Double.parseDouble(wrd);
            y=Double.parseDouble(wrd1);
            z=(x/100)*y;
            f3.setText(String.valueOf(z));
        }
        if(ae.getSource()==b54)
        {
            f1.setText(f1.getText()+"(");
        }
        if(ae.getSource()==b55)
        {
            f1.setText(f1.getText()+")");
        }
        if(ae.getSource()==b56)
        {
            f1.setText(f1.getText()+f3.getText());
        }
        if(ae.getSource()==b57)
        {
            f1.setText(f1.getText()+".");
        }
        if(ae.getSource()==b58)
        {
            b1.setBackground(Color.green);
            b2.setBackground(Color.green);
            b3.setBackground(Color.green);
            b4.setBackground(Color.green);
            b5.setBackground(Color.green);
            b6.setBackground(Color.green);
            b10.setBackground(Color.green);
            b48.setBackground(Color.green);
            b49.setBackground(Color.green);
            b24.setBackground(Color.cyan);
            b25.setBackground(Color.cyan);
            b26.setBackground(Color.cyan);
            b27.setBackground(Color.cyan);
            b28.setBackground(Color.cyan);
            b29.setBackground(Color.cyan);
            b30.setBackground(Color.cyan);
            b31.setBackground(Color.cyan);
            b32.setBackground(Color.cyan);
            b33.setBackground(Color.cyan);
            b34.setBackground(Color.cyan);
            b35.setBackground(Color.cyan);
            b36.setBackground(Color.cyan);
            b37.setBackground(Color.cyan);
            b38.setBackground(Color.cyan);
            b39.setBackground(Color.cyan);
            b40.setBackground(Color.cyan);
            b41.setBackground(Color.cyan);
            b42.setBackground(Color.cyan);
            b46.setBackground(Color.cyan);
            b47.setBackground(Color.cyan);
            b53.setBackground(Color.green);
            b54.setBackground(Color.green);
            b55.setBackground(Color.green);
            b56.setBackground(Color.green);
            b57.setBackground(Color.green);
            b14.setBackground(Color.MAGENTA);
            b15.setBackground(Color.magenta);
            b16.setBackground(Color.magenta);
            b17.setBackground(Color.magenta);
            b18.setBackground(Color.magenta);
            b19.setBackground(Color.magenta);
            b20.setBackground(Color.magenta);
            b21.setBackground(Color.magenta);
            b22.setBackground(Color.magenta);
            b23.setBackground(Color.magenta);
            b43.setBackground(Color.orange);
            b44.setBackground(Color.orange);
            b45.setBackground(Color.orange);
            b50.setBackground(Color.red);
            b50.setForeground(Color.yellow);
            b51.setBackground(Color.red);
            b58.setBackground(Color.red);
            b52.setBackground(Color.red);
            b52.setForeground(Color.yellow);
            b59.setBackground(Color.pink);
            b60.setBackground(Color.pink);
            b61.setBackground(Color.pink);
            b62.setBackground(Color.pink);
            b63.setBackground(Color.orange);
            b64.setBackground(Color.orange);
            b65.setBackground(Color.orange);
            b66.setBackground(Color.orange);
            b67.setBackground(Color.orange);
            b68.setBackground(Color.orange);
            b69.setBackground(Color.orange);
            b70.setBackground(Color.orange);
            b71.setBackground(Color.orange);
            b72.setBackground(Color.red);
            b72.setForeground(Color.yellow);
        }
        if(ae.getSource()==b59)
        {
            f1.setText(f1.getText()+"^");
        }
        if(ae.getSource()==b60)
        {
            f1.setText(f1.getText()+"P");
        }
        if(ae.getSource()==b61)
        {
            f1.setText(f1.getText()+"C");
        }
        if(ae.getSource()==b62)
        {
            f1.setText(f1.getText()+"√");
        }
        if(ae.getSource()==b14)
        {
            f1.setText(f1.getText()+"1");
        }
        if(ae.getSource()==b15)
        {
            f1.setText(f1.getText()+"2");
        }
        if(ae.getSource()==b16)
        {
            f1.setText(f1.getText()+"3");
        }
        if(ae.getSource()==b17)
        {
            f1.setText(f1.getText()+"4");
        }
        if(ae.getSource()==b18)
        {
            f1.setText(f1.getText()+"5");
        }
        if(ae.getSource()==b19)
        {
            f1.setText(f1.getText()+"6");
        }
        if(ae.getSource()==b20)
        {
            f1.setText(f1.getText()+"7");
        }
        if(ae.getSource()==b21)
        {
            f1.setText(f1.getText()+"8");
        }
        if(ae.getSource()==b22)
        {
            f1.setText(f1.getText()+"9");
        }
        if(ae.getSource()==b23)
        {
            f1.setText(f1.getText()+"0");
        }
        if(ae.getSource()==b43)
        {
            long a=Integer.parseInt(f1.getText()),b;
            String str="",str1="";
            while(a>0)
            {
                b=a%2;
                str=Long.toString(b);
                a/=2;
                str1=str+str1;
            }
            f3.setText(str1);
        }
        if(ae.getSource()==b44)
        {
            int n=Integer.parseInt(f1.getText());
            String str="",str1="";
            while(n>0)
            {
                int rem=n%8;
                str1=String.valueOf(rem);
                n/=8;
                str=str1+str;
            }
            f3.setText(str);
        }
        if(ae.getSource()==b45)
        {
            int num=Integer.parseInt(f1.getText());
            String hex_content="0123456789ABCDEF",str1="",str="";
            int rem;
            while(num>0)
            {
                rem=num%16;
                str1=hex_content.charAt(rem)+str1;
                num=num/16;
            }
            str=str1+str;
            f3.setText(str);
        }
        if(ae.getSource()==b63)
        {
            String ss=f1.getText();
            int ln=ss.length(),i,p=0,x=0;
            double y=0.0;
            char ch=' ';
            for(i=ln-1;i>=0;i--,p++)
            {
                ch=ss.charAt(i);
                x=ch-48;
                y=y+(x*Math.pow(2,p));
            }
            f3.setText(String.valueOf(y));
        }
        if(ae.getSource()==b64)
        {
            String ss=f1.getText();
            int ln=ss.length(),i,p=0,x=0;
            double y=0.0;
            char ch=' ';
            for(i=ln-1;i>=0;i--,p++)
            {
                ch=ss.charAt(i);
                x=ch-48;
                y=y+(x*Math.pow(8,p));
            }
            f3.setText(String.valueOf(y));
        }
        if(ae.getSource()==b65)
        {
            f1.setText(f1.getText()+"A");
        }
        if(ae.getSource()==b66)
        {
            f1.setText(f1.getText()+"B");
        }
        if(ae.getSource()==b67)
        {
            f1.setText(f1.getText()+"C");
        }
        if(ae.getSource()==b68)
        {
            f1.setText(f1.getText()+"D");
        }
        if(ae.getSource()==b69)
        {
            f1.setText(f1.getText()+"E");
        }
        if(ae.getSource()==b70)
        {
            f1.setText(f1.getText()+"F");
        }
        if(ae.getSource()==b71)
        {
            String ss=f1.getText();
            int ln=ss.length();
            long p=0;
            double ss1=0.0;
            int i;
            char ch=' ';
            for(i=ln-1;i>=0;i--,p++)
            {
                ch=ss.charAt(i);
                switch(ch)
                {
                    case '1':
                    ss1=ss1+1*Math.pow(16,p);
                    break;
                    case '2':
                    ss1=ss1+2*Math.pow(16,p);
                    break;
                    case '3':
                    ss1=ss1+3*Math.pow(16,p);
                    break;
                    case '4':
                    ss1=ss1+4*Math.pow(16,p);
                    break;
                    case '5':
                    ss1=ss1+5*Math.pow(16,p);
                    break;
                    case '6':
                    ss1=ss1+6*Math.pow(16,p);
                    break;
                    case '7':
                    ss1=ss1+7*Math.pow(16,p);
                    break;
                    case '8':
                    ss1=ss1+8*Math.pow(16,p);
                    break;
                    case '9':
                    ss1=ss1+9*Math.pow(16,p);
                    break;
                    case 'A':
                    ss1=ss1+10*Math.pow(16,p);
                    break;
                    case 'B':
                    ss1=ss1+11*Math.pow(16,p);
                    break;
                    case 'C':
                    ss1=ss1+12*Math.pow(16,p);
                    break;
                    case 'D':
                    ss1=ss1+13*Math.pow(16,p);
                    break;
                    case 'E':
                    ss1=ss1+14*Math.pow(16,p);
                    break;
                    case 'F':
                    ss1=ss1+15*Math.pow(16,p);
                    break;
                    default:
                }
            }
            f3.setText(String.valueOf(ss1));
        }
        if(ae.getSource()==b72)
        {
            f1.setText(null);
        }
    }

    public void itemStateChanged(ItemEvent ie)
    {
        if(c1.getSelectedItem().equals("Bold"))
        {
            fon1=new Font("Serif",Font.BOLD,14);
            b1.setFont(fon1);
            b2.setFont(fon1);
            b3.setFont(fon1);
            b4.setFont(fon1);
            b5.setFont(fon1);
            b6.setFont(fon1);
            b10.setFont(fon1);
            b14.setFont(fon1);
            b15.setFont(fon1);
            b16.setFont(fon1);
            b17.setFont(fon1);
            b18.setFont(fon1);
            b19.setFont(fon1);
            b20.setFont(fon1);
            b21.setFont(fon1);
            b22.setFont(fon1);
            b23.setFont(fon1);
            b24.setFont(fon1);
            b25.setFont(fon1);
            b26.setFont(fon1);
            b27.setFont(fon1);
            b28.setFont(fon1);
            b29.setFont(fon1);
            b30.setFont(fon1);
            b31.setFont(fon1);
            b32.setFont(fon1);
            b33.setFont(fon1);
            b34.setFont(fon1);
            b35.setFont(fon1);
            b36.setFont(fon1);
            b37.setFont(fon1);
            b38.setFont(fon1);
            b39.setFont(fon1);
            b40.setFont(fon1);
            b41.setFont(fon1); 
            b42.setFont(fon1);
            b43.setFont(fon1);
            b44.setFont(fon1);
            b45.setFont(fon1);
            b46.setFont(fon1);
            b47.setFont(fon1);
            b48.setFont(fon1);
            b49.setFont(fon1);
            b51.setFont(fon1);
            b53.setFont(fon1);
            b54.setFont(fon1);
            b55.setFont(fon1);
            b56.setFont(fon1);
            b57.setFont(fon1);
            b58.setFont(fon1);
            b59.setFont(fon1);
            b60.setFont(fon1);
            b61.setFont(fon1);
            b62.setFont(fon1);
            b63.setFont(fon1);
            b64.setFont(fon1);
            b65.setFont(fon1);
            b66.setFont(fon1);
            b67.setFont(fon1);
            b68.setFont(fon1);
            b69.setFont(fon1);
            b70.setFont(fon1);
            b71.setFont(fon1);
        }
        if(c1.getSelectedItem().equals("Italics"))
        {
            fon1=new Font("Serif",Font.ITALIC,14);
            b1.setFont(fon1);
            b2.setFont(fon1);
            b3.setFont(fon1);
            b4.setFont(fon1);
            b5.setFont(fon1);
            b6.setFont(fon1);
            b10.setFont(fon1);
            b14.setFont(fon1);
            b15.setFont(fon1);
            b16.setFont(fon1);
            b17.setFont(fon1);
            b18.setFont(fon1);
            b19.setFont(fon1);
            b20.setFont(fon1);
            b21.setFont(fon1);
            b22.setFont(fon1);
            b23.setFont(fon1);
            b24.setFont(fon1);
            b25.setFont(fon1);
            b26.setFont(fon1);
            b27.setFont(fon1);
            b28.setFont(fon1);
            b29.setFont(fon1);
            b30.setFont(fon1);
            b31.setFont(fon1);
            b32.setFont(fon1);
            b33.setFont(fon1);
            b34.setFont(fon1);
            b35.setFont(fon1);
            b36.setFont(fon1);
            b37.setFont(fon1);
            b38.setFont(fon1);
            b39.setFont(fon1);
            b40.setFont(fon1);
            b41.setFont(fon1); 
            b42.setFont(fon1);
            b43.setFont(fon1);
            b44.setFont(fon1);
            b45.setFont(fon1);
            b46.setFont(fon1);
            b47.setFont(fon1);
            b48.setFont(fon1);
            b49.setFont(fon1);
            b51.setFont(fon1);
            b53.setFont(fon1);
            b54.setFont(fon1);
            b55.setFont(fon1);
            b56.setFont(fon1);
            b57.setFont(fon1);
            b58.setFont(fon1);
            b59.setFont(fon1);
            b60.setFont(fon1);
            b61.setFont(fon1);
            b62.setFont(fon1);
            b63.setFont(fon1);
            b64.setFont(fon1);
            b65.setFont(fon1);
            b66.setFont(fon1);
            b67.setFont(fon1);
            b68.setFont(fon1);
            b69.setFont(fon1);
            b70.setFont(fon1);
            b71.setFont(fon1);
        }
        if(c1.getSelectedItem().equals("Plain"))
        {
            fon1=new Font("Serif",Font.PLAIN,14);
            b1.setFont(fon1);
            b2.setFont(fon1);
            b3.setFont(fon1);
            b4.setFont(fon1);
            b5.setFont(fon1);
            b6.setFont(fon1);
            b10.setFont(fon1);
            b14.setFont(fon1);
            b15.setFont(fon1);
            b16.setFont(fon1);
            b17.setFont(fon1);
            b18.setFont(fon1);
            b19.setFont(fon1);
            b20.setFont(fon1);
            b21.setFont(fon1);
            b22.setFont(fon1);
            b23.setFont(fon1);
            b24.setFont(fon1);
            b25.setFont(fon1);
            b26.setFont(fon1);
            b27.setFont(fon1);
            b28.setFont(fon1);
            b29.setFont(fon1);
            b30.setFont(fon1);
            b31.setFont(fon1);
            b32.setFont(fon1);
            b33.setFont(fon1);
            b34.setFont(fon1);
            b35.setFont(fon1);
            b36.setFont(fon1);
            b37.setFont(fon1);
            b38.setFont(fon1);
            b39.setFont(fon1);
            b40.setFont(fon1);
            b41.setFont(fon1); 
            b42.setFont(fon1);
            b43.setFont(fon1);
            b44.setFont(fon1);
            b45.setFont(fon1);
            b46.setFont(fon1);
            b47.setFont(fon1);
            b48.setFont(fon1);
            b49.setFont(fon1);
            b51.setFont(fon1);
            b53.setFont(fon1);
            b54.setFont(fon1);
            b55.setFont(fon1);
            b56.setFont(fon1);
            b57.setFont(fon1);
            b58.setFont(fon1);
            b59.setFont(fon1);
            b60.setFont(fon1);
            b61.setFont(fon1);
            b62.setFont(fon1);
            b63.setFont(fon1);
            b64.setFont(fon1);
            b65.setFont(fon1);
            b66.setFont(fon1);
            b67.setFont(fon1);
            b68.setFont(fon1);
            b69.setFont(fon1);
            b70.setFont(fon1);
            b71.setFont(fon1);
        }
        if(c1.getSelectedItem().equals("Bold & Italics"))
        {
            fon1=new Font("Serif",Font.BOLD|Font.ITALIC,14);
            b1.setFont(fon1);
            b2.setFont(fon1);
            b3.setFont(fon1);
            b4.setFont(fon1);
            b5.setFont(fon1);
            b6.setFont(fon1);
            b10.setFont(fon1);
            b14.setFont(fon1);
            b15.setFont(fon1);
            b16.setFont(fon1);
            b17.setFont(fon1);
            b18.setFont(fon1);
            b19.setFont(fon1);
            b20.setFont(fon1);
            b21.setFont(fon1);
            b22.setFont(fon1);
            b23.setFont(fon1);
            b24.setFont(fon1);
            b25.setFont(fon1);
            b26.setFont(fon1);
            b27.setFont(fon1);
            b28.setFont(fon1);
            b29.setFont(fon1);
            b30.setFont(fon1);
            b31.setFont(fon1);
            b32.setFont(fon1);
            b33.setFont(fon1);
            b34.setFont(fon1);
            b35.setFont(fon1);
            b36.setFont(fon1);
            b37.setFont(fon1);
            b38.setFont(fon1);
            b39.setFont(fon1);
            b40.setFont(fon1);
            b41.setFont(fon1); 
            b42.setFont(fon1);
            b43.setFont(fon1);
            b44.setFont(fon1);
            b45.setFont(fon1);
            b46.setFont(fon1);
            b47.setFont(fon1);
            b48.setFont(fon1);
            b49.setFont(fon1);
            b51.setFont(fon1);
            b53.setFont(fon1);
            b54.setFont(fon1);
            b55.setFont(fon1);
            b56.setFont(fon1);
            b57.setFont(fon1);
            b58.setFont(fon1);
            b59.setFont(fon1);
            b60.setFont(fon1);
            b61.setFont(fon1);
            b62.setFont(fon1);
            b63.setFont(fon1);
            b64.setFont(fon1);
            b65.setFont(fon1);
            b66.setFont(fon1);
            b67.setFont(fon1);
            b68.setFont(fon1);
            b69.setFont(fon1);
            b70.setFont(fon1);
            b71.setFont(fon1);
        }
        if(c2.getSelectedItem().equals("Bold"))
        {
            fon2=new Font("TimesRoman",Font.BOLD,14);
            l1.setFont(fon2);
            l4.setFont(fon2);
            l5.setFont(fon2);
            l6.setFont(fon2);
            l9.setFont(fon2);
            l10.setFont(fon2);
            l11.setFont(fon2);
            l12.setFont(fon2);
            l19.setFont(fon2);
            l20.setFont(fon2);
        }
        if(c2.getSelectedItem().equals("Plain"))
        {
            fon2=new Font("TimesRoman",Font.PLAIN,14);
            l1.setFont(fon2);
            l4.setFont(fon2);
            l5.setFont(fon2);
            l6.setFont(fon2);
            l9.setFont(fon2);
            l10.setFont(fon2);
            l11.setFont(fon2);
            l12.setFont(fon2);
            l19.setFont(fon2);
            l20.setFont(fon2);
        }
        if(c2.getSelectedItem().equals("Italics"))
        {
            fon2=new Font("TimesRoman",Font.ITALIC,14);
            l1.setFont(fon2);
            l4.setFont(fon2);
            l5.setFont(fon2);
            l6.setFont(fon2);
            l9.setFont(fon2);
            l10.setFont(fon2);
            l11.setFont(fon2);
            l12.setFont(fon2);
            l19.setFont(fon2);
            l20.setFont(fon2);
        }
        if(c2.getSelectedItem().equals("Bold & Italics"))
        {
            fon2=new Font("TimesRoman",Font.BOLD|Font.ITALIC,14);
            l1.setFont(fon2);
            l4.setFont(fon2);
            l5.setFont(fon2);
            l6.setFont(fon2);
            l9.setFont(fon2);
            l10.setFont(fon2);
            l11.setFont(fon2);
            l12.setFont(fon2);
            l19.setFont(fon2);
            l20.setFont(fon2);
        }
        if(c3.getSelectedItem().equals("Windows"))
        {
            try
            {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
            }
            catch(Exception e)
            {
            }
        }
        if(c3.getSelectedItem().equals("Motif"))
        {
            try
            {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
            }
            catch(Exception e)
            {
            }
        }
        if(c3.getSelectedItem().equals("Nimbus"))
        {
            try
            {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
            }
            catch(Exception e)
            {
            }
        }
        if(c3.getSelectedItem().equals("Metal"))
        {
            try
            {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(this);
            }
            catch(Exception e)
            {
            }
        }
    }

    public void run()
    {
        try
        {
            int a,b,c;
            do
            {
                a=(int)(Math.random()*255);
                b=(int)(Math.random()*255);
                c=(int)(Math.random()*255);
                co=new Color(a,b,c);
                container.setBackground(co);
                panel1.setBackground(co);
                panel2.setBackground(co);
                panel3.setBackground(co);
                panel4.setBackground(co);
                panel5.setBackground(co);
                t.sleep(0);
            }
            while(x<0);
        }
        catch(Exception e)
        {
        }
        repaint();
        while(true)

        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }
            repaint();
        }
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        d=new GregorianCalendar();
        int hh=d.get(Calendar.HOUR);
        hh%=12;
        int mm=d.get(Calendar.MINUTE);
        int ss=d.get(Calendar.SECOND);

        //g.drawString(hh+":"+mm+":"+ss,110,20);
        ft.setText(hh+":"+mm+":"+ss);
    }

    public void adjustmentValueChanged(AdjustmentEvent ade)
    {
        int r,g,b;
        r=s1.getValue();
        g=s2.getValue();
        b=s3.getValue();
        container.setBackground(new Color(r,g,b));
        panel1.setBackground(new Color(r,g,b));
        panel2.setBackground(new Color(r,g,b));
        panel3.setBackground(new Color(r,g,b));
        panel4.setBackground(new Color(r,g,b));
        panel5.setBackground(new Color(r,g,b));
        repaint();
    }
}