import java.util.Scanner;
public class VotingEligibilityChecker {
    public static void main(String[] args) {
        int age;
        String nationality = new String();
        Scanner inp = new Scanner(System.in);
        age=inp.nextInt();
        nationality=inp.next();
        if(age>=18 && nationality.equals("Indian"))
        {
            System.out.println("Can vote");
        }
        else{
              System.out.println("Can't vote");
        }
    }
	
}
