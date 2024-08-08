package August.ex_0108.ex_0308;

public class Lab151 {
    public static void main(String[] args) {

        int [][]array_2d ={
                {66,55},
                {25,35},
                {89,35}

        };

        int row = array_2d.length;
        for(int i =0; i<row; i++){
            for (int j =0; j< array_2d[i].length;j++){
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }

            System.out.println("");
        }
    }
}
