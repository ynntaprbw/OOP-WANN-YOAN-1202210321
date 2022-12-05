public class MainApp {
    public class MainApp {
        public static void main(String[] args) throws Exception {
            TranportasiAir unknown = new TransportasiAir("tidak diketahui",4,20000);
            Sampan lap = new Sampan("Sampan", 20, 50000, true);
            Kapal hp = new kapal("Kapal",50,10000,true);
            unknown.informasi();
            System.out.println();
            kapal.informasi();
            kapal.berlayar("Game Barbie");
            kapal.berlayar("akusukabarbie@gmail.com");
            kapal.berlabuh("akusukabarbie@gmail.com","ilovebarbie@gmail.com");
            System.out.println();
            hp.informasi();
            hp.telfon(6281329);
            hp.kirimSMS(6281329);
            hp.kirimSMS(6281215,6281215);
    
        }
    }
    