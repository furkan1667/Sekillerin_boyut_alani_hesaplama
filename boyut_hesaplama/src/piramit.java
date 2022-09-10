import java.util.Vector;

public class piramit {      //piramit isimli bir sınıf oluşturduk.
    public int tabanUzunluk;
    public int yükseklik;

    public piramit(int tabanUzunluk,int yükseklik) {
        this.tabanUzunluk=tabanUzunluk;
        this.yükseklik=yükseklik;
    }

    public void piramitAlan() {
        Vector piramit=new Vector();
        piramit.add(tabanUzunluk);			//Burada vektor kullanarak alan hesabı yapıyoruz.

        int tabanUzunluk=(int)piramit.get(0);
        int yükseklik=(int)piramit.get(1);
        int işlem=(int) Math.sqrt((tabanUzunluk*tabanUzunluk)+(4*(yükseklik*yükseklik)));	//Alan Hesabı için gerekli işlemleri yapıyoruz.
        System.out.println(tabanUzunluk*(tabanUzunluk+işlem));   //kullanıcıya gerekli cevabı çıktı olarak veriyoruz.
    }
}
