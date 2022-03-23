package Application;

import Data.*;

public class Application {
    public static void main(String[] args) {

        Acer acer = new Acer("Acer Aspire A514-53G", "Acer.Inc", "Intel Core i3-1005G1",
                "3", "Windows", "4 GB", "HDD", 2);
        System.out.println("Spesifikasi Laptop Acer");
        System.out.println(acer);
        acer.getWarna();
        acer.getLayar();


        Lenovo lenovo = new Lenovo("Lenovo Yoga C930-9KID", "Lenovo", "Intel Core i7",
                "7", "Windows", "16 GB", "SSD SATA", -1);
        System.out.println("\nSpesifikasi Laptop Lenovo");
        System.out.println(lenovo);
        lenovo.getWarna();
        lenovo.getLayar();
    }
}
