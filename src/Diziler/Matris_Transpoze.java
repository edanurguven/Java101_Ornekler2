package Diziler;

public class Matris_Transpoze {
    public static void main(String[] args) {
        int[][] matris={
                {2,3,4},
                {5,6,4}
        };
        int columns=matris[0].length;
        int row= matris.length;
        int[][] transpoze=new int[columns][row];

        for(int k=0 ; k <row ; ++k){
            for(int j=0;j<columns ;++j){
                transpoze[j][k]=matris[k][j];
            }
        }
        System.out.println("Matris :");
        for(int i=0;i<row;++i){
            for(int r=0 ; r<columns ; ++r){
                System.out.print(matris[i][r]+"  ");
            }
            System.out.println();
        }

        System.out.println("Transpoze");
        for(int i=0;i<transpoze.length;i++){
            for(int r=0 ; r<transpoze[0].length ; r++){
                System.out.print(transpoze[i][r]+"  ");
            }
            System.out.println();
        }
    }
}
