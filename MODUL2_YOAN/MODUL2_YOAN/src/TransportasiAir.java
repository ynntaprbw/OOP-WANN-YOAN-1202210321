public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;
    TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    public void informasi(){
        System.out.printf("Transportasi Air jenis tidak diketahui dengan kursi berjumlah %s dengan biaya sebesar Rp. \n",this.jumlahKursi,this.biaya );
    };
    public void berlayar(){
        System.out.println("Transportasi Air jenis yang tidak diketahui sedang berlayar);
    };
    public void berlabuh(){
        System.out.println(""Transportasi Air jenis yang tidak diketahui sedang berlabuh);
    }
}