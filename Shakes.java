import java.util.Scanner;

public class Shakes {
    
   public static int Shake(int people){
    
       
     if(people>2) 
         return Shake(people - 1) + (people - 1);
       else if(people == 2)
        return 1;         
    return 0;
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are in the room?"); 
        int s = input.nextInt();
        System.out.println(Shake(s)+" shakes.");
    }
    
    
}