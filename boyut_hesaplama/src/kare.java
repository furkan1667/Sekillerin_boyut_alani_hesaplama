import java.util.Vector;

class kare{     //kare isminde bir sınıf oluşturduk.
    public int kısaKenar;
    public kare(int kısaKenar) {
        this.kısaKenar=kısaKenar;
    }

    public void kareA() {   //kareAlan isimli bir metod oluşturduk.

        Vector kare=new Vector();	//Burada vektor kullanarak alan hesabı yapıyoruz.
        kare.add(kısaKenar);
        int sonuc=(int)kare.get(0);
        System.out.println(sonuc*sonuc);    //Burada karenin bütün kenarları aynı olduğu için iki kenarı çarpıyoruz.
    }
}