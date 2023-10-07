import java.io.FileReader;
import java.io.FileWriter;

// Reading text file
// public class TextFile {
//     public static void main(String[] args) {
//         FileReader fr = null;
//         int memory = 0;
//         try {
//             fr = new FileReader("source.txt");
//             int c;
//             while ((c = fr.read()) != -1) {   //-1 = EOF
//                 System.out.print((char) c);
//                 memory++;
//             }
//         } catch (Exception e) {
//             System.err.println("Error: " + e.getMessage());
//         } finally {
//             try {
//                 if (fr != null) fr.close();
//             } catch (Exception e) {
//                 System.err.println("Error: " + e.getMessage());
//             }
//         }
//         System.out.println("\nMemory: " + memory + " bytes");
//     }
// }

// Writing text file
// public class TextFile {
//     public static void main(String[] args) {
//         FileWriter fw = null;
//         try {
//             fw = new FileWriter("target.txt");
//             fw.write(System.console().readLine());
//             fw.close();
//         } catch (Exception e) {
//             System.err.println("Error: " + e.getMessage());
//         } finally {
//             try {
//                 if (fw != null) fw.close();
//             } catch (Exception e) {
//                 System.err.println("Error: " + e.getMessage());
//             }
//         }
//     }
// }

// Copying text file to another
public class TextFile {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        int memory = 0;
        try {
            fr = new FileReader("source.txt");
            fw = new FileWriter("target.txt", true);
            int c;
            fw.write("\n\n");
            while ((c = fr.read()) != -1) {
                fw.write(c);
                memory++;
            }
            System.out.println("File copied successfully");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fr != null) fr.close();
                if (fw != null) fw.close();
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        System.out.println("\nMemory: " + memory + " bytes");
    }
}