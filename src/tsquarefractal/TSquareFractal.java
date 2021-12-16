/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tsquarefractal;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author mac
 */
public class TSquareFractal extends JFrame {
    
    private static final int WINDOW_WIDTH = 512;
    private static final int WINDOW_HEIGHT = 512;
    private static final String WINDOW_TITLE = "Window";
    private static final ImageIcon img = new ImageIcon("src/thumb.png");
    
    public TSquareFractal() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle(WINDOW_TITLE);
        this.setIconImage(img.getImage());
        
        this.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TSquareFractal t = new TSquareFractal();
        
        Container pane = t.getContentPane();
        
        pane.add(new TSquareFractalPanel());
        
    }
    
}
