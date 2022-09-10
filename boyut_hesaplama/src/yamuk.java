import java.util.Vector;

public class yamuk {     //yamuk isimli sınıf oluşturduk.
    public int altTaban;
    public int üstTaban;     //açık bir şekilde yani public bir şekilde yamuğun alanı için gerekli bilgileri girdik.
    public int yükseklik;
    public yamuk(int altTaban,int üstTaban,int yükseklik){
        this.altTaban=altTaban;
        this.üstTaban=üstTaban;
        this.yükseklik=yükseklik;
    }
    public void yamukA() {
        Vector yamuk=new Vector();
        yamuk.add(altTaban);				//Burada vektor kullanarak alan hesabı yapıyoruz.
        yamuk.add(üstTaban);
        yamuk.add(yükseklik);
        int deger1=(int)yamuk.get(0);
        int deger2=(int)yamuk.get(1);		//Hepsini indexine göre bir değere atadık.
        int deger3=(int)yamuk.get(2);
        System.out.println(((deger1+deger2)*deger3)/2);    //Kullanıcıya gerekli cevabı çıktı veriyoruz.
    }
}
