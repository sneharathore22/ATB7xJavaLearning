package July.ex_30;

public class Lab100 {
    public static void main(String[] args) {
                //JDK > 13              //this program its just for knowledge.
        char code = 'B';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;           //return

            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
    }

    }

