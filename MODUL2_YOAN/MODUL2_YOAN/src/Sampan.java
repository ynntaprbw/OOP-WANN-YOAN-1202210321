public class Sampan extends TransportasiAir{
    protected int layar;
    Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya, layar)
        this.layar = layar
    };
    public void informasi(){
        public void informasi(){
            System.out.printf("Transportasi Air jenis Sampan dengan kursi berjumlah %s didtetapkan dengan biaya sebesar Rp %d.\n",this.layar);
        }
        public void berlayar(){
            System.out.printf();
        }
        public void berlabuh(){
            System.out.printf();
        }
        public void berlabuh(int jangkar){
            System.out.printf();
        }
    }
}
