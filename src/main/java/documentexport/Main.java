package documentexport;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose document type (report/certificate): ");
        String documentType = scanner.nextLine();

        System.out.print("Choose export format (pdf/html/legacy): ");
        String format = scanner.nextLine();

        try {
            DocumentExporter exporter = ExporterSelector.select(format);

            Document document;

            if (documentType.equalsIgnoreCase("report")) {
                document = new ReportDocument(exporter);
            } else if (documentType.equalsIgnoreCase("certificate")) {
                document = new CertificateDocument(exporter);
            } else {
                throw new IllegalArgumentException(
                        "Unsupported document type: " + documentType
                );
            }

            System.out.print("Enter file name: ");
            String fileName = scanner.nextLine();

            document.create(fileName);

            System.out.println("Export completed successfully.");

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Export failed: " + e.getMessage());
        }

        scanner.close();
    }
}