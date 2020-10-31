public class Band {

    String name;
    String title;
    int length;

    public static void main (String[]args){
        Band band = new Band();
        band.name = "Hazel O Connor";
        band.title="Will you";
        band.length=4;
        System.out.println(band.name);
        System.out.println(band.title);
        System.out.println(band.length);
    }
}