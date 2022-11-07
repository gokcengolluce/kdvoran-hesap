import java.util.Scanner;

public class kdvtutari {
    public static void main (String[] args){
        double kdv = 0.18;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        double tutar = girdi.nextDouble();
        System.out.println("Girdilen Ücret: " + tutar);

        double kdvmiktar = tutar * kdv;
        System.out.println("KDV Miktarı: " + kdvmiktar);
        double kdvliucret = tutar + kdvmiktar;
        System.out.print("KDV Dahil Tutar: " + kdvliucret);





    }
}
