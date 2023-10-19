public class Pr25{
    public static void main(String[] args) {
        String filename="ttdocument.pdf";
        boolean startsWithDoc=filename.startsWith("doc");
        boolean endsWithPdf=filename.endsWith("pdf");

        System.out.println(startsWithDoc);
        System.out.println(endsWithPdf);
    }
}