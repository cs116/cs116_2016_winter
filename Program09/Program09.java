import java.util.Scanner;
public class Program09 {

    /**
     * precondition: none
     * postcondition: start time, end time and elapsed time are displayed
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bullshit = sc.nextInt();
        
        int [] array = new int[100000];
        for(int i = 0; i < 100000; i++){
            array[i] = (int) (100000 * Math.random());
        }
        
        // declare and create a StopWatch object
        StopWatch sw = new StopWatch();
       
        sw.start();
        
        SelectionSort(array);
        
        sw.stop();
        
        System.out.println(sw.getStartTime());
        System.out.println(sw.getStopTime());
        System.out.println(sw.getElapsedTime());
    }
    
    public static void SelectionSort ( int [ ] num )
    {
         int i, j, first, temp;  
         for ( i = num.length - 1; i > 0; i--)  
         {
              first = 0;   //initialize to subscript of first element
              for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
              {
                   if( num[ j ] < num[ first ] )         
                     first = j;
              }
              temp = num[ first ];   //swap smallest found with element in position i.
              num[ first ] = num[ i ];
              num[ i ] = temp; 
          }           
    }
    
}

class StopWatch {

    private static long startTime;
    private static long stopTime;
    
    StopWatch () {
        startTime = System.currentTimeMillis();
    }
    
    // return start time
    public static long getStartTime (){
        return startTime;
    }
    
    public static long getStopTime (){
        return stopTime;
    }
    
    // set start time to current time
    // precondition: none
    // postcondition: data field startTime contains the current time
    public static void start (){
        startTime = System.currentTimeMillis();
    }    
    
    public static void stop (){
        stopTime = System.currentTimeMillis();
    }   
    
    public static long getElapsedTime(){
        return stopTime - startTime;
    }
}
