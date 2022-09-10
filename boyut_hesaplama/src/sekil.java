import java.util.Scanner;
import java.util.Vector;

public class sekil {    //sekil isminde sınıf oluşturduk.
    Scanner s=new Scanner(System.in);

    public void BirBoyutluAlan() {
        System.out.println("\n1 Boyutlu Sekiller Sunlardir; Nokta , Dogru ve Cember  ^_^");
        System.out.println("Noktanin Alan Hesabi Icin 1 'e ");
        System.out.println("Dogrunun Alani icin 2 'ye ");     //kullanıcıdan gerekli bilgileri çıktı olarak veriyoruz.
        System.out.println("Cemberin alani icin 3 'e basiniz");
        System.out.print("Tercihiniz: ");

        Scanner s=new Scanner(System.in);
        int tercih=s.nextInt();   //kullanıcıdan girdi alıyoruz.

        if(tercih == 1) {     //eğer tercih 1 e eşit ise bu blok çalışacaktır.
            System.out.print("Noktanin Alani: ");
            nokta Nokta=new nokta();
            Nokta.noktaA();
        }
        else if(tercih == 2) {   //eğer tercih 2 ye eşit ise bu blok çalışacaktır.
            System.out.print("Dogrunun Alani: ");
            dogru Dogru=new dogru();
            Dogru.dogruA();
        }
        else if(tercih == 3) {   //eğer tercih 3 e eşit ise bu blok çalışacaktır.
            System.out.print("Cemberin Alani: ");
            cember Çember=new cember();
            Çember.cemberA();
        }
        else {    //eğer tercih yukarıda ki seçeneklere uymaz ise bu blok çalışacaktır.
            System.out.println("Lutfen Gecerli Tercihte Bulununuz....");
        }
    }

    //iki boyutlu şekillerin hesabınu burada yapıyoruz.
    public void İkiBoyutluAlan() {
        System.out.println("\n2 Boyutlu Sekiller Sunlardir; Kare , Yamuk ve Daire ^_^ ");
        System.out.println("Karenin Alan Hesabi Icin 1 'e");
        System.out.println("Yamugun Alani icin 2 'ye" );
        System.out.println("Dairenin Alani icin 3 'e basiniz: ");
        System.out.print("Tercihiniz: ");


        int tercih=s.nextInt();   //kullanıcıdan çıktı alıyoruz.

        if(tercih == 1) {
            System.out.print("Karenin Kenar Uzunlugunu Giriniz: ");
            int kenarUzunluk=s.nextInt();
            System.out.print("Karenin Alani: ");
            kare Kare=new kare(kenarUzunluk);
            Kare.kareA();}

        if(tercih == 2) {
            System.out.print("Yamugun Yuksekligini Giriniz: ");
            int h=s.nextInt();

            System.out.print("Yamugun Ust Taban Uzunlugunu Giriniz: ");
            int ustTaban=s.nextInt();

            System.out.print("Yamugun Alt Taban Uzunlugunu Giriniz: ");
            int altTaban=s.nextInt();

            System.out.print("Yamugun Alani: ");
            yamuk Yamuk=new yamuk(ustTaban,altTaban,h);
            Yamuk.yamukA();}

        if(tercih == 3) {
            System.out.print("Dairenin Yarıcapini Giriniz: ");
            int yarıçap=s.nextInt();

            System.out.print("Dairenin Alani: ");
            daire Daire=new daire(yarıçap);
            Daire.daireA();
        }
        else {
            System.out.println("Lutfen Gecerli Tercihte Bulununuz....");
        }
    }

    //üç boyutlu şekillerin hesabını burada yapıyoruz.
    public void UcBoyutluAlan() {
        System.out.println("\n3 Boyutlu Sekiller Sunlardir; Piramit , Silindir ve Kup ^_^ ");
        System.out.println("Piramitin Alan Hesabi icin 1 'e");
        System.out.println("Silindirin Alani icin 2 'ye ");
        System.out.println("Kupun Alani icin 3'e basiniz ");
        System.out.print("Tercihiniz: ");
        Scanner s=new Scanner(System.in);
        int tercih=s.nextInt();

        if(tercih == 1) {    //eğer tercih 1 e eşit ise bu blok çalışacaktır.
            System.out.print("Piramitin Taban Uzunlugunu Giriniz: ");
            int tabanUzunluk=s.nextInt();

            System.out.print("Piramitin Yuksekligini Giriniz: ");
            int h=s.nextInt();

            System.out.print("Piramitin Alani : ");
            piramit Piramit= new piramit(tabanUzunluk, h);
            Piramit.piramitAlan();}

        if(tercih == 2) {    //eğer tercih 2 ye eşit ise bu blok çalışacaktır.
            System.out.print("Silindirin Capini Giriniz: ");
            int çap=s.nextInt();

            System.out.print("Silindirin Yuksekligini Giriniz: ");
            int h=s.nextInt();

            System.out.print("Silindirin Alani: ");
            silindir Silindir=new silindir(çap,h);
            Silindir.silindirA();
        }

        if(tercih == 3) {    //eğer tercih 3 e eşit ise bu blok çalışacaktır.
            System.out.print("Kupun Kenar Uzunlugunu Giriniz: ");
            int kenar=s.nextInt();

            System.out.print("Kupun Alani: ");
            kup Küp=new kup(kenar);
            Küp.küpA();
        }
        else {   //eğer yukarıda ki seçenekler gerçekleşmez ise bu blok çalışacaktır.
            System.out.println("Lutfen Gecerli Tercihte Bulununuz....");
        }
    }
}



