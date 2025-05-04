import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean shapeCorrect = false;
		int shapeSelect = 0;
		
		// User input of if they have a rectangular or circular opening 
		while(!shapeCorrect){
		    try { 
		        System.out.print("What shape opening would you like to calculate air volume for? Enter 1 for rectangle 2 for circular: ");
		        shapeSelect = input.nextInt();
		        if(shapeSelect == 1) {
		            shapeCorrect = true;
		                }
		        if(shapeSelect == 2) {
		            shapeCorrect = true;
		        }
		    }
		    catch(Exception e) {
		        System.out.println("FOLLOW DIRECTIONS");
		        input.nextLine();
		    }
	    }
	    // Start of rectangular section 
	    // user input of rectangular opening length
	    if(shapeSelect == 1){
	    boolean lengthCorrect = false;
		int sideLength = 0;
		
		while(!lengthCorrect){
		    try { 
		        System.out.print("What is the length of the opening in whole inches: ");
		        sideLength = input.nextInt();
		        lengthCorrect = true;
		    }
		    catch(Exception e) {
		        System.out.println("FOLLOW DIRECTIONS");
		        input.nextLine();
		    }
	    } 
	    //System.out.println(sideLength);
	    // user input of rectangular opening hieght
	    boolean hieghtCorrect = false;
		int sideHeight = 0;
		
		while(!hieghtCorrect){
		    try { 
		        System.out.print("What is the height of the opening in whole inches: ");
		        sideHeight = input.nextInt();
		        hieghtCorrect = true;
		    }
		    catch(Exception e) {
		        System.out.println("FOLLOW DIRECTIONS");
		        input.nextLine();
		    }
	    }
	    //System.out.println(sideHeight);
	    // User input of air speed
	    boolean speedCorrect = false;
		int speedMph = 0;
		
		while(!speedCorrect){
		    try { 
		        System.out.print("What is the air moving threw the opening in MPH using whole numbers: ");
		        speedMph = input.nextInt();
		        speedCorrect = true;
		    }
		    catch(Exception e) {
		        System.out.println("FOLLOW DIRECTIONS");
		        input.nextLine();
		    }
	    }
	    //System.out.println(speedMph);
	    //System.out.println(sideHeight);
	    //System.out.println(sideLength);
	    // Does the calculations and output of rectangular openings
	    float CFM = 0;
	    float FPM = 0;
	    float FPH = 0;
	    float recArea = 0;
	    float recAreaft = 0;
	    
	    recArea = sideLength * sideHeight;
	    recAreaft = recArea / 144;
	    FPH = speedMph * 5280;
	    FPM = FPH / 60;
	    CFM = recAreaft * FPM;
	    	    
	    System.out.print("The airflow for your opening is ");
	    System.out.print(CFM);
	    System.out.print(" CFM");
	    }
	    //start of circular section 
	    // user input of diameter 
	    if(shapeSelect == 2) {
	    boolean diameterCorrect = false;
		int diameterLength = 0;
		
		while(!diameterCorrect){
		    try { 
		        System.out.print("What is the diameter or the opening in whole inches: ");
		        diameterLength = input.nextInt();
		        diameterCorrect = true;
		    }
		    catch(Exception e) {
		        System.out.println("FOLLOW DIRECTIONS");
		        input.nextLine();
		    }
	    }
	    //System.out.println(diameterLength);
	    // User input of air speed
	    boolean speedCorrect = false;
		int speedMph = 0;
		
		while(!speedCorrect){
		    try { 
		        System.out.print("What is the air moving threw the opening in MPH using whole numbers: ");
		        speedMph = input.nextInt();
		        speedCorrect = true;
		    }
		    catch(Exception e) {
		        System.out.println("FOLLOW DIRECTIONS");
		        input.nextLine();
		    }
	    }
	    //System.out.println(speedMph);
	    // Does calculations and output of circular openings 
	    float CFM = 0;
	    float FPM = 0;
	    float FPH = 0;
	    float cirArea = 0;
	    float radius = 0;
	    float radiusSquared = 0;
	    float pie = 3.14f;
	    float cirAreaft = 0;
	    
	    radius = diameterLength / 2;
	    radiusSquared = radius * radius;
	    cirArea = pie * radiusSquared;
	    cirAreaft = cirArea /144;
	    FPM = speedMph * 88;
	    CFM = cirAreaft * FPM;
	    
	    System.out.print("The airflow for your opening is ");
	    System.out.print(CFM);
	    System.out.print(" CFM");
	    }
	    
	    }
    }
