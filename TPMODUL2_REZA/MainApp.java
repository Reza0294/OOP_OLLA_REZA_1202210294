public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat(16, "drive", 3.0);
        perangkat.informasi();

        System.out.println(" ");

        Laptop laptop = new Laptop(32, "Asus", 3.0, true);
        laptop.informasi();
        laptop.bukaGame("Apex legends");
        laptop.kirimEmail("reza@gmail.com");
        laptop.kirimEmail("reza@gmail.com", "reza@gmail.com");

        System.out.println(" ");

        Handphone hp = new Handphone(8, "rog2", 5.0, false);
        hp.informasi();
        hp.telfon(62812345);
        hp.kirimSMS(62876543);
        hp.kirimSMS(62876543, 628456321);
    }
}
