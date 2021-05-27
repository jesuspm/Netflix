package practica4;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedInputStream;

public class Main {
	
	static class j {
		public static void main(String[] args) throws IOException {
		int i, r;
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("Entra número ");
		//n = Integer.parseInt(reader.readLine());
		//while(n<=0){
		//System.out.print("Error");
		//System.out.print("Entra: ");
		//n = Integer.parseInt(reader.readLine());
		//}
		int n = pedirNumero("Entra número ");
		CalculaFactorial(n);
		//r=1;
		//i=1;
		//while(i<=n){
		//r = r * i;
		//i++;
		//}
		//System.out.println(r);
		}
	}
}


/*És llegible?
És un codi net?
si
Sabeu que fa?
Va ejecurando por las parametros segun el orden indicado.
Valoreu quins elements us ajuden o dificulten l'entesa del codi:
Variables
Format 
Estructures de control
Comentaris*/