public class Handphone extends Perangkat {
    protected boolean fingerprint;
    Handphone(String drive, int ram, float processor,boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    };
    public void informasi(){
        if(this.fingerprint){
            System.out.printf("Handphone ini Memiliki Drive Tipe %s dengan RAM Sebesar %d GB dan Menggunakan %.2f Ghz Processor. Handphone Ini Juga Memiliki Fingerprint Sensor.\n",this.drive,this.ram,this.processor);
        }
        else{
            System.out.printf("Handphone ini Memiliki Drive Tipe %s dengan RAM sebesar %d GB dan Menggunakan %.2f Ghz Processor.\n",this.drive,this.ram,this.processor);
        }
    };
    public void telfon(int no_hp){
        System.out.printf("Menyambungkan Telepon ke Nomor %d\n",no_hp);
    };
    public void kirimSMS(int no_hp){
        System.out.printf("Berhasil Mengirimkan SMS ke Nomor %d\n",no_hp);
    };
    public void kirimSMS(int no_hp1,int no_hp2){
        System.out.printf("Berhasil Mengirimkan SMS ke Nomor %d dan %d\n",no_hp1,no_hp2);
    };
    
}
