import java.util.Vector;

public class silindir {    //silindir isimli bir sınıf oluşturduk.
    public int çap;
    public int yükseklik;

    public silindir(int çap,int yükseklik) {
        this.çap=çap;
        this.yükseklik=yükseklik;
    }

    public void silindirA() {
        Vector silindir=new Vector();
        silindir.add(çap);
        silindir.add(yükseklik);					//Burada vektor kullanarak alan hesabı yapıyoruz.
        int çap=(int)silindir.get(0);
        int yükseklik=(int)silindir.get(1);
        System.out.println((int)(2*Math.PI*çap*(çap+yükseklik)));   //kullanıcıya gerekli cevabı çıktı olarak veriyoruz.
    }
}
