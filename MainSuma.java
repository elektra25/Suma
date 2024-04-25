import java.util.Scanner;
class MainSuma {
    public static void main (String [] args){
    int a,b,res;
        Scanner op = new Scanner (System.in);
        Suma suma = new Suma ();
        System.out.println ("Ingresa un numero");
        a=op.nextInt();
        System.out.println ("Ingresa otro numero");
        b=op.nextInt();
        suma.res=(a+b);
        suma.mostrarSuma();
    }

    }