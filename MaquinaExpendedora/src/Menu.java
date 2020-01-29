
import java.util.Scanner;
	

	public class Menu {
	    public static void ImprimirMenu (){
	        Scanner S = new Scanner (System.in);
	        int cant, nuevoP, opc;
	        do{
	            System.out.println ("\n1. Usuario");
	            System.out.println ("2. Administrador");
	            System.out.println ("3. Finalizar\n");
	            Productos obj1=new Productos();
	            opc = S.nextInt();
	            switch (opc) {
	                case 1:{
	                    do{
	                        System.out.println("\n1. Margarita");
	                        System.out.println("2. Chocoramo");
	                        System.out.println("3. Galletas");
	                        System.out.println("4. Cheetos");
	                        System.out.println("5. Regresar");
	                        System.out.println("¿Que producto desea escoger?\n");
	                        opc=S.nextInt();
	                        switch(opc){

 
