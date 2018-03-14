import javafx.scene.shape.Circle;

import javax.swing.*;
import javax.swing.text.Element;
import javax.swing.text.PlainView;
import java.awt.*;
import java.awt.geom.*;

public class Display extends JPanel {

    int[][] ledDisp;
    int width;
    int height;
    int sWidth,sHeight;
    private Ellipse2D ellipse2D;

    public Display(int[][] ledDisp,int witdh,int height) {
      this.width=witdh;
      this.height=height;
      this.ledDisp=ledDisp;
      sWidth=width/ledDisp.length;
      sHeight=height/ledDisp[0].length;

    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        for (int i=0;i<ledDisp.length;i++){
            for(int j=0;j<ledDisp[0].length;j++){
                Line2D lin = new Line2D.Float((i+1)*sWidth, 0, (i+1)*sWidth, sWidth*ledDisp[0].length);
                Line2D lin2 = new Line2D.Float(0, (j+1)*sWidth, width, (j+1)*sWidth);
                if(ledDisp[i][j]==1) {
                    onLed(i, j, 2, true, g);
                }else{
                    onLed(i, j, 2, false, g);
                }

                g2.setColor(Color.black);
                g2.draw(lin);
                g2.draw(lin2);

                repaint();

            }
        }

    }

    private Ellipse2D onLed(int x,int y,int size,boolean f,Graphics g){
        if(f){
        g.setColor(new Color(255,0,0));}
        else {
            g.setColor(new Color(245,210,210));
        }
        //Ellipse2D ellipse2D =new Ellipse2D.Float(((x-1)*sWidth)+size,((y-1)*sWidth)+size,sWidth-size*2,sWidth-size*2);
        g.fillOval(((x)*sWidth)+size,((y)*sWidth)+size,sWidth-size*2,sWidth-size*2);

        return ellipse2D;
    }


}
