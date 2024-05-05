public class App {
    public static void insertionShort(int[] arr) {
        int n = arr. length;
        for(int i = 1; i < n; i++){
            int key = arr [i]; // Seleccionamos el elemento a insertar en su posición correcta
            int j = i - 1;
            //Movemos los elementos mayores que key a una posición adelante de su posición 
            //actual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1]= arr[j];
                j--;
            }
        }
        arr[j + 1]= key; //Insertamos key en su posición correcta
    }
}
//key representa el elemento que queremos insertar en la parte ordenada del arreglo. 
//El bucle while desplaza los elementos mayores que key una posición adelante para hacer espacio para key. 
//Finalmente, key se inserta en la posición correcta j + 1. 


    public static void main(String[] args) {

     System.err.println("Hello World, método de ordenamiento por inserción");

     int[] arr = {12, 11, 13, 5, 6};

     System.err.println("Arreglo Original");
     for (int num : arr) {
        System.out.println(num + " ");
     }

     System.out.println("======================================");
     insertionSort(arr); //Llamada al método de ordenamiento por inserción

     System.err.println("Arreglo Ordenado");
     for (int num : arr){
        System.err.println(num + "  ");
     }


}

//Se crea un arreglo desordenado. 
//	Se imprime este arreglo antes de ordenarlo 
//Llamamos al método insertionSort para ordenar el arreglo. 
//	Imprimimos el arreglo ordenado. 


    