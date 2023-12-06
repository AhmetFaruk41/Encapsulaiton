public class User {
    public  String name;
    public  static int counter=0;


    public User(String name){
        this.name = name;
        counter++;
    }
    static {
        int random = (int)(Math.random()*10);
        System.out.println("Random sayı: "+ random);
        counter = random;

    }
}
