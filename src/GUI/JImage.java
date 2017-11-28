package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author lamon
 */
public class JImage extends JComponent{
    // something to store the picture
    private BufferedImage image;
    
    @Override
    public void paintComponent(Graphics g){
       // there is an image to draw
       if(image != null){
           // draw the images
           g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
       } 
    }
    
    public void setImage(BufferedImage img){
        // store the image
        this.image = img;
        // repaint to draw
        repaint();
    }
    
}
