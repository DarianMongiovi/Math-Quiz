import java.util.Scanner;
class quiz {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double answer, score;
        score = 0;
        System.out.println("What is 7 + 12");
        System.out.print("  Answer = ");
        answer = input.nextDouble();
        if (answer == 19) {
            System.out.println("Correct!");
            score = score + 1;
        }else{
            System.out.println(":(");
        }

        System.out.println();
        System.out.println("What is 31 - 15");
        System.out.print("  Answer = ");
        answer = input.nextDouble();
        if (answer == 16) {
            System.out.println("Correct!");
            score = score + 1;
        }else{
            System.out.println(":(");
        }

        System.out.println();
        System.out.println("What is 5 x 5");
        System.out.print("  Answer = ");
        answer = input.nextDouble();
        if (answer == 25) {
            System.out.println("Correct!");
            score = score + 1;
        }else{
            System.out.println(":(");
        }
        System.out.println();
        System.out.print("Congrats you got ");
        System.out.print(score);
        System.out.print(" of 3 correct!");
        System.out.println();

    }
}
