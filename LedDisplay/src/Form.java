import javax.swing.*;

public class Form extends JFrame {
    int width;
    int height;
    public Form(int width,int height){
        this.width=width;
        this.height=height;
        setSize(width,height);
        setTitle("LED Display");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
