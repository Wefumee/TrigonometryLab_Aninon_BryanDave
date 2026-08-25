/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trigonometrylab;

import static java.lang.Math.*;
import java.util.Scanner;

public class TrigonometryLab {


   
    public static void main(String[] args) {
  
    Scanner input = new Scanner (System.in);
 
 //Problem 1: Trigonometric Function Calculator   
    
    System.out.println("Calculator Running...");
    System.out.println("Please enter an angle in DEGREES:");
    
    double degrees= input.nextDouble();
    
    System.out.println("Select a trigonometric function you wanted to evaluate:");
    System.out.println("1:Sine, 2:Cosine, 3:Tangent, 4:All");
    System.out.println("Please enter your Choice:");
    
    int choice = input.nextInt();
    double Rad = toRadians(degrees);  
    
    if (choice==1 ){
       double answer1= Math.sin(Rad);
       System.out.println("Sin("+degrees+")=" +answer1);
    }
     
    if (choice==2 ){     
       double answer2= Math.cos(Rad);
       System.out.println("Cos("+degrees+")=" +answer2);
    }
     
    if (choice==3){
       double answer3= Math.tan(Rad);
       double cos=Math.cos(Rad);
       
       if (Math.abs(cos)<0.0001) {
       System.out.println("OOPPSS3x! Tangent is very close to being undefined.");
       System.out.println("Remeber: Tangent is undefined at exactly 90 degrees or 270 degrees.");
       }
              else {
              System.out.println("Tan("+degrees+")=" +answer3);} 
    }
       
    if (choice==4){
       double answer04= Math.sin(Rad);
       System.out.println("Sin("+degrees+")=" +answer04);
       
       double answer004= Math.cos(Rad);
       System.out.println("Cos("+degrees+")=" +answer004);
       
       double answer0004= Math.tan(Rad);      
       double cos2=Math.cos(Rad);
       
       if (Math.abs(cos2)<0.0001) {
       System.out.println("OOPPSS3x! Tangent is undefined or very close to being undefined.");
       System.out.println("Remeber: Tangent is undefined at exactly 90 degrees or 270 degrees.");
       }
              else {
              System.out.println("Tan("+degrees+")=" +answer0004 );}         
    }   

    else {
     System.out.println("Invalid input. Please enter a number from 1-4.");
    }
   
 // Critical thinking questions:
    
// 1.  Why do we need to convert angles from degrees to radians?
    //-> We need to convert degrees to radians because Java's trigonometric functions use radians. 
    
// 2. What makes tangent undefined at certain angles?
   //->Tangent becomes undefined when the cosine of an angle is equal to zero. 
   //-> This happens at angles such as 90 degrees and 270 degrees.  
   
// 3. How could you modify this program to also calculate reciprocal functions?
   //-> Since we already know how to get the values of the sin, cos, and tan, we cn just add another formulas for 
   // the other functions such as 1/sin, 1/cos, 1/tan. It is prudent to check the denominator if it is equal to zero 
   // before calculations to ensure that the result is not undefined.
   
   
//Problem 2: Angle Quadrant Locator.  
    
    System.out.println("Welcome to the Angle Quadrant Locator!");
    System.out.println("Plean Enter an angle in DEGREES:");
    
    double deg= input.nextDouble();
    double normalized = ((deg%360+360)%360);   
    
    System.out.println("ORIGINAL ANGLE:" +deg );
    System.out.println("NORMALIZED ANGLE:" +normalized );
    
    if (normalized==0){
    System.out.println("Your angle lies on the postive x-axis.");   
    System.out.println("sin: 0");
    System.out.println("cos: 1, positive");
    System.out.println("tan: 0");}
    
    else if (normalized==90){
    System.out.println("Your angle lies on the postive y-axis.");
    System.out.println("sin: 1, positive");
    System.out.println("cos: 0");
    System.out.println("tan: Undefined");}
   
    else if (normalized==180){
    System.out.println("Your angle lies on the negative x-axis.");
    System.out.println("sin: 0");
    System.out.println("cos: -1, negative ");
    System.out.println("tan: 0");}
   
    else if (normalized==270){
    System.out.println("Your angle lies on the negative y-axis.");
    System.out.println("sin: -1, negative.");
    System.out.println("cos: 0");
    System.out.println("tan: Undefined");}
    
    else if (normalized>0 && normalized <90 ){
    System.out.println("Your angle is located in Quadrant I.");
    System.out.println("sin: Positive");
    System.out.println("cos: Positive");
    System.out.println("tan: Positive");
    }

    else if (normalized>90 && normalized <180 ){
    System.out.println("Your angle is located in Quadrant II.");
    System.out.println("sin: Positive");
    System.out.println("cos: Negative");
    System.out.println("tan: Negative");
    }
    
    else if (normalized>180 && normalized <270 ){
    System.out.println("Your angle is located in Quadrant III.");
    System.out.println("sin: Negative");
    System.out.println("cos: Negative");
    System.out.println("tan: Positive");
    }
    
    else if (normalized>270 && normalized <360 ){
    System.out.println("Your angle is located in Quadrant IV.");
    System.out.println("sin: Negative");
    System.out.println("cos: Positive");
    System.out.println("tan: Negative");
    }
    
  // Critical thinking questions:
    
// 1.  Why is it important to normalize angles before determining their quadrant?
    //-> Normalizing the angles make sure that it is between 0 and 360 degrees. This makes it easier for the program to 
    //  correctly identify the quadrant.
    
// 2. How does the sign of trigonometric functions change across different quadrant?
   //-> Recall the mnemonics "ASTC". Where A means All of the trigonometric functions is positive in quadrant1,  
   // S means that the Sin is positve in  quadrant 2, T means that the Tan is positive in quadrant 3,
   // and C means that the Cosine is positive in quadrant 4.

// 3. What special consideration are needed for angles exactly on the axes?
   //->  Angles like 0 or 360, 90, 180, and 270 degrees are located on the axes, so technically they are not part of any quadrants.
   //  The program should handle these angles seperately because some trigonometric functions may be zero or undefined.
    
    
     
 
//Problem 3: Right Triangle Solver   
    
  System.out.println("WELCOME TO THE RIGHT TRIANGLE PROBLEM SOLVER!");
  System.out.println("Choose a number based on what is given:");
  System.out.println("1: Two sides are given, 2: One side and one angle are given"); 
  System.out.println("Enter your choice:"); 
  
  int option = input.nextInt();   
    
  if (option==1){
          System.out.println("Which sides are given?");
          System.out.println("Press 1: Hypotenuse and Adjacent");
          System.out.println("Press 2: Opposite and Adjacent"); 
          System.out.println("Press 3: Hypotenuse and Opposite");
          System.out.println("Please enter a number from 1-3:"); 
          
          int choice2 = input.nextInt(); 
          
          if (choice2==1){
                  System.out.println("Enter the value of the Hypotenuse:"); 
                  double hypotenuse = input.nextDouble();
                  System.out.println("Enter the value of the Adjacent:"); 
                  double adjacent = input.nextDouble();              
                  double opposite =  Math.sqrt( Math.pow( hypotenuse, 2) - Math.pow( adjacent , 2)  );                      
                  double angleA= Math.toDegrees( Math.asin( opposite /hypotenuse) );
                  double angleB= Math.toDegrees( Math.acos( adjacent /hypotenuse) );
                  double angleC= 90.0;
                  double Area= 0.5*adjacent*opposite;
                   
                   if (hypotenuse <0 ){
                    System.out.println("OOPPSS2x! The length of the sides must be positive."); 
                   }
                          
                   //formula: c^2 = a^2 + b^2
                   else  if (adjacent < 0) {           
                       System.out.println("OOPPSS2x! The length of the sides must be positive.");
              } 
                   else {
                       System.out.println("Opposite=" + Math.sqrt( Math.pow( hypotenuse, 2) - Math.pow( adjacent , 2)  ));
                       System.out.println("Adjacent=" + adjacent );
                       System.out.println("Hypotenuse=" +hypotenuse );
                       
                       System.out.println("AngleA=" +angleA );
                       System.out.println("AngleB=" +angleB );
                       System.out.println("AngleC=" +angleC );
                       
                       System.out.println("Area=" +Area );                      
                       }           
                   }
          
          if (choice2==2) {
                   System.out.println("Enter the value of the Opposite:"); 
                   double opposite = input.nextDouble();
                   System.out.println("Enter the value of the Adjacent:"); 
                   double adjacent = input.nextDouble();
                   double hypotenuse = Math.sqrt( Math.pow( opposite, 2) + Math.pow( adjacent , 2));
                   double angleA= Math.toDegrees( Math.asin( opposite /hypotenuse) );
                   double angleB= Math.toDegrees( Math.acos( adjacent /hypotenuse) );
                   double angleC= 90.0;
                   double Area= 0.5*adjacent*opposite;
                   
                   if (opposite <0 || adjacent < 0 ){
                    System.out.println("OOPPSS2x! The length of the sides must be positive."); 
                    System.out.println("Please try again."); 
                   }
                          
                   //formula: c^2 = a^2 + b^2
                   else
                   {System.out.println("Hypotenuse=" + Math.sqrt( Math.pow( opposite, 2) + Math.pow( adjacent , 2)  ));
                    System.out.println("Adjacent=" + adjacent );
                    System.out.println("Opposite=" + opposite );
                       
                    System.out.println("AngleA=" +angleA );
                    System.out.println("AngleB=" +angleB );
                    System.out.println("AngleC=" +angleC );
                       
                    System.out.println("Area=" +Area );   
                   }
                   }
  
          if (choice2==3){
                   System.out.println("Enter the value of the Hypotenuse:"); 
                   double hypotenuse = input.nextDouble();
                   System.out.println("Enter the value of the Opposite:"); 
                   double opposite = input.nextDouble();
                   double adjacent = Math.sqrt( Math.pow( hypotenuse, 2) - Math.pow( opposite , 2));
                   double angleA= Math.toDegrees( Math.asin( opposite /hypotenuse) );
                   double angleB= Math.toDegrees( Math.acos( adjacent /hypotenuse) );
                   double angleC= 90.0;
                   double Area= 0.5*adjacent*opposite;
                   
                   
                   if (opposite <0 || hypotenuse < 0 ){
                    System.out.println("OOPPSS2x! The length of the sides must be positive."); 
                    System.out.println("Please try again.");
                   }
                          
                   //formula: c^2 = a^2 + b^2
                   else
                   {System.out.println("Adjacent=" + Math.sqrt( Math.pow( hypotenuse, 2) - Math.pow( opposite , 2)  ));
                    System.out.println("Hypotenuse="+ hypotenuse );
                    System.out.println("Opposite=" + opposite );
                       
                    System.out.println("AngleA=" +angleA );
                    System.out.println("AngleB=" +angleB );
                    System.out.println("AngleC=" +angleC );
                       
                    System.out.println("Area=" +Area );
                   }
                   }       
         }  
  
  
    
  else if (option==2) { 
      System.out.println("Which side is given?");
      System.out.println("1: Hypotenuse, 2:Adjacent, 3:Opposite");
      System.out.println("Enter your choice:");    
      int Choiceside= input.nextInt();
      
      System.out.println("Enter the length of the side:");
      double sidelength = input.nextDouble();
      
      System.out.println("Enter the given in angle in degrees (<90 degrees): ");
      double Choiceangle= input.nextDouble();
      
      if (Choiceside==1){
         double anglerad = Math.toRadians(Choiceangle);
         double hypotenuse = sidelength;
         double opposite = hypotenuse*Math.sin(anglerad);  
         double adjacent = Math.sqrt( Math.pow( hypotenuse, 2) - Math.pow( opposite , 2));
         double angleA = Choiceangle;
         double angleB = 90-angleA;
         double angleC = 90.0;
         double Area = 0.5*adjacent*opposite;
          
            if (sidelength<0) {
             System.out.println("ERROR! Side lengths must be POSITIVE. ");
            }  
            else if (Choiceangle>90 || Choiceangle<0){
             System.out.println("ERROR! 0deg <angle <90deg. ");   
            }  
      
            else{
            System.out.println("Hypotenuse=" +sidelength );
            System.out.println("Opposite=" + opposite );  
            System.out.println("Adjacent=" + adjacent ); 
          
            System.out.println("AngleA=" +angleA );
            System.out.println("AngleB=" +angleB );
            System.out.println("AngleC=" +angleC );
                       
            System.out.println("Area=" +Area ); 
            } 
         }
      
      if (Choiceside==2){
         double anglerad = Math.toRadians(Choiceangle);
         double adjacent = sidelength;
         double hypotenuse = adjacent*Math.cos(anglerad);  
         double opposite = Math.sqrt( Math.pow( hypotenuse, 2) - Math.pow( adjacent , 2));
         double angleA = Choiceangle;
         double angleB = 90-angleA;
         double angleC = 90.0;
         double Area = 0.5*adjacent*opposite;
         
            if (sidelength<0 || sidelength> hypotenuse ) {
             System.out.println("ERROR! Side lengths must be POSITIVE. ");
             System.out.println("ERROR! Hypotenuse is the longest side of a right triangle.");
            }  
            else if (Choiceangle>90 || Choiceangle<0){
             System.out.println("ERROR! 0deg <angle <90deg. ");   
            }  
            
            else {
            System.out.println("Hypotenuse=" +hypotenuse );
            System.out.println("Opposite=" + opposite );  
            System.out.println("Adjacent=" + sidelength ); 
          
            System.out.println("AngleA=" +angleA );
            System.out.println("AngleB=" +angleB );
            System.out.println("AngleC=" +angleC );
                       
            System.out.println("Area=" +Area ); 
            }
        }
      
       if (Choiceside==3){
         double anglerad = Math.toRadians(Choiceangle);
         double opposite = sidelength;
         double hypotenuse = opposite/Math.sin(anglerad);  
         double adjacent = Math.sqrt( Math.pow( hypotenuse, 2) - Math.pow( opposite , 2));
         double angleA = Choiceangle;
         double angleB = 90-angleA;
         double angleC = 90.0;
         double Area = 0.5*adjacent*opposite;
         
            if (sidelength<0 || sidelength> hypotenuse ) {
             System.out.println("ERROR! Side lengths must be POSITIVE. ");
             System.out.println("ERROR! Hypotenuse is the longest side of a right triangle.");
            }  
            else if (Choiceangle>90 || Choiceangle<0){
             System.out.println("ERROR! 0deg <angle <90deg. ");   
            }  
            
            else {
            System.out.println("Hypotenuse=" +hypotenuse );
            System.out.println("Opposite=" + sidelength );  
            System.out.println("Adjacent=" + adjacent ); 
          
            System.out.println("AngleA=" +angleA );
            System.out.println("AngleB=" +angleB );
            System.out.println("AngleC=" +angleC );
                       
            System.out.println("Area=" +Area ); 
            }
        }      
            
       else {
          System.out.println("Invalid input. Please try again."); 
           }
       }     
  
   // Critical thinking questions:
    
// 1.  Why must we validate that angles in a right triangle are less than 90 degrees?
    //-> A right triangle already has one angle equal to 90 degrees. Therefore, the other two angles must 
    //  be less than 90 to form a valid right triangle.
    
// 2. How does your program handle diffferent cases of known values?
   //-> The programs uses the user's selected known values to determine which formula and trigonometric functions 
   // should be used. It the calculates the missing sides and angles from two known sides or from one side and one valid 
   // angle.
   
// 3. What would happpen if a user entered values that don't form a valid right triangle?
   //-> The program should recognize that the values entered are invalid and stop the calculations.
   // It should display that the entered values are invalid to inform the user.
  

 // Problem 4: Trigonometric Ideentity Verifier
  
 System.out.println("Input an angle in Degrees:"); 
 double angle = input.nextDouble();
 double rad= Math.toRadians(angle);
 double tolerance = 1e-10;
 double sinx = Math.sin(rad);
 double cosx = Math.cos(rad);
 
 double left = Math.pow(sinx, 2)+ Math.pow(cosx, 2);
 double right = 1.0;
 double difference1 = Math.abs(left-right);
 
    System.out.println("IDENTITY1:");   
    System.out.println("sinx^2 + cosx^2 = 1");
    System.out.println("Left side=" +left); 
    System.out.println("Right side=" +right); 
 
     if (difference1<=tolerance){
         System.out.println("Result= TRUE");     
     }
     else {
         System.out.println("Result= FALSE"); 
         System.out.println("Difference=" +difference1); 
     }
    
    double cosdiff = Math.abs(cosx);
 
     if (cosdiff<tolerance){
         System.out.println("IDENTITY2:");   
         System.out.println("1 + tanx^2 = secx^2");
         System.out.println("Error!"
                 + "tan(x) and sec(x) are undefined when cos(x)=0");    
          }
   
     else {
         double tanx = Math.tan(rad);
         double secx = 1/ cosx;
     
         double left2 = 1 + Math.pow(tanx, 2);
         double right2 = Math.pow(secx, 2);
         double difference2 = Math.abs(left2 - right2 );  
        
         System.out.println("IDENTITY2:");   
         System.out.println("1 + tanx^2 = secx^2");
         System.out.println("Left side=" +left2);
         System.out.println("Right side=" +right2);       
         
         if (difference2 <= tolerance ) {
         System.out.println("Result= TRUE");     
          }
         else {
         System.out.println("Result= FALSE"); 
         System.out.println("Difference=" +difference2);
         }
       }
     //sin(2x)= 2sinxcosx
     double left3 = Math.sin( 2*rad ) ;
     double right3 = 2* Math.sin(rad) * Math.cos(rad);
     double difference3 = Math.abs(left3 - right3 );  
       
         System.out.println("IDENTITY3:");   
         System.out.println("sin(2x)= 2sinxcosx");
         System.out.println("Left side=" +left3);
         System.out.println("Right side=" +right3);       
         
         if (difference3 <= tolerance ) {
         System.out.println("Result= TRUE");     
          }
         else {
         System.out.println("Result= FALSE"); 
         System.out.println("Difference=" +difference3);
         }
         
   // Critical thinking questions:
    
// 1.  Why do we need a tolerance when comparing a floating-point values?
    //-> Computers can sometimes have a very small rounding errors when working with decimal numbers.
    // A tolerance allows the program to consider the values that are very close as aprproximately equal.
    
// 2. Which identity might be most susceptible to floating-point precision issues and why?
   //-> The identity 2 in the problem can have more precision problems when the cosine is close to zero,
   // because tan and sec can have a lot of decimals in those kind of situations.
      
// 3. How could you extend this program to verify more complex identities?
   //-> We could add more identities to the program and calculate both sides of each identity.       
   // And I could use the same toleraance to maintain consistency in checking if both sides are approximately equal.        
         
         
 //Problem 5: Wave Properties Analyzer
 
 System.out.println("Input the Ampiltude:");
 double A= input.nextDouble();
  
 System.out.println("Input the Frequency in Hz:");
 double F= input.nextDouble();
 
 System.out.println("Input the Phase shift in Degrees :");
 double PhaseSD= input.nextDouble();
 
 System.out.println("Input the time in Seconds:");
 double time= input.nextDouble();
 
     if (A<0){
         System.out.println("Error! The Amplitude must be positive.");         
     }

     else if (F<=0){
         System.out.println("Error! The frequency must be > 0");
     }
     
     else if (time<0){
         System.out.println("Error! Time is always positve.");
     }
     
     else {
     
     double PhaseSrad= Math.toRadians(PhaseSD);
     double angularF = 2*Math.PI * F;
     double period= 1/F;
     double Phase= angularF * time + PhaseSrad;
     double Wave= A * Math.sin(Phase);
     double tolerance5 = 0.0001;
 
     System.out.println("Result:");
     System.out.println("Amplitude="  +A );
     System.out.println("Frequency=" +F );
     System.out.println("Phase Shift=" + PhaseSD );
     System.out.println("Period=" +period );
     System.out.println("Time=" +time );
     System.out.println("Wave=" +Wave );
     
            if ( Math.abs(Math.sin(Phase)- 1) <tolerance5 ){
                 System.out.println("Wave is at PEAK.");
            }
            
            else if ( Math.abs(Math.sin(Phase)+ 1) <tolerance5){
                 System.out.println("Wave is at TROUGH.");
            }
            
            else if ( Math.abs(Math.sin(Phase)) < tolerance5){
                 System.out.println("Wave is at ZERO-CROSSING.");
            }
     
            else {
                 System.out.println("Wave is between a PEAK, TROUGH, and ZERO-CROSSING.");
            }
        
           double NextPeakAngle = Math.PI /2;
           while (NextPeakAngle <= Phase){
                  NextPeakAngle = NextPeakAngle+ 2*Math.PI;
           }
           
           double NextPeakTime = (NextPeakAngle - PhaseSrad) / angularF; 
           System.out.println("NextPeak will occur at approximately:" +NextPeakTime+ "seconds" );  
        }
 
     // Critical thinking questions:
    
// 1.  How did you determine if the wave is at peak or trough?
    //-> By comparing the calculated value of the wave with the amplitude. If it is close to the positive amplitude,
    // it is a peak, while value close to negative amplitude is a trough.
    
// 2. What mathematical approach did you use to find the next peak?
   //-> I used the period of the waves to determine when the next peak will occur. The frequency is used to calculate the 
   // period, and the phase shift is also considered.
      
// 3. How would you modify this program to handle non-sinusoidal waves?
   //-> I would add different formulas for the other types of waves that need to be added. The program would then use the 
   // formulas to find the wave's value, peaks. troughs, and zero-crossings.
              
        
        
    }
    
}
