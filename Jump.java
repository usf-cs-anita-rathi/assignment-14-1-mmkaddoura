import java.util.Scanner;
import java.util.Arrays;

public class Jump {

    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println("How many columns?");
      int l = input.nextInt();
      int[] game = new int[l];
      game[0] = 0;
      	
      for (int i = 1; i < l; i++){
      		System.out.print("Enter entry number " );
      		System.out.println(i + 1);
          game[i] = input.nextInt();
      }
      	
      		System.out.println(Arrays.toString(game) );
          System.out.print("The cheapest cost is: ");
      		System.out.println(cheapWay(game,0) );
      	
    
    
    
    	
    }
    
    public static int cheapWay(int[] game, int n)
    {
    	if(game.length - 1  == n)
    		return game[n];
    	
    	else if(game.length - 2 == n)    	
    			return game[0] + game[game.length - 1];
    		
		else if(cheapWay(game, n + 1) < cheapWay(game, n + 2))
    		return game[n] + cheapWay(game, n + 1);
    		
    	else
    		return game[n] + cheapWay(game, n + 2);	

    		 	
     }
    	
    	
    }
