package Img;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Imagen extends javax.swing.JPanel{
    
    String Ruta;
    
    public Imagen(int x, int y, String Ruta){
        this.setSize(x,y);
        this.Ruta=Ruta;
    }
    
    public void paint(Graphics g){
        Dimension heigth = getSize();
        Image img = new ImageIcon(Ruta).getImage();
        g.drawImage(img,0, 0, heigth.width,heigth.height,null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
