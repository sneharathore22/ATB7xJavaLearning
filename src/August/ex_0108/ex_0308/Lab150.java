package August.ex_0108.ex_0308;

public class Lab150 {
    public static void main(String[] args) {

        int[][] array_2d = {
                {34, 12, 88},
                {34, 12, 34},
                {11, 23, 98}
        };


        //R - 3 -i -> 0 to 2
        //C - 3 -j -> 0 to 2

        for (int i = 0; i < array_2d.length; i++) {

            //     int j = 0;
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.println(array_2d[i][j]);

            }
        }
    }
}
