public class Laptop extends Perangkat {
    protected boolean webcam;

    //constructor
    public Laptop(int ram, String drive, double processor, boolean webcam){
        super(ram, drive, processor);
        this.webcam = webcam;
    }

    //override function dari parent
    @Override
    public void informasi(){
        String result = (webcam) ? "memiliki" : "Tidak memiliki";
        System.out.println("Laptop ini memiliki driver tipe "+drive+" ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz.Selain itu laptop ini "+result+" webcam");
    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game "+nama_game);
    }

    // overloading: 2 nama function sama dengan parameter berbeda
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim ke "+email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("laptop berhasil kirim email ke "+email1+" dan "+email2);
    }
}