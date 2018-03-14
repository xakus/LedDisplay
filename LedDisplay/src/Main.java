public class Main {

    Form form;
    Display display;
    int width=1200;
    int endPixselDisplay;
    int[][] ledDisp=new int[60][10];
    int height;
    public Main(){
        setFont('A');
        endPixselDisplay=(width/ledDisp.length)*ledDisp[0].length;
        height=endPixselDisplay+120;
        form=new Form(width,height);
        display=new Display(ledDisp,width,height);
        form.add(display);
        form.setVisible(true);
    }


    public static void main(String[] args) {
        new Main();
    }
    private void setFont(char c){
        for (int i=0;i<ledDisp.length;i++){
            for(int j=0;j<ledDisp[0].length;j++) {
                if(Fonts.getFont(c)[0].length-1>=i && Fonts.getFont(c).length-1>=j) {
                    ledDisp[i][j] =Fonts.getFont(c)[j][i];
                }else {
                    ledDisp[i][j]=0;
                }
            }
            }
    }
}
