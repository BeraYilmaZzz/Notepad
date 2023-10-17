import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir metin giriniz:");
        String input = scn.nextLine(); // Kullanıcıdan girdiyi aldık

        try {
            File notepad = new File("notepad.txt"); // notepad dosyasını oluşturduk

            FileWriter fileWriter = new FileWriter(notepad, true); // tekrar tekrar veri eklenebilmesi için true
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // println diyerek inputları satır satır kaydediyoruz
            printWriter.println(input);
            printWriter.close();

            FileReader fileReader = new FileReader(notepad); // Dosyayı okumak için FileReader'ı kullandık
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readnote;
            System.out.println("Notlar:");

            while ((readnote = bufferedReader.readLine()) != null) {
                System.out.println(readnote); // Dosyadan okunan her satırı ekrana yazdırdık
            }

            bufferedReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}