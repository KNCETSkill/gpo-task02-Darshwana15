
import java.util.Scanner;

public class AttendanceStatusEvaluator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Attendance = sc.nextInt();
        if(Attendance > 0){
        if (Attendance < 60 )
        {
            System.out.println("Poor");
        }
        else if( Attendance >= 60 && Attendance <= 85)
        {
            System.out.println("Satisfactory");
        }
        else {
            System.out.println ("Excellent");
        }
        }
    
        sc.close();
    }
}
