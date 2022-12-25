import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm=2.20;
        double total,start=10;

        Scanner oku= new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz:");
        km=oku.nextInt();

        total=(km*perKm);
        total+=start;
        total=(total<20) ? 20 : total;

        System.out.println("Toplam tutar: "+total);
    }
}
