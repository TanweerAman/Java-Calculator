import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class app3 extends Applet implements ActionListener
{
TextField t1,t2,t3;
Label l1,l2,l3,l5;
Button b1,b2,m1,m2,m3;
Font f,f1,f2;
Frame fr;
Panel p; 
Color c1=new Color(0,0,204);


public void init()
{
f= new Font("Courier", Font.PLAIN, 30);
f1= new Font("Courier", Font.PLAIN, 30);
f2= new Font("Courier", Font.PLAIN, 50);  
fr=new Frame();
p=new Panel();
l5=new Label("CALCULATOR");
l5.setFont(f2);
l5.setBounds(300,50,1000,40);
fr.add(l5);
fr.setBackground(c1);
p.setBounds(300,110,700,180);



p.setForeground(c1);
p.setSize(600,200);
p.setLayout(new GridLayout(5,3));
t1=new TextField();
t2=new TextField();
t3=new TextField();
t1.setFont(f);
t2.setFont(f);
t3.setFont(f);

l1=new Label("Enter 1st no");
l1.setFont(f2);
l2=new Label("Enter 2nd no");
l2.setFont(f2);
l3=new Label("RESULT");
l3.setFont(f);
b1=new Button("ADD");
m1=new Button("SUB");
m2=new Button("MULT");
m3=new Button("DIV");
b2=new Button("RESET");
b1.setFont(f);
m1.setFont(f);
m2.setFont(f);
b2.setFont(f);
m3.setFont(f);

p.add(l1);
p.add(t1);

p.add(l2);
p.add(t2);

p.add(l3);
p.add(t3);

p.add(b1);
p.add(m1);
p.add(m2);
p.add(m3);
p.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
m1.addActionListener(this);
m2.addActionListener(this);
m3.addActionListener(this);

add(p);
fr.add(p);
fr.setBounds(0,0,1800,1800);
fr.setLayout(null);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent obj)
{
if(obj.getSource()==b1)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a+b;
t3.setText(String.valueOf(c));
}
if(obj.getSource()==m2)
{
int x,y,z;
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x*y;
t3.setText(String.valueOf(z));
}
if(obj.getSource()==m1)
{
int x1,y1,z1;
x1=Integer.parseInt(t1.getText());
y1=Integer.parseInt(t2.getText());
z1=x1-y1;
t3.setText(String.valueOf(z1));
}
if(obj.getSource()==m3)
{
int x2,y2,z2;
x2=Integer.parseInt(t1.getText());
y2=Integer.parseInt(t2.getText());
z2=x2/y2;
t3.setText(String.valueOf(z2));
}


if(obj.getSource()==b2)
{
t1.setText("");
t2.setText("");
t3.setText("");
}
}
}
/*
<html>
<body>
<applet code="app3.class" height="1400" width="1500">
</applet>
</body>
</html>
*/