package soal1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[] {"Apel", "Pisang", "Mangga", "Jeruk"};
        int counter = 0;
        while (counter < kumpulanBuah.length){
            System.out.println("Elemen ke - " + (counter + 1) + ": " + kumpulanBuah[counter]);
            counter++;
        }
    }
}