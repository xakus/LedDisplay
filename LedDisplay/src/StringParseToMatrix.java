public class StringParseToMatrix{
        private String str           = "";
        private int    wordPixelSize = 0;
        private int ledCountToHeight;
        private int[][] matrix;
        
        public StringParseToMatrix(String str, int count){
                this.str = str;
                this.str = this.str.toUpperCase();// balaca yazilari boyuk edir
                ledCountToHeight=count;
                for (int i = 0; i < str.length(); i++){
                        wordPixelSize += Fonts.getFont(this.str.charAt(i))[0].length;
                }
                matrix=new int[ledCountToHeight][wordPixelSize+1];
                parseMatrix();
        }
        
        private void parseMatrix(){
                int tempWordSize=0;
                for (int i = 0; i < str.length(); i++){
                        int[][] font=Fonts.getFont(str.charAt(i)) ;
                        for(int x=tempWordSize;x<font[0].length+tempWordSize;x++){
                                for (int y=0;y<font.length;y++){
                                        matrix[y][x]=font[y][x-tempWordSize];
                                }
                        }
        
                        tempWordSize += Fonts.getFont(str.charAt(i))[0].length;
                        
                }
        }
        public int[][] getMatrix(){
                return matrix;
        }
}
