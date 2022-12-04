public class Perangkat {
    protected int ram;
    protected String drive;
    protected double processor;

    //constructor
    public Perangkat(int ram, String drive, double processor){
        this.ram = ram;
        this.drive = drive;
        this.processor = processor;
    }

    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" dan processor secepat "+processor+" Ghz");
    }
}