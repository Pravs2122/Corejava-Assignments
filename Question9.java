import java.util.Arrays;
import java.util.Scanner;

public class Question9 {

    Scanner sc = new Scanner(System.in);
    int marksArrayA[] = new int[3];
    int marksArrayB[] = new int[3];
    int marksArrayC[] = new int[3];

    public static void main(String args[]) {
        Question9 question9 = new Question9();
        question9.getDisMarks();
        question9.displayMarks();
    }

    private void displayMarks() {
        int sumA = Arrays.stream(marksArrayA).sum();
        System.out.println("Sum of Subject A :" + sumA);
        System.out.println("Average of Subject A :" + sumA / marksArrayA.length);

        int sumB = Arrays.stream(marksArrayB).sum();
        System.out.println("Sum of Subject B :" + sumB);
        System.out.println("Average of Subject B :" + sumB / marksArrayA.length);

        int sumC = Arrays.stream(marksArrayC).sum();
        System.out.println("Sum of Subject C :" + sumC);
        System.out.println("Average of Subject C :" + sumC / marksArrayA.length);

        int Total = sumA + sumB + sumC;
        System.out.println("Total :" + Total);
        System.out.println("Average :" + Total / (marksArrayA.length + marksArrayB.length + marksArrayC.length));
    }

    public void getDisMarks() {
        int n =1;

        for (int i = 0; i < 3; i++) {

                System.out.println("Please enter the marks of student " + n);
                System.out.println("Enter marks of subject A: ");
                marksArrayA[i] = sc.nextInt();
                System.out.print("Enter marks of subject B: ");
                marksArrayB[i] = sc.nextInt();
                System.out.print("Enter marks of subject C: ");
                marksArrayC[i] = sc.nextInt();
                n++;

        }
    }
}
