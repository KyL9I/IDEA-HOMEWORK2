import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
         boolean isRegistered = true;
         int price = 10567;

         int mile;
         if (isRegistered) {
             mile = 20;
         } else {
             mile = 0;
         }
       int bonus = price / mile;
         System.out.println(bonus);
         
    }
}