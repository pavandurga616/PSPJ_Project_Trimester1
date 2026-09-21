import java.util.Scanner;

public class MainHospitalTriageSystem 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter patient age: ");

        int age = sc.nextInt();

        System.out.print("Enter heart rate: ");
        int heartRate = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter emergency level (1-Critical, 2-Urgent, 3-Non-Urgent): ");
        int level = sc.nextInt();

        System.out.println("\n--- Hospital Triage Report ---");
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Heart Rate: " + heartRate);
        System.out.println("Temperature: " + temperature);

        if (level == 1) {
            System.out.println("Priority: CRITICAL");
            System.out.println("Action: Immediate medical attention required.");
        } 
        else if (level == 2) {
            System.out.println("Priority: URGENT");
            System.out.println("Action: Patient should be attended soon.");
        } 
        else if (level == 3) {
            System.out.println("Priority: NON-URGENT");
            System.out.println("Action: Patient can wait for routine consultation.");
        } 
        else {
            System.out.println("Invalid emergency level.");
        }

        sc.close();
    }
}
