import java.util.ArrayList;
import java.util.Scanner;

public class Ogrenci {
    private String ilkisim;
    private String Sonisim;
    private String yil;
    private String ogrenciNo;
    private String dersler = "";
    private double toplamborc;
    private int dersucreti = 600;
    private static int id = 1000;
    ArrayList<String> list = new ArrayList<>();

    public Ogrenci() {
        System.out.println("-------------------Ders Kaydi Ekranina Hos Geldiniz-------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Adinizi  giriniz : ");
        this.ilkisim = input.nextLine();
        System.out.print("Soyisminizi giriniz : ");
        this.Sonisim = input.nextLine();
        boolean flag2 = true;
        do {
            System.out.print("Kacinci sinifsiniz : ");
            this.yil = input.nextLine();
            int yil = Integer.parseInt(this.yil);
            if (yil <= 0 || yil > 4) {
                flag2 = true;
                System.out.println("Gecersiz giris !");
            } else {
                flag2 = false;
            }
        } while (flag2);
    }

    public void ogrenciNoyarat() {
        this.ogrenciNo = yil + id;
        System.out.println("-------------------------------");
        System.out.println("Ogrenci kodunuz : " + ogrenciNo);
        System.out.println("-------------------------------");
        id++;
    }

    public void derskaydi() {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Secmek istediginiz dersin kodunu giriniz : ");
        System.out.println("Tarih dersinin kodu : 101");
        System.out.println("Matamatik dersinin kodu : 103");
        System.out.println("Ingilizce dersinin kodu : 105");
        System.out.println("Kimya dersinin kodu : 107");
        System.out.println("Bilgisyar bilimleri dersinin kodu : 109");
        System.out.println("Cikmak icin X tusuna basiniz.");
        do {
            String elave = input.nextLine().toUpperCase();

            if (list.contains(elave)) {
                System.out.println("Bu dersi zaten secdiniz.");
            }else {
                list.add(elave);
                switch (elave) {
                    case "101":
                        dersler = dersler + " Tarih ";
                        System.out.println("Secdiginiz dersler : " + dersler);
                        toplamborc = toplamborc + dersucreti;
                        borc();
                        break;
                    case "103":
                        dersler = dersler + " Matamatik ";
                        System.out.println("Secdiginiz dersler : " + dersler);
                        toplamborc = toplamborc + dersucreti;
                        borc();
                        break;
                    case "105":
                        dersler = dersler + " Ingilizce ";
                        System.out.println("Secdiginiz dersler : " + dersler);
                        toplamborc = toplamborc + dersucreti;
                        borc();
                        break;
                    case "107":
                        dersler = dersler + " Kimya ";
                        System.out.println("Secdiginiz dersler : " + dersler);
                        toplamborc = toplamborc + dersucreti;
                        borc();
                        break;
                    case "109":
                        dersler = dersler + " Bilgisyar bilimleri ";
                        System.out.println("Secdiginiz dersler : " + dersler);
                        toplamborc = toplamborc + dersucreti;
                        borc();
                        break;
                    case "X":
                        flag = false;
                        System.out.println("Cikisiniz yapildi !");
                        break;
                    default:
                        System.out.println("Gecersiz islem yaptiniz.");
                        // derskaydi();
                }
            }
            } while (flag);

        System.out.println("Secilen dersler : " + dersler);
        borc();
    }
    public void borc(){
        System.out.println("Toplam borcunuz : " + toplamborc);
    }
    public void odeme(){
        Scanner input = new Scanner(System.in);
        System.out.println("Odegeceniz miktari giriniz : ");
        double odeme = input.nextDouble();
        toplamborc = toplamborc - odeme;
        if (toplamborc < 0) {
            toplamborc = 0;
        }
        System.out.println("Odediginiz miktar : " + odeme);
        borc();
        System.out.println("Kaydiniz basari ile yapildi.Tebrikler !");
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ilkisim='" + ilkisim + '\'' +
                ", Sonisim='" + Sonisim + '\'' +
                ", yil='" + yil + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", dersler='" + dersler + '\'' +
                ", toplamborc=" + toplamborc +
                '}';
    }

    //    public void result(){
//        System.out.println("Ogrencinin ismi ve soyismi : " + ilkisim + " " + Sonisim);
//        System.out.println("Ogrencinin kodu : " + ogrenciNo);
//        System.out.println("Ogrencinin yili : " + yil);
//        System.out.println("Ogrencinin aldigi dersler : " + dersler);
//        System.out.println("Ogrencinin borcu : " + toplamborc);
//    }
}
