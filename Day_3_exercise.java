import java.util.Scanner;

public class Day_3_exercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1.Write a program that checks the role of the user
        System.out.println("****************************************************");
        System.out.print("Enter your role: ");
        String role = scan.nextLine();
        role = role.toLowerCase();
        if (role.equals("admin")){
            System.out.println("welcome admin");
        }
        else if (role.equals("user")){
            System.out.println("welcome user");
        }
        if (role.equals("superuser")){
            System.out.println("welcome superuser");
        }
        else {
            System.out.println("invalid role");
        }
        System.out.println("****************************************************");


        //2.Take three numbers from the user and print the greatest number.
        System.out.println("enter first number: ");
        int a = scan.nextInt();
        System.out.println("enter second number: ");
        int b = scan.nextInt();
        System.out.println("enter third number: ");
        int c = scan.nextInt();
        if (a > b){
            if (a > c){
                System.out.println("first number is the greater");
            }
            else {
                System.out.println("third number is the greater");
            }
        }
        else {
            if (b > c){
                System.out.println("second number is the greater");
            }
            else {
                System.out.println("third number is the greater");
            }
        }
        System.out.println("***************************************************");

        //3.Write a Java program that generates an integer between 1 and 7 and
        //displays the name of the weekday.
        System.out.println("enter a number between 1 - 7: ");
        int num = scan.nextInt();
        switch (num){
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");break;
            case 7: System.out.println("Saturday");break;
            default: System.out.println("invalid number");break;
        }
        System.out.println("***************************************************");


        //4. Write a program that takes a numeric score as input and prints the
        //corresponding letter grade using the following grading scale:
        System.out.println("Enter your score out of 100:");
        int score = scan.nextInt();
        if(score > 100 || score < 0){
            System.out.println("please enter a number between 0 and 100");
        }
        else{
            if(score >= 90){
                System.out.println("A");
            }
            else if(score >=80){
                System.out.println("B");
            }
            else if(score >= 70){
                System.out.println("C");
            }
            else if(score >= 60){
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }
            System.out.println("*******************************************************");

            //5. Write a Java program that takes a person's age as input and
            //categorizes them into one of three age categories: "Child,"
            //"Teenager," or "Adult" using an if statement.
            System.out.println("Enter your age:");
            int age = scan.nextInt();
            if(age < 13){
                System.out.println("child");
            }
            else if(age <= 19){
                System.out.println("teenager");
            }
            else {
                System.out.println("adult");
            }
        }

    }

}
