/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tsquarefractal;

import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public class TSquareFractalPanel extends JPanel {
    
    private static final int DEPTH = 8;
    private Color[] colors;
    
    public TSquareFractalPanel() {
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int w = this.getWidth();
        int h = this.getHeight();
        
        Graphics2D g2d = (Graphics2D) g;
        
        this.colors = new Color[DEPTH];
        
        for (int i = 0; i < this.colors.length; i++) {
            int red = 255 - (int) ((float) i / (float) DEPTH * 255);
            int green = 255 - (int) ((float) i / (float) DEPTH * 255);
            int blue = 255;
            this.colors[i] = new Color(red, green, blue);
        }
        
        drawSquares(g2d, w/2, h/2, w/2, DEPTH);
    }
    
    public int drawSquares(Graphics2D g2d, double centerX, double centerY, double scale, int depth) {
        if (depth == 0) {
            return 0;
        }
        int d = depth - 1;
        
        double nwX = centerX - scale/2;
        double nwY = centerY - scale/2;
        
        double neX = centerX + scale/2;
        double neY = centerY - scale/2;
        
        double seX = centerX + scale/2;
        double seY = centerY + scale/2;
        
        double swX = centerX - scale/2;
        double swY = centerY + scale/2;

        drawSquares(g2d, nwX, nwY, scale/2, d);
        drawSquares(g2d, neX, neY, scale/2, d);
        drawSquares(g2d, seX, seY, scale/2, d);
        drawSquares(g2d, swX, swY, scale/2, d);
        
        g2d.setColor(this.colors[depth-1]);
        g2d.fill(new Rectangle2D.Double(nwX, nwY, scale, scale));
        
        return 0;
    }
}
