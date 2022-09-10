import java.util.Vector;

public class kup {   // kup isimli bir sınıf oluşturduk.
    public int kenarUzunluk;
    public kup(int kenarUzunluk) {
        this.kenarUzunluk=kenarUzunluk;
    }

    public void küpA() {
        Vector küp=new Vector();				//Burada vektor kullanarak alan hesabı yapıyoruz.
        küp.add(kenarUzunluk);
        int kenar=(int)küp.get(0);
        System.out.println(6*(kenar*kenar));   //Kullanıcıya gerekli cevabı çıktı olarak veriyoruz.
    }
}
