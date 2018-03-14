public  class Fonts {
    public static int[][] getFont(char c){
        switch (c){
            case 'A': return get_A();
            case 'B': return get_B();
        }
        return get_Space();
    }

    private static int[][] get_B(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][1]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][1]=1;
        a[9][2]=1;
        a[6][2]=1;
        a[4][2]=1;
        a[9][3]=1;
        a[6][3]=1;
        a[4][3]=1;
        a[8][4]=1;
        a[7][4]=1;
        a[5][4]=1;
        return a;
    }
    private static int[][] get_A(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[8][1]=1;
        a[9][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[5][4]=1;
        a[6][4]=1;
        a[7][4]=1;
        a[8][4]=1;
        a[9][4]=1;
        a[7][2]=1;
        a[4][2]=1;
        a[7][3]=1;
        a[4][3]=1;
        return a;
    }
    private static int[][] get_Space(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }

        return a;
    }
}
