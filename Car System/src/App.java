import java.util.Scanner;

public class App {

    static String start,stop;
    static int currentSpeed=60,accelerate,brake,newspeed;

    static void captureFunctions(){
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter x to start the car");
        start=s.next();
        System.out.println("the car starts to move at a speed of 60km per hour");
        System.out.println("hom many minutes have you been eccelerating?");
        accelerate=s.nextInt();
        System.out.println("how many minutes did you brake?");
        brake=s.nextInt();
    }    

    static void measureDistance(){
       newspeed=currentSpeed+accelerate;
       
    }

    static void displayDistance(){
        if(accelerate>brake){
            System.out.println("new distance travelled is:" + " " +newspeed + " " + "kilomters per hour");
           } 
           else{
            System.out.println("your distance has now decreased:");
           }

        if(accelerate+brake==0){
            System.out.println("the car is now stopping");
        }   
    }

    
    public static void main(String[] args) throws Exception {
        captureFunctions();
        measureDistance();
        displayDistance();

    }
}

