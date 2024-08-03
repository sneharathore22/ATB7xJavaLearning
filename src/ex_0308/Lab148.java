package ex_0308;

public class Lab148 {
    public static void main(String[] args) {

        //Interview Question
        //find the max salary in the salary array
        int[] salary ={7,10,4,9,13,25,55,4,8,2};
        //infosys -Automation Interview Question
            int max =1;
            int min =salary[0];
            for(int i=0; i< salary.length;i++){
                if(salary[i] > max){
                    max = salary[i];
                }
                if(min > salary[i]);
                    min =salary[i];
            }
            System.out.println(max);
            System.out.println(min);
    }
}
