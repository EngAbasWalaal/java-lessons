public class Pr14{

    public static void main(String[] args) {
     Qalab qalab=new Qalab();
     qalab.started();
     qalab.stopped();
     qalab.running();

     System.out.println("================================");

     Babur babur=new Babur();
     babur.started();
     babur.stopped();
     babur.running();
     babur.wiping();
     babur.ShowInfo();
    }
}