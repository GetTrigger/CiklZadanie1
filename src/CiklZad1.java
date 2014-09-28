/**
 * Created by Devil Trigger S on 28.09.2014.
 */
public class CiklZad1 {
    public static void main(String[] args) {
        int i = 1;
        start:
        while (i < 100) {
            if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println("ABBA");
                i++;
            }
            else { if (i%5==0) {
                System.out.println("A");
                i++;
            } else {
                if (i%7==0){
                    System.out.println("B");
                    i++;
                } else {System.out.println(i);
                    i++;
                }

            }

            }
        }
    }
}
