import java.util.Scanner;

public class LaNotablisimaPrueba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte EstudianteAprueba = 0;
     
        for (int i = 1; i <= 4; i++) {
            System.out.println("ingrese la pimera nota del "+ i +" estudiantes");
            float nota_1 = input.nextFloat();
            System.out.println("ingrese la segunda nota del "+ i +" estudiantes");
            float nota_2 = input.nextFloat();
            System.out.println("ingrese la tercera nota del "+ i +" estudiantes");
            float nota_3 = input.nextFloat();
            float Promedio = nota_1+nota_2+nota_3 ;
            Promedio = Promedio/3;
            if (Promedio>=3.0) {
                EstudianteAprueba++;
            }
        }
        System.out.println("el numero de estudiantes que aprobaron fue:"+EstudianteAprueba);
        input.close();
    }
}
