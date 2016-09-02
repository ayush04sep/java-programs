import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class SwMenu extends JFrame //implements ActionListener
{
JMenuBar mb;
JMenu file,edit,frmt,view,help;
JMenuItem nw,op,sv,svas,exit,cpy,pst,cut,dlt,undo,font,sb,vh,abnp;
//JCheckBoxMenuItem ww;
Container c;
SwMenu()
{
c=getContentPane();
c.setLayout(new BorderLayout());
mb=new JMenuBar();
file=new JMenuBar("File");
edit=new JMenuBar("Edit");
frmt=new JMenuBar("Formate");
view=new JMenuBar("View");
help=new JMenuBar("Help");
//ww=new JCheckBoxMenuItem("Word Wrap");
c.add(nw);
/*file.add(op);
file.add(sv);
file.add(svas);
file.addSeprator();
file.add(exit);
edit.add(cpy);
edit.add(pst);
edit.add(cut);
edit.add(dlt);
edit.add(undo);
frmt.add(ww);
frmt.add(font);
view.add(sb);
help.add(vh);
help.addSeprator();
help.add(abnp);
mb.add(file);
file.setMenomonic(f);
mb.add(edit);
mb.add(view);
mb.add(frmt);
mb.add(help);
c.add("North",mb);
op.ActionListener(this);
}
public void ActionPerformed(ActionEvent ae)
{
if(op.isArmed())
 System.out.println("open clicked");
*/
}
public static void main(String []ar)
{
SwMenu sm=new SwMenu();
sm.setSize(400,400);
sm.setTitle("NOTEPAD");
sm.setVisible(true);
//sm.setBackground(Color.White);
sm.setLocation(300,300);
sm.setResizable(true);
sm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
}
}
