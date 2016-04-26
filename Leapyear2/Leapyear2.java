// to compile, type "javac Leapyear.java" // to run, type "java Leapyear" // from video: 
https://www.youtube.com/watch?v=TO2WMzUCAEw // gpcorser@cs116:~/workspace/.c9/src import 
java.io.*; import java.io.FileNotFoundException; import java.io.PrintWriter; // 
========== Print Leapyear Statement ========================================= public 
class Leapyear {
	
		public static void main(String [] args) {
			
        // ----- initialize output file ----------------------------------------
        String outFile = "output.txt";
        PrintWriter writer = null;
        try {
        	writer = new PrintWriter(outFile);
        } catch (FileNotFoundException e) {
        	e.printStackTrace();
        }
        
        // ----- read input file -----------------------------------------------
        // from: http://stackoverflow.com/questions/2788080/reading-a-text-file-in-java
        String string="";
        String file ="input.data";
        try{
            InputStream ips=new FileInputStream(file);
            InputStreamReader ipsr=new InputStreamReader(ips);
            BufferedReader br=new BufferedReader(ipsr);
            String line;
            while ((line=br.readLine())!=null){
                // System.out.println(line);
                // string+=line+"\n";
                string+=line;
                break;
            }
            br.close();
        }       
        catch (Exception e){
            // System.out.println(e.toString());
            string = string;
        }
        
        // ----- initialize variables ------------------------------------------
        int year = 0;
        boolean leapyear = false; // set leapyear to FALSE
		    try
		    {
		      // the String to int conversion happens here
		      year = Integer.parseInt(string.trim());
		
		      // print out the value after the conversion
		      // System.out.println("int i = " + i);
		    }
		    catch (NumberFormatException nfe)
		    {
		      // System.out.println("NumberFormatException: " + nfe.getMessage());
		      string = string;
		    }
        
        // ----- perform computations ------------------------------------------
        if (year % 4 == 0) { // If year divisible by 4, set leapyear = TRUE.
            leapyear = true;
        }
        if (year % 100 == 0) {	// If year divisible by 100, set leapyear = FALSE.
            leapyear = false;
        }
        if (year % 400 == 0) {	// If year divisible by 400, set leapyear = TRUE.
            leapyear = true;
        }
        
        // ----- print output --------------------------------------------------
        if (leapyear == true) { // If leapyear == TRUE, print: "year is a leapyear"
            writer.println(year + " is a leapyear");
        }
        else { // Else print: "year is not a leapyear"
            leapyear = false;
            writer.println(year + " is not a leapyear");
        }
        
        // ----- close output file ---------------------------------------------
        writer.close();
    }
}
