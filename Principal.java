import java.util.Scanner;

public class Principal {
    public static Scanner lea = new Scanner(System.in);

    public static void main(String args[]) {
        String numeroP = " 1234567890 ";
        String numeroQ = " 9876543210 ";
        try {
            OperaList Ob = new OperaList(); // Instanciar la clase OperacionesLista

            int opc;

            while (true) {
                System.out.print("\n**** MENU PRINCIPAL ****\n");
                System.out.print("\n1. Números originales");
                System.out.print("\n2. Nùmero P ");
                System.out.print("\n3. Nùmeros Q ");
                System.out.print("\n4. Suma de nùmeros astronòmicos ");
                System.out.print("\n5. Salir: ");
                System.out.print("\nOpcion: ");

                opc = lea.nextInt();
                if (opc == 1)
                    Ob.NumerosString(numeroP, numeroQ);
                if (opc == 2)
                    Ob.ImpresionNumP(numeroP);
                if (opc == 3)
                  //  Ob.ImpresionNumQ(numeroP, numeroQ);
                if (opc == 4)
                  //  Ob.SumaNum();
                if (opc == 5)
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error en el Menú principal");
        }
    }
}