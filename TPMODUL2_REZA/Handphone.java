public class Handphone extends Perangkat {
    protected boolean fingerprint;

    //constructor
    public Handphone(int ram, String drive, double processor, boolean fingerprint){
        super(ram, drive, processor);
        this.fingerprint = fingerprint;
    }

    //override function dari parent
    @Override
    public void informasi(){
        String result = (fingerprint) ? "memiliki" : "Tidak memiliki";
        System.out.println("handphone ini memiliki driver tipe "+drive+" ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz.Selain itu handphone ini "+result+" fingerprint");
    }

    public void telfon(int no_hp){
        System.out.println("handphone berhasil menelfon ke "+no_hp);
    }

    // overloading: 2 nama function sama dengan parameter berbeda
    public void kirimSMS(int no_hp){
        System.out.println("handphone berhasil kirim sms ke "+no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("handphone berhasil kirim sms ke "+no_hp1+" dan "+no_hp2);
    }
}