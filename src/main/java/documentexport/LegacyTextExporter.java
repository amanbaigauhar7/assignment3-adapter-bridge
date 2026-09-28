package documentexport;

public class LegacyTextExporter {

    public int saveLegacyDocument(String content, String fileName, int formatCode) {
        if (content == null || content.isBlank()) {
            return -1;
        }

        if (fileName == null || fileName.isBlank()) {
            return -2;
        }

        System.out.println("Legacy system exporting document...");
        System.out.println("File: " + fileName + ".txt");
        System.out.println("Content: " + content);
        System.out.println("Format code: " + formatCode);

        return 0;
    }
}
