public class Laptop extends Perangkat{
    protected boolean webcam;
    Laptop(String drive, int ram, float processor,boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    public void informasi(){
        if(this.webcam){
            System.out.printf("Laptop ini Memiliki Drive Tipe %s dengan RAM Sebesar %d GB dan Processor Secepat %.2f Ghz. Selain Itu Laptop Ini Juga Memiliki Webcam\n",this.drive,this.ram,this.processor);
        }
        else{
            System.out.printf("Laptop ini Memiliki Drive Tipe %s dengan RAM Sebesar %d GB dan Processor Secepat %.2f Ghz. Selain Itu Laptop Ini tidak Dilengkapi dengan Webcam\n",this.drive,this.ram,this.processor);
        }
    };
    public void bukaGame(String nama_game){
        System.out.printf("Laptop Berhasil Membuka Game %s\n",nama_game);
    };
    public void kirimEmail(String email1){
        System.out.printf("Berhasil Kirim Email Kepada %s\n",email1);
    };
    public void kirimEmail(String email1,String email2){
        System.out.printf("Berhasil Kirim Email Kepada %s dan %s\n",email1,email2);
    }
}
