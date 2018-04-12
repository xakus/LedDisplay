public  class Fonts {
    public static int[][] getFont(char c){
        switch (c){
            case 'A': return get_A();
            case 'B': return get_B();
            case 'C': return get_C();
            case 'D': return get_D();
            case 'E': return get_E();
            case 'F': return get_F();
            case 'G': return get_G();
            case 'H': return get_H();
            case 'I': return get_I();
            case 'İ': return get_İ();
            case 'J': return get_J();
            case 'K': return get_K();
            case 'L': return get_L();
            case 'M': return get_M();
            case 'N': return get_N();
            case 'O': return get_O();
            case 'P': return get_P();
            case 'Q': return get_Q();
            case 'R': return get_R();
            case 'S': return get_S();
            case 'T': return get_T();
            case 'U': return get_U();
            case 'Ü': return get_Ü();
            case 'V': return get_V();
            case 'Y': return get_Y();
            case 'X': return get_X();
            case 'Z': return get_Z();
            case 'Ə': return get_Ə();
            case 'Ş': return get_Ş();
            case 'Ç': return get_Ç();
            case 'Ö': return get_Ö();
            case 'Ğ': return get_Ğ();
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
    
    private static int[][] get_C(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][2]=1;
        a[9][3]=1;
        a[8][4]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][2]=1;
        a[4][3]=1;
        a[5][4]=1;
        return a;
    }
    
    private static int[][] get_Ç(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        
        a[9][3]=1;
        a[7][4]=1;
        a[8][2]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][2]=1;
        a[4][3]=1;
        a[5][4]=1;
        a[8][3]=1;
        return a;
    }
    
    private static int[][] get_D(){
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
        a[4][2]=1;
        a[4][3]=1;
        a[5][4]=1;
        a[6][4]=1;
        a[7][4]=1;
        a[8][4]=1;
        a[9][3]=1;
        a[9][2]=1;
        return a;
    }
    
    private static int[][] get_E(){
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
        a[4][2]=1;
        a[4][3]=1;
        a[4][4]=1;
        a[6][4]=1;
        a[6][3]=1;
        a[6][2]=1;
        a[9][2]=1;
        a[9][3]=1;
        a[9][4]=1;
        return a;
    }
    
    private static int[][] get_F(){
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
        a[4][2]=1;
        a[4][3]=1;
        a[4][4]=1;
        a[6][4]=1;
        a[6][3]=1;
        a[6][2]=1;
        
        return a;
    }
    
    
    private static int[][] get_G(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][2]=1;
        a[9][3]=1;
        a[8][4]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][2]=1;
        a[4][3]=1;
        a[5][4]=1;
        a[7][4]=1;
        a[7][3]=1;
        
        return a;
    }
    
    
    private static int[][] get_Ğ(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][2]=1;
        a[9][3]=1;
        a[8][4]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][2]=1;
        a[4][3]=1;
        a[2][3]=1;
        a[2][2]=1;
        a[5][4]=1;
        a[7][4]=1;
        a[7][3]=1;
        
        return a;
    }
    
    private static int[][] get_H(){
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
        a[4][4]=1;
        a[5][4]=1;
        a[6][4]=1;
        a[7][4]=1;
        a[8][4]=1;
        a[9][4]=1;
        a[6][3]=1;
        a[6][2]=1;
        return a;
    }
    
    private static int[][] get_I(){
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
        return a;
    }
    
    private static int[][] get_İ(){
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
        a[3][1]=1;
        return a;
    }
    
    private static int[][] get_J(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[8][1]=1;
        a[9][2]=1;
        a[9][3]=1;
        a[8][4]=1;
        a[7][4]=1;
        a[6][4]=1;
        a[5][4]=1;
        a[4][4]=1;
        a[4][3]=1;
        a[4][2]=1;
        return a;
    }
    
    private static int[][] get_K(){
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
        a[7][2]=1;
        a[8][3]=1;
        a[9][4]=1;
        a[6][2]=1;
        a[5][3]=1;
        a[4][4]=1;
        return a;
    }
    
    
    private static int[][] get_L(){
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
        a[9][3]=1;
        a[9][4]=1;
        return a;
    }
    
    
    private static int[][] get_M(){
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
        a[5][2]=1;
        a[6][3]=1;
        a[5][4]=1;
        a[4][5]=1;
        a[5][5]=1;
        a[6][5]=1;
        a[7][5]=1;
        a[8][5]=1;
        a[9][5]=1;
        return a;
    }
    
    private static int[][] get_N(){
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
        a[6][2]=1;
        a[7][3]=1;
        a[8][4]=1;
        a[9][5]=1;
        a[8][5]=1;
        a[7][5]=1;
        a[6][5]=1;
        a[5][5]=1;
        a[4][5]=1;
        return a;
    }
    
    private static int[][] get_O(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][2]=1;
        a[9][3]=1;
        a[8][4]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][2]=1;
        a[4][3]=1;
        a[5][4]=1;
        a[7][4]=1;
        a[6][4]=1;
        return a;
    }
    
    
    
    private static int[][] get_Ö(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][2]=1;
        a[9][3]=1;
        a[8][4]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][2]=1;
        a[4][3]=1;
        a[2][4]=1;
        a[2][1]=1;
        a[5][4]=1;
        a[7][4]=1;
        a[6][4]=1;
        return a;
    }
    
    
    
    private static int[][] get_P(){
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
        a[6][2]=1;
        a[4][2]=1;
        a[6][3]=1;
        a[4][3]=1;
        a[5][4]=1;
        return a;
    }
    
    
    
    private static int[][] get_Q(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][2]=1;
        a[9][3]=1;
        a[8][4]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][2]=1;
        a[4][3]=1;
        a[5][4]=1;
        a[7][4]=1;
        a[6][4]=1;
        a[9][4]=1;
        a[8][3]=1;
        return a;
    }
    
    
    private static int[][] get_R(){
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
        a[6][2]=1;
        a[4][2]=1;
        a[6][3]=1;
        a[4][3]=1;
        a[5][4]=1;
        a[7][2]=1;
        a[8][3]=1;
        a[9][4]=1;
        
        return a;
    }
    
    
    private static int[][] get_S(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[8][1]=1;
        a[5][1]=1;
        a[9][2]=1;
        a[6][2]=1;
        a[4][2]=1;
        a[9][3]=1;
        a[7][3]=1;
        a[4][3]=1;
        a[8][4]=1;
        a[5][4]=1;
        return a;
    }
    
    
    private static int[][] get_Ş(){
        int[][] a=new int[11][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[8][1]=1;
        a[9][1]=1;
        a[5][1]=1;
        a[9][2]=1;
        a[6][2]=1;
        a[4][2]=1;
        a[9][3]=1;
        a[10][3]=1;
        a[7][3]=1;
        a[4][3]=1;
        a[8][4]=1;
        a[5][4]=1;
        return a;
    }
    
    
    
    private static int[][] get_T(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][3]=1;
        a[8][3]=1;
        a[7][3]=1;
        a[6][3]=1;
        a[5][3]=1;
        a[4][3]=1;
        a[4][2]=1;
        a[4][1]=1;
        a[4][4]=1;
        a[4][5]=1;
        return a;
    }
    
    
    private static int[][] get_Ü(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][2]=1;
        a[9][3]=1;
        a[8][4]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[4][1]=1;
        a[4][4]=1;
        a[7][4]=1;
        a[6][4]=1;
        return a;
    }
    
    
    
    private static int[][] get_U(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][2]=1;
        a[9][3]=1;
        a[8][4]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][1]=1;
        a[4][4]=1;
        a[5][4]=1;
        a[7][4]=1;
        a[6][4]=1;
        return a;
    }
    
    private static int[][] get_V(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][3]=1;
        a[8][2]=1;
        a[7][1]=1;
        a[6][1]=1;
        a[5][1]=1;
        a[4][1]=1;
        a[8][4]=1;
        a[7][5]=1;
        a[6][5]=1;
        a[5][5]=1;
        a[4][5]=1;
        return a;
    }
    
    private static int[][] get_Y(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][3]=1;
        a[8][3]=1;
        a[6][3]=1;
        a[5][2]=1;
        a[4][1]=1;
        a[7][3]=1;
        a[5][4]=1;
        a[4][5]=1;
        return a;
    }
    
    
    private static int[][] get_X(){
        int[][] a=new int[10][7];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][2]=1;
        a[8][2]=1;
        a[7][3]=1;
        a[6][3]=1;
        a[5][2]=1;
        a[4][2]=1;
        a[4][5]=1;
        a[5][5]=1;
        a[6][4]=1;
        a[7][4]=1;
        a[8][5]=1;
        a[9][5]=1;
        return a;
    }
    
    
    private static int[][] get_Z(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[9][1]=1;
        a[9][2]=1;
        a[9][3]=1;
        a[9][4]=1;
        a[9][5]=1;
        a[8][2]=1;
        a[7][3]=1;
        a[6][4]=1;
        a[5][5]=1;
        a[4][5]=1;
        a[4][4]=1;
        a[4][3]=1;
        a[4][2]=1;
        a[4][1]=1;
        return a;
    }
    
    
    private static int[][] get_Ə(){
        int[][] a=new int[10][6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=0;
            }
        }
        a[5][1]=1;
        a[4][2]=1;
        a[4][3]=1;
        a[5][4]=1;
        a[6][4]=1;
        a[7][4]=1;
        a[8][4]=1;
        a[9][3]=1;
        a[9][2]=1;
        a[8][1]=1;
        a[7][1]=1;
        a[7][2]=1;
        a[7][3]=1;
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