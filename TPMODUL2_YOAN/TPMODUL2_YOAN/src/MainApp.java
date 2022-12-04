public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat unknown = new Perangkat("Sandisk",8,3.8f);
        Laptop lap = new Laptop("seagate", 8, 2.4f, true);
        Handphone hp = new Handphone("Adata",8,1.8f,true);
        unknown.informasi();
        System.out.println();
        lap.informasi();
        lap.bukaGame("Game Barbie");
        lap.kirimEmail("akusukabarbie@gmail.com");
        lap.kirimEmail("akusukabarbie@gmail.com","ilovebarbie@gmail.com");
        System.out.println();
        hp.informasi();
        hp.telfon(6281329);
        hp.kirimSMS(6281329);
        hp.kirimSMS(6281215,6281215);

    }
}
