package refactoring;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float a,c,d;String str;
        b=0;
        int personas=(int) pedirFLoat("Quanta gent: ", 1,50);  
        float v[] = new float[personas];
        
        //Llenado del array
        for(int i=0;i<v.length;i++){
        	v[i]=pedirFLoat("Introdueix: "+(i+1)+": ",0,10);
            System.out.println(v[i]);
        }
        //Suma del array
        for(int i=0;i<=v.length-1;i++){
        float v1 = v[i];
        float suma = v[i];
        }
      
      c=v[0];
      d=v[0];
      for(int i=0;i<v.length;i++){
    	  float v1 = v[i];
          if(v1>c){
              c=v[i];
          }
          if(v1<d){
              d=v[i];
          }
      }
    System.out.println();
    for(int i=0;i<v.length;i++){
          System.out.print(v[i]+", ");
      }
    System.out.println();
     //Imprimir 
      System.out.println("Mitja: "+b/v.length);
      System.out.println("Pitjor: "+c);
      System.out.println("Millor: "+d);
    }
    
    public static float[] LlenadoArrayFloats(int personas) {
    	float v[]= new float[personas];
    	
    	for(int i=0;i<v.length; i++) {
    		v[i]=pedirFLoat("Introdueix "+(i+1)+": ",0,10);
    		System.out.println(v[i]);
    	}
    	return v;
    }
    
    public static float pedirFLoat (String pregunta, int min, int max){
    	Scanner sc = new Scanner (System.in);
    	System.out.print(pregunta);
    	String text = sc.next();
    	System.out.print("Quanta gent: ");
          String text = sc.next();
          int as = Integer.parseInt(text);
          while(as>max || min<1){
              System.out.println("ERROR");
              text= sc.next();
              as = Integer.parseInt(text);
          }
    	return max;
    	
    }
}

	