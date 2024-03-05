import java.util.Scanner;
class OperaList {
    public static Scanner lea = new Scanner(System.in);

    private Nodo cab, ult, p, q; // Atributos de la clase

    public OperaList() // Método constructor
    {
        cab = null;
        ult = null;
    }

    public void NumerosString(String numeroP, String numeroQ) {
        System.out.println(numeroP + "\n" + numeroP.length());
        System.out.println(numeroQ + "\n" + numeroP.length());
        numeroP = numeroP.trim();
        numeroQ = numeroQ.trim();
        System.out.println(numeroP + "\n" + numeroP.length());
        System.out.println(numeroQ + "\n" + numeroP.length());

    }
    public void ImpresionNumP(String numeroP) {
         int posi, posf;
        posf = numeroP.length();
        posi = posf - 4;
        while(posf > 0){

            int numFrag = Integer.parseInt(numeroP.substring(posi, posf));
            Crear_nodo(numFrag);
            posf = posi;
            posi = posi - 4;
            if (posi<0) {
                posi = 0;
            }
            Nodo p = cab.siguiente;
            System.out.println(p.valor);
            p = p.siguiente;
        }


    }

    public void Crear_nodo(int numFrag)    {
        Nodo p = new Nodo(new int[]{numFrag});
       if (cab == null){
            System.out.println("No hay espacio de memoria");
            cab = p;
            ult = p;
        }
        p.siguiente = cab;
        cab.siguiente = p;
        cab = p;
        ult.siguiente = cab;
        cab.anterior = ult;

    }

/*
    public void ImpresionNumq() {
        int cont = 1, dato;
        try {
            while (cont <= 5) {
                p = new Nodo(new int[] { -1, -1, -1, -1 }); // Pide una nueva dirección de memoria
                if (p == null) {
                    System.out.print("No hay espacio de memoria");
                    break;
                } else {
                    System.out.print("Ingrese valor al Nodo: ");
                    String numeroP = null;
                    dato = Integer.parseInt(numeroP); // Convertir a entero
                    p.valor[0] = dato % 10000;
                    dato /= 10000;
                    p.valor[1] = dato % 10000;
                    dato /= 10000;
                    p.valor[2] = dato % 10000;
                    dato /= 10000;
                    p.valor[3] = dato;
                    if (cab == null)
                        cab = p;
                    else
                        ult.siguiente = p;
                }
                ult = p;
                cont++;
            }
        } catch (Exception e) {
            System.out.print("Error en el Método Crear Lista");
        }
    }
    public void ImpresionNumQ() {
        int cont = 1, dato;
        try {
            while (cont <= 5) {
                q = new Nodo(new int[] { -1, -1, -1, -1 }); // Pide una nueva dirección de memoria
                if (q == null) {
                    System.out.print("No hay espacio de memoria");
                    break;
                } else {
                    System.out.print("Ingrese valor al Nodo: ");
                    String numeroQ = null;
                    dato = Integer.parseInt(numeroQ); // Convertir a entero
                    q.valor[0] = dato % 10000;
                    dato /= 10000;
                    q.valor[1] = dato % 10000;
                    dato /= 10000;
                    q.valor[2] = dato % 10000;
                    dato /= 10000;
                    q.valor[3] = dato;
                    if (cab == null)
                        cab = q;
                    else
                        ult.siguiente = q;
                }
                ult = q;
                cont++;
            }
        } catch (Exception e) {
            System.out.print("Error en el Método Crear Lista");
        }
    }

    public void SumaNum() {
        p = cab;
        if (cab == null)
            System.out.print("Lista vacía");
        else {
            while (p != null && !(p.valor[0] == -1 && p.valor[1] == -1 && p.valor[2] == -1 && p.valor[3] == -1)) {
                System.out.print(p.valor[3] + " " + p.valor[2] + " " + p.valor[1] + " " + p.valor[0] + " -> ");
                p = p.siguiente;
            }
            System.out.print("\\");
        }
    }*/
}
