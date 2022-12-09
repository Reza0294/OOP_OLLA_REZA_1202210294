package PBO;

public class Kapal {
    protected String mesin(
            int jumlahKursi,
            int biaya, String mesin) {
        super(jumlahKursi, biaya, mesin);
        this.mesin = mesin;
    }

    public void informasi() {
        String result = (mesin) ? "memiliki" : "Tidak memiliki";
        System.out.println("Kapal ini mempunyai biaya sebesar " + biaya + " jumlahKursi " + jumlahKursi + " dan mesin "
                + mesin + " cc");

    }

}
