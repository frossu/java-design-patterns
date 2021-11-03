package com.company;

public class HeaderFooterViewRendererAbstraction extends BasicViewRendererAbstraction {
    public HeaderFooterViewRendererAbstraction(FileReaderImplementation fileReader, String filename) {
        super(fileReader, filename);
    }

    @Override
    public void renderPage() {
        String txt = this.fileReader.readFileAsHtml(this.filename);
        System.out.println("Header\n" +
                "================");
        System.out.println(txt);
        System.out.println("================\n" +
                "Footer");
    }
}
