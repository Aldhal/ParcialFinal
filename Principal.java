
import java.util.Scanner;


	public class Principal{
		
		public static void main (String[]args){
			
		  int aprobados=0;
		  int reprobados=0;
		  int excelentes=0;
		  float calificacion=0;
		  int i=1;
		  Scanner sc = new Scanner(System.in);
		  
		  while(i<=6){
			  
			  System.out.println("Ingrese una calificacion del 0 al 5: ");
			  calificacion=sc.nextFloat();
			  
			  if(calificacion>=4 && calificacion<=5){
				  excelentes++;
				  
			  }else if(calificacion>=3){
				  aprobados++;
				  
			  }else
				  reprobados++;
			  i++;  
		  }
			System.out.println("Cantidad de alumnos aprobados: " + aprobados);
			System.out.println("Cantidad de alumnos reprobados: " + reprobados);
			System.out.println("Cantidad de alumnos excelentes: " + excelentes);
        }
    }		
				  
		