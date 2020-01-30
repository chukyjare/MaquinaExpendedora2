
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
                            case 1:{
                                System.out.println("\nHay "+obj1.cantidadMar+" Margarita");
                                System.out.println("Precio: "+obj1.precioMar);
                                System.out.println("¿Cuantos productos desea comprar?");
                                cant = S.nextInt();
                                obj1.vendidoMar=obj1.vendidoMar+cant;
                                obj1.cantidadMar=obj1.cantidadMar-cant;
                                obj1.totalMar=obj1.precioMar*cant;
                                obj1.gananciaMar=obj1.gananciaMar+obj1.totalMar;
                                System.out.println("Compra exitosa: "+cant+" Margarita");
                                System.out.println("Total: "+obj1.totalMar);
                                System.out.println("¿Comprar otro producto?\n1. SI\n2. NO\n");
                                opc = S.nextInt ();
                                break;
                            }
                            case 2:{
                                System.out.println("\nHay "+obj1.cantidadCho+" Chocoramo");
                                System.out.println("Precio: "+obj1.precioCho);
                                System.out.println("¿Cuantos productos desea comprar?");
                                cant = S.nextInt();
                                obj1.vendidoCho=obj1.vendidoCho+cant;
                                obj1.cantidadCho=obj1.cantidadCho-cant;
                                obj1.totalCho=obj1.precioCho*cant;
                                obj1.gananciaCho=obj1.gananciaCho+obj1.totalCho;
                                System.out.println("Compra exitosa: "+cant+" Chocoramo");
                                System.out.println("Total: "+obj1.totalCho);
                                System.out.println("¿Comprar otro producto?\n1. SI\n2. NO\n");
                                opc = S.nextInt ();
                                break;
                            }
                            case 3:{
                                System.out.println("\nHay "+obj1.cantidadGa+" Galleta");
                                System.out.println("Precio: "+obj1.precioGa);
                                System.out.println("¿Cuantos productos desea comprar?");
                                cant = S.nextInt();
                                obj1.vendidoGa=obj1.vendidoGa+cant;
                                obj1.cantidadGa=obj1.cantidadGa-cant;
                                obj1.totalGa=obj1.precioGa*cant;
                                obj1.gananciaGa=obj1.gananciaGa+obj1.totalGa;
                                System.out.println("Compra exitosa: "+cant+" Galleta");
                                System.out.println("Total: "+obj1.totalGa);
                                System.out.println("¿Comprar otro producto?\n1. SI\n2. NO\n");
                                opc = S.nextInt ();
                                break;
                            }
                            case 4:{
                                System.out.println("\nHay "+obj1.cantidadChe+" Cheetos");
                                System.out.println("Precio: "+obj1.precioChe);
                                System.out.println("¿Cuantos productos desea comprar?");
                                cant = S.nextInt();
                                obj1.vendidoChe=obj1.vendidoChe+cant;
                                obj1.cantidadChe=obj1.cantidadChe-cant;
                                obj1.totalChe=obj1.precioChe*cant;
                                obj1.gananciaChe=obj1.gananciaChe+obj1.totalChe;
                                System.out.println("Compra exitosa: "+cant+" Cheetos");
                                System.out.println("Total: "+obj1.totalChe);
                                System.out.println("¿Comprar otro producto?\n1. SI\n2. NO\n");
                                opc = S.nextInt ();
                                break;
                            }
                            case 5:{
                                opc=2;
                                System.out.println("\n");
                                break;
                            }
                            default: {
                                System.out.println("Digite una opcion valida\n");
                            }
                        }
                    }while(opc!=2);
                    break;
                }
                case 2:{
                    do{
                      System.out.println ("\n1. Agregar cantidad"); 
                      System.out.println ("2. Cambiar precio");
                      System.out.println ("3. Cantidad de ventas y ganancia");
                      System.out.println ("¿Que opcion desea escoger?");
                      opc = S.nextInt();
                      switch (opc){
                          case 1:{
                              do {
                              System.out.println("\n1. Margarita");
                              System.out.println("2. Chocoramo");
                              System.out.println("3. Galleta");
                              System.out.println("4. Cheetos");
                              System.out.println ("¿Que opcion desea escoger?");
                              opc = S.nextInt();
                              switch(opc){
                                  case 1:{
                                      System.out.println("Hay "+obj1.cantidadMar+" Margarita");
                                      System.out.println("Agregar: ");
                                      cant = S.nextInt();
                                      obj1.cantidadMarT=obj1.cantidadMar+cant;
                                      obj1.cantidadMar=obj1.cantidadMar+cant;
                                      System.out.println("¿Agregar cantidad para otro producto?\n1. SI\n2. NO\n");
                                      opc = S.nextInt();
                                      break;
                                  }
                                  case 2:{
                                      System.out.println("Hay "+obj1.cantidadCho+" Chocoramo");
                                      System.out.println("Agregar: ");
                                      cant = S.nextInt();
                                      obj1.cantidadChoT=obj1.cantidadCho+cant;
                                      obj1.cantidadCho=obj1.cantidadCho+cant;
                                      System.out.println("¿Agregar cantidad para otro producto?\n1. SI\n2. NO\n");
                                      opc = S.nextInt();
                                      break;
                                  }
                                  case 3:{
                                      System.out.println("Hay "+obj1.cantidadGa+" Galleta");
                                      System.out.println("Agregar: ");
                                      cant = S.nextInt();
                                      obj1.cantidadGaT=obj1.cantidadGa+cant;
                                      obj1.cantidadGa=obj1.cantidadGa+cant;
                                      System.out.println("¿Agregar cantidad para otro producto?\n1. SI\n2. NO\n");
                                      opc = S.nextInt();
                                      break;
                                  }
                                  case 4:{
                                      System.out.println("Hay "+obj1.cantidadChe+" Cheetos");
                                      System.out.println("Agregar: ");
                                      cant = S.nextInt();
                                      obj1.cantidadCheT=obj1.cantidadChe+cant;
                                      obj1.cantidadChe=obj1.cantidadChe+cant;
                                      System.out.println("¿Agregar cantidad para otro producto?\n1. SI\n2. NO\n");
                                      opc = S.nextInt();
                                      break;
                                  }
                                  default:{
                                    System.out.println("Digite una opcion valida\n");
                                  }
                              }
                              }while(opc!=2);
                              break;
                          }
                          case 2:{
                              do{
                                 System.out.println("\n1. Margarita");
                                 System.out.println("2. Chocoramo");
                                 System.out.println("3. Galleta");
                                 System.out.println("4. Cheetos");
                                 System.out.println ("¿Que opcion desea escoger?");
                                 opc = S.nextInt();
                                 switch(opc){
                                     case 1:{
                                         System.out.println("Precio actual: "+obj1.precioMar);
                                         System.out.println("Cambiar: ");
                                         nuevoP = S.nextInt();
                                         obj1.precioMar=nuevoP;
                                         System.out.println("¿Cambiar precio de otro producto?\n1. SI\n2. NO\n");
                                         opc = S.nextInt();
                                         break;  
                                     }
                                     case 2:{
                                         System.out.println("Precio actual: "+obj1.precioCho);
                                         System.out.println("Cambiar: ");
                                         nuevoP = S.nextInt();
                                         obj1.precioCho=nuevoP;
                                         System.out.println("¿Cambiar precio de otro producto?\n1. SI\n2. NO\n");
                                         opc = S.nextInt();
                                         break;
                                     }
                                     case 3:{
                                         System.out.println("Precio actual: "+obj1.precioGa);
                                         System.out.println("Cambiar: ");
                                         nuevoP = S.nextInt();
                                         obj1.precioGa=nuevoP;
                                         System.out.println("¿Cambiar precio de otro producto?\n1. SI\n2. NO\n");
                                         opc = S.nextInt();
                                         break;
                                     }
                                     case 4:{
                                         System.out.println("Precio actual: "+obj1.precioChe);
                                         System.out.println("Cambiar: ");
                                         nuevoP = S.nextInt();
                                         obj1.precioChe=nuevoP;
                                         System.out.println("¿Cambiar precio de otro producto?\n1. SI\n2. NO\n");
                                         opc = S.nextInt();
                                         break;
                                     }
                                     default:{
                                         System.out.println("Digite una opcion valida\n");
                                     }
                                 }
                              }while(opc!=2);
                              break;
                          }
                          case 3:{
                              do{
                              obj1.porcentajeMar=(obj1.vendidoMar*100)/obj1.cantidadMarT;
                              obj1.porcentajeCho=(obj1.vendidoCho*100)/obj1.cantidadCho;
                              obj1.porcentajeGa=(obj1.vendidoGa*100)/obj1.cantidadGa;
                              obj1.porcentajeChe=(obj1.vendidoChe*100)/obj1.cantidadChe;
                              System.out.println("Cantidad y porcentaje de ventas:");
                              System.out.println("Margarita: "+obj1.cantidadMar+" "+obj1.porcentajeMar);
                              System.out.println("Chocoramo: "+obj1.vendidoCho+" "+obj1.porcentajeCho);
                              System.out.println("Galleta: "+obj1.vendidoGa+" "+obj1.porcentajeGa);
                              System.out.println("Cheetos: "+obj1.vendidoChe+" "+obj1.porcentajeChe);
                              System.out.println("Ganancias:");
                              System.out.println("Margarita: "+obj1.gananciaMar);
                              System.out.println("Chocoramo: "+obj1.gananciaCho);
                              System.out.println("Galleta: "+obj1.gananciaGa);
                              System.out.println("Cheetos: "+obj1.gananciaChe);
                              System.out.println("¿Desea regresar?\n1. SI\n2. NO");
                              opc=S.nextInt();
                              }while(opc!=1);
                              break;
                          }
                          default:{
                              System.out.println("Digite una opcion valida\n");
                          }
                      }
                    }while (opc!=2);
                    
                    break;
                }
                case 3:{
                    System.out.println("Gracias por su compra");
                    break;
                }
                default:{
                    System.out.println("Digite una opcion valida\n");
                }
            }
        }while(opc!=3);
    }
}


 
