public class Usuario {
    public static void main(String[] args) throws Exception {
        

        
        SmartTv smartTv = new SmartTv();
        
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        
        System.out.println("A TV está ligada?: " + smartTv.ligada);
        System.out.println("A TV está com volume: " + smartTv.volume);
        System.out.println("A TV está no canal: " + smartTv.canal);
        System.out.println();

        
        
        
    }
}
