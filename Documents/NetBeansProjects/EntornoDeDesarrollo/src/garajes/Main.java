/*
Aplicación para gestionar datos de garajes. Permite guardar y listar datos de 3 garajes y de los coches que se guardan en ellos.
La aplicación usa las clases Garage, vehículo y Coche ( extensión de Vehículo).
 */
package garajes;
import java.util.Scanner;
/**
 *
 * @author EDD- 1ºDAW 2019/20
 */
public class Main {
   
 static Garage[] garajes ;
 static Scanner sc = new Scanner( System.in);   

    
       
    public static Garage creaGaraje(){
       
        // instancio un objeto garaje temporal
        Garage garajet = new Garage(); 
        // doy valores a sus atributos por teclado usando métodos set
        System.out.println("Introduce el nombre: ");
        garajet.setNombre(sc.nextLine());
        System.out.println("Introduce dirección: ");
        garajet.setDireccion(sc.nextLine());
        System.out.println("Introduce tamaño en m2: ");
        garajet.setM2(sc.nextDouble());
        System.out.println("Introduce número de plazas: ");
        garajet.setPlazas(sc.nextInt());
        sc.nextLine();
        
        // defino el tamaño del vector de coches e instancio cada coche para despues darle los datos 
        Coche[] coches = new Coche[garajet.getPlazas()];
        // instancio los coches vacios del vector coches 
        for (int c = 0 ; c<coches.length ; c++){
             coches[c] = new Coche();
         }
        
        System.out.println("Vamos a introducir los datos de los coches:");
        
       for (int i=0; i<coches.length; i++) {
            
            System.out.println("--------------------------------------------");
            System.out.println("Introduce los datos del "+ (i+1) + "º coche"); 
            System.out.println("Marca: ");
            coches[i].setMarca(sc.nextLine());
            System.out.println("Modelo: ");
            coches[i].setModelo(sc.nextLine());
            System.out.println("Número VIN: ");
            coches[i].setNref(sc.nextLine());
            System.out.println("Color: ");
            coches[i].setColor(sc.nextLine());
            System.out.println("Matricúla: ");
            coches[i].setMatricula(sc.nextLine());
            System.out.println("Carburante: ");
            coches[i].setCarburante(sc.nextLine());
            System.out.println("Potencia: ");
            coches[i].setPotencia(sc.nextLine());
            System.out.println("Cilindrada: ");
            coches[i].setCilindrada(sc.nextInt());
            sc.nextLine();
            System.out.println("Número de puertas: ");
            coches[i].setNpuertas(sc.nextInt());
            System.out.println("Número de plazas: ");
            coches[i].setNpuertas(sc.nextInt());
            sc.nextLine();
            System.out.println("--------------------------------------------");
            
       }
       garajet.setCoches(coches);
       
      return garajet; 
    }
    
    public static void listaGarajes(){
         System.out.println("-----------------------------------------------------");
         System.out.println("--------------- LISTADO -----------------------------");
       for (int g=0; g<garajes.length ; g++){
      
        System.out.println("Datos de "+(g+1)+"º garaje ");
        System.out.println("Nombre: "+garajes[g].getNombre());
        System.out.println("Dirección: "+garajes[g].getDireccion());
        System.out.println("Tamaño: "+garajes[g].getM2()+ " m2");
      
        System.out.println("Los coches del garaje son:");
        
            for (int i=0; i<garajes[g].getCoches().length; i++) {
                 System.out.println("--------------------------------------------");
                 System.out.println("Datos del "+ (i+1) + "º coche"); 
                 System.out.println("Marca: " + garajes[g].getCoches()[i].getMarca());
                 System.out.println("Modelo: "+ garajes[g].getCoches()[i].getModelo());
                 System.out.println("Número VIN: "+ garajes[g].getCoches()[i].getNref());

                 System.out.println("Color: "+ garajes[g].getCoches()[i].getColor());

                 System.out.println("Matricúla: "+ garajes[g].getCoches()[i].getMatricula());
                 System.out.println("Carburante: "+ garajes[g].getCoches()[i].getCarburante());

                 System.out.println("Potencia: "+ garajes[g].getCoches()[i].getPotencia());

                 System.out.println("Cilindrada: "+ garajes[g].getCoches()[i].getCilindrada());

                 System.out.println("Número de puertas: "+ garajes[g].getCoches()[i].getNpuertas());

                 System.out.println("Número de plazas: "+ garajes[g].getCoches()[i].getPlazas());

                 System.out.println("--------------------------------------------");

            }
        }
       System.out.println("------------------------------------------------------------");
       System.out.println("--------------- FIN DE LISTADO -----------------------------");
   }
    
    public static void main(String[] args) {
        
        
        System.out.println("Bienvenidos a la aplicación para gestión de datos de garajes.");
        System.out.println("------------------");
        System.out.println("Define cuantos garajes vamos a gestionar.");
        garajes= new Garage[sc.nextInt()];
        sc.nextLine();
        System.out.println("--------------------------------------------------------");
        
        int op;
        do {
            System.out.println("Selecciona opción: ");
            System.out.println("1. Dar de alta los garajes ");
            System.out.println("2. Mostrar los datos de los garajes: ");
            System.out.println("3. Salir ");
            op=sc.nextInt();
            sc.nextLine();
        
        switch (op) {
            case 1:  
                for (int j=0 ; j<garajes.length ; j++){
                    System.out.println("Introduce los datos del "+ (j+1) +"º garaje ");
                    garajes[j] = new Garage();
                    garajes[j]=creaGaraje();
                }
                break;
            case 2:
                
                    listaGarajes();
                 break;
            case 3: 
                   System.out.println("Gracias por usar la aplicación .. hasta otra!!!");
                 break;
        }
        
        }while (op!=3);
      
      
      
    }
    
}
