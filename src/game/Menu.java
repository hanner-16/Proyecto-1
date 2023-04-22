
package game;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;


public class Menu extends JFrame
{
    
  public JPanel panelP,panelS,panelI;
  private JLabel  titulo_juego;
  public JButton PlayNow,Opcionesx;
  private JMenuBar menuBar;
  private JMenu menu;
  private JMenuItem menuX,menuY,menuZ;

   
   
    public void elementos()
    {
  
      panelP = new JPanel(new BorderLayout());
      panelP.setBounds(0,0,550,538);
      
      
      panelS = new JPanel(new BorderLayout());
      panelS.setBounds(150,100,260,220);
      panelS.setOpaque(false);
      
      
      panelI = new JPanel(new GridLayout(2,1));
      panelI.setBounds(150,260,260,160);
      panelI.setOpaque(false);
      
      titulo_juego = new JLabel();
      titulo_juego.setText("<html> <center> Fuga de Letras</center> <html>");
      titulo_juego.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
      titulo_juego.setForeground(Color.BLACK.darker());
      
      
      manejoEventos x = new manejoEventos();
      
      PlayNow = new JButton (new ImageIcon("src/imagenes/Boton.png"));
      PlayNow.setContentAreaFilled(false);
      PlayNow.setOpaque(false);
      PlayNow.setBorder(null);
      PlayNow.setBounds(0,0,50,60);
      PlayNow.addActionListener(x);
      
      
      final  JToolBar  metodo = new JToolBar();
      JPopupMenu opciones = new JPopupMenu();
            
             opciones.add(new JMenuItem(new AbstractAction("COMO JUGAR ") 
             {
                 @Override
                 public void actionPerformed(ActionEvent e) 
                 {
                     
                  JOptionPane.showMessageDialog(panelI, "Dependeiendo del modo elegido apareceran una serie de palabras las cuales deberes completar eligiendo la letra que corresponde a la palabra faltante la cual de ser correta sumara punto o de lo contrario restara");
                 
                 }
             }));
             
             opciones.add(new JMenuItem(new AbstractAction("PARA QUE SIRVE ") 
             {
                 @Override
                 public void actionPerformed(ActionEvent e) 
                 {
                     
                  JOptionPane.showMessageDialog(panelI, "El juego tiene la misión de ayudar a los niños aprender a escribir de manera correta mediante el entretenimiento");
                 
                 }
             }));  
             
            opciones.add(new JMenuItem(new AbstractAction("AUTORES DE ESTA VERSION ")
            {
                 @Override
                 public void actionPerformed(ActionEvent e)
                 {
                     
                  JOptionPane.showMessageDialog(panelI, "Hanner Fernando Sinisterra y Daniel Esteban Gallego");
                 
                 }
            }));  
            
      Opcionesx = new JButton(new ImageIcon("src/imagenes/Boton2.png"));
      Opcionesx.setOpaque(false);
      Opcionesx.setBorder(null);
      Opcionesx.setContentAreaFilled(false);   
      Opcionesx.addMouseListener(new MouseAdapter()
      
       {
          public void mousePressed(MouseEvent e)
          {
              
            opciones.show(e.getComponent(),e.getX(),e.getY());  
                   
          }
       });
    
       
      metodo.add(Opcionesx); 
      panelP.add(panelS,BorderLayout.CENTER);
      panelP.add(panelI,BorderLayout.CENTER);
      panelS.add(titulo_juego,BorderLayout.NORTH);
      panelI.add(PlayNow,BorderLayout.CENTER);
      panelI.add(Opcionesx,BorderLayout.CENTER);
      
    }
    
    
    public Menu()
    {    
        elementos();
        setTitle("Fuga de Letras");
        setSize(553,576);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        panelP.add(new fondo());
        this.getContentPane().add(panelP);
    }
    
    
    public class  fondo extends JPanel
    {
       @Override
       public void paint(Graphics g){
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Fondo.png"));
       g.drawImage(imagen.getImage(),0,0, getHeight(), getWidth(),this);
       setOpaque(false);
       super.paint(g);
        }
    }
    
    
    class  manejoEventos implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            
              setVisible(false);
              JuegoLetras y =new JuegoLetras();
        
        }
    
    } 
    
}