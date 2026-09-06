import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      Scanner ler = new Scanner(System.in);
        
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();
        
        double media = (n1 + n2 + n3) / 3.0;
        
        int acima = 0;
        
        if (n1 > media) {
            acima++;
        }
        if (n2 > media) {
            acima++;
        }
        if (n3 > media) {
            acima++;
        }
        
     System.out.printf("%d\n", acima);
      
    }
}
    