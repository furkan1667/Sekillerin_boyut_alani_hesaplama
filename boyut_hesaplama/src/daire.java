import java.util.Vector;

public class daire {     // daire isimli bir sınıf oluşturduk.
    public int yarıcap;

    public daire(int yarıcap) {		//daire sınıfı
        this.yarıcap=yarıcap;
    }
    public void daireA() {
        Vector daire=new Vector();    //Burada vektor kullanarak alan hesabı yapıyoruz.
        daire.add(yarıcap);
        int yarıcap=(int)daire.get(0);
        System.out.println((int)(Math.PI*(yarıcap*yarıcap)));    //Kullanıcıya gerekli cevabı çıktı olarak veriyoruz.
    }
}
