import java.util.Scanner;

public class LiveCoding {
    public static class MangosNaranjas {
        // atributos
        int mangos;
        int naranjas;

        void imprimir() {
            int mangosPorCaja = naranjas / obtenerMaximoDivisor(mangos, naranjas);
            int naranjasPorCaja = mangos / obtenerMaximoDivisor(naranjas, mangos);
            int cajas = (mangos + naranjas) / (naranjasPorCaja + mangosPorCaja);
            System.out.println("Numero de cajas: " + cajas);
            System.out.println("Numero de mangos por caja: " + mangosPorCaja);
            System.out.println("Numero de naranjas por caja: " + naranjasPorCaja);
        }

        int obtenerMaximoDivisor(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // contructor
        public MangosNaranjas(int mangos, int naranjas) {
            this.mangos = mangos;
            this.naranjas = naranjas;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de mangos: ");
        int mangos = scanner.nextInt();
        System.out.print("Numero de naranjas: ");
        int naranjas = scanner.nextInt();
        scanner.close();

        MangosNaranjas mangosNaranjas = new MangosNaranjas(mangos, naranjas);

        mangosNaranjas.imprimir();

    }
}
