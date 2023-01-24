import java.util.Arrays;
import java.util.*;
public class App {


    public static void selectionSort(int[] arr){
        for (int i=0; i<(arr.length -1); i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex =j;

                }
            }
            int temp = arr[minIndex];
            arr[minIndex]= arr[i];
            arr[i] = temp;

        }

    }
    public static int busquedaBinaria( int [] arreglo, int num) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio+fin) / 2;
            if ( arreglo[pos] == num )
              return pos;
            else if ( arreglo[pos] < num ) {
         inicio = pos+1;
            } else {
         fin = pos-1;
            }
        }
        return -1;
           }
        
    
    public static void main(String[] args) throws Exception{
        
      Scanner sc = new Scanner(System.in);
      System.out.println("-Ingrese un arreglo de 5 números enteros:");
      int arr1[]= new int[5];
      for(int i=0;i<arr1.length;i++){
          System.out.println("-Ingrese un elemento para la posicion "+i+" del arreglo");
          arr1[i]=sc.nextInt();
      }
      
      for(int x=0;x<arr1.length;x++){
          
      }
        
        System.out.println("-Arreglo no ordenado:");
        System.out.println(Arrays.toString(arr1));
        
        selectionSort(arr1);
        System.out.println("-Arreglo ordenado:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("-Ingrese elemento del arreglo a buscar:");
        int elemento;
        elemento=sc.nextInt();
        int posicion = busquedaBinaria(arr1,elemento);
        if(posicion != -1){
            System.out.println("-Elemento encontrado en la posición "+posicion);
            
        }else{
            System.out.println("-Elemento no encontrado.");
        }
    }
    
}
