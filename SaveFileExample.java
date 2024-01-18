import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveFileExample {

    public static void main(String[] args) {
        String content = "This is the content that will be saved to the file.";

        // Specify the file path where you want to save the file
        String filePath = "path/to/ganesh/ganesh.txt";

        // Try-with-resources statement to automatically close the streams
        try (FileOutputStream fos = new FileOutputStream(filePath);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            // Convert the content to bytes and write it to the file
            byte[] bytes = content.getBytes();
            bos.write(bytes);

            System.out.println("File saved successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
