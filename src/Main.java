// Bir string i içerisinde geçen "," lere göre ayırıp array haline getirmeniz gerekiyor.
// Bölme işlemi sonucunda oluşan array uzunluğu ve tüm bölünen değerler ekrana yazdırılacaktır
public class Main {
    public static void main(String[] args) {
        String dersListesi = "Matematik,Fizik,İngilizce,Programlamanın Temelleri";
        String [] array = dersListesi.split(",");

        System.out.println("Array uzunluğu" + array.length); // Array uzunluğu

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}