import java.util.Scanner;
class FartsProject {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number : ");
            int num = scanner.nextInt();
            if(num >= 0){
                System.out.println("the Number is : Positive.");
            }else if(num <= 0){
                System.out.println("the Number is : negative.");
            }else{
                System.out.println("the Number is Zero.");
            }
    }
}
