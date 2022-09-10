import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sekil sekil=new sekil();	//sekil sınıfını kullanabilmek için tanımladık.
        Scanner s=new Scanner(System.in);

        System.out.println("\nHangi Boyutun Seklinin Alanini Hesaplamak Istiyorsunuz; ");
        System.out.println("1 Boyutlu icin 1 'e ");
        System.out.println("2 Boyutlu icin 2 'ye ");       //kullanıcıdan bilgi almak için gerekli çıktıları veriyoruz.
        System.out.println("3 Boyutlu icin 3 'e basininiz");
        System.out.print("Tercihiniz: ");
        int tercih=s.nextInt();     //kullanıcıdan girdi alıyoruz.


        if(tercih==1) {       //eğer tercih 1 e eşit ise bu blok çalışacaktır.
            sekil.BirBoyutluAlan();
        }
        else if(tercih==2) {    //eğer tercih 2 ye eşit ise bu blok çalışacaktır.
            sekil.İkiBoyutluAlan();
        }
        else if(tercih==3) {     //eğer tercih 3 e eşit ise bu blok çalışacaktır.
            sekil.UcBoyutluAlan();
        }
        else {    //eğer tercih yukarıda ki seçeneklere uymuyorsa bu blok çalışacaktır.
            System.out.println("Lutfen gecerli tercih yapiniz...");
        }
    }
}

