public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;
    Perangkat(String drive,int ram,float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void informasi(){
        System.out.printf("Perangkat tidak Diketahui Memiliki Drive Tipe %s dengan RAM Sebesar %d dan Juga Memiliki Processor Secepat %.2f Ghz.\n",this.drive,this.ram,this.processor);
    }
}

