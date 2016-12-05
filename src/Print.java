/**
 * Created by asiar on 01.12.2016.
 */
public class Print {


    protected void spacebar(int height, int currentRow){
        int spaceCount = height - (currentRow+1);
        for(int i =0; i<spaceCount;i++){
            System.out.print(" ");
        }
    }

    protected void stars(int currentRow){
        int starCount = 2*(currentRow+1)-1;
        for(int i =0; i<starCount;i++){
            System.out.print("*");
        }
    }

    protected void printTree(int height){
        for(int currentRow=0; currentRow<height;currentRow++){
            spacebar(height,currentRow);
            stars(currentRow);
            spacebar(height,currentRow);
            System.out.println();
        }

    }
}