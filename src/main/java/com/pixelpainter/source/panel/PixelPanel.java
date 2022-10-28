package com.pixelpainter.source.panel;

import java.awt.*;

public class PixelPanel {

     private Color backgroundColor;
 
     // Adding randoms, border and preferred size
     public PixelPanel() {
         // Adding random colors, black lineBorder, and preferred size
         this.backgroundColor = new Color((int)(Math.random() * 0x1000000));
     }

     PixelPanel pixelPanel = new PixelPanel();
 
     // Get for Background
     public Color getBackgroundColor() {
         return backgroundColor;
     }
 
     // Set for Background
     public void setBackgroundColor(Color backgroundColor) {
         this.backgroundColor = backgroundColor;
     }
}
