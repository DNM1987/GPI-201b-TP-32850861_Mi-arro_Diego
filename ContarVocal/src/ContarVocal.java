import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ContarVocal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        int contador1 = 0;
        int contador2 = 0;
        Object consonantes;

        String caracteres[] = cad.split("");
        for (int x = 0; x < cad.length(); x++) {
            contador1++;
        }
        //iteramos mientras el indice sea menor al tamanio total de la cadena
        char car = 0;
        for (int i = 0; i < cad.length(); i++) {
            car = cad.charAt(i);
            //si el caracter es igual a "a", "e", "i", "o", ó "u" entonces es vocal
            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
                contador2++;
            }
        }
        int contadorVocales = 0;
        char letraArray[] = cad.toCharArray();
        char letra;
        int contadorLetraRepetida = 0;

        for (int i = 0; i < cad.length(); i++) {
            switch (cad.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contadorVocales++;
                    break;
            }
        }
        String letraMasRepetida = "";
        int cantidadRepetida = 0;
        List<String> textoList = Arrays.asList(cad.split(""));
//Recorremos y contamos todo
        for(String item : textoList){
            //pasamos como primer parámetro la lista
            // y como segundo la letra que queremos contar
            int cantidad = Collections.frequency(textoList, item);
            // con esto comprobamos que no sea un espacio en blanco
            if(cantidadRepetida < cantidad && !item.equals(" ")){
                letraMasRepetida = item;
                cantidadRepetida = cantidad;
            }
        }

            consonantes = contador1 - contador2;
            System.out.printf("La cadena " + cad + " contiene " + contador2 + " vocales \n");
            System.out.printf("La cadena " + cad + " contiene " + consonantes + " consonantes \n ");
        System.out.println(String.format("La letra %s es la que mayor se repite, con %o veces", letraMasRepetida, cantidadRepetida));
    }

}