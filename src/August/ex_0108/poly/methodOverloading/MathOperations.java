package August.ex_0108.poly.methodOverloading;

public class MathOperations {

            //Ecapsulation
    private String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name =name;
        }

            int add(int a,int b) {
                return a + b;
            }

            //Method Overloading

    int add (int sneha, int rathore, int shuchi, int vishu){
            return sneha+rathore;
    }

    void add(int a, int b,int c){
            System.out.println("hello");
    }

            double add_double(double a, double b) {
                    return a+b;
                }
            String add(String a, String b){
                return a+b;
            }

            String add(String a,int b){
                    return a+b;
            }

            String add(int b, String a){
                    return a+b;
            }

            }

