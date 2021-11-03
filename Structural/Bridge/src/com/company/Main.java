package com.company;

public class Main {

    public static void main(String[] args) {
        String markdownFile = "file.md";
        String htmlFile     = "file.html";

        ViewRendererAbstraction basicViewRenderer =
                new BasicViewRendererAbstraction(new HtmlFileReaderImplementation(), htmlFile);

        ViewRendererAbstraction headerFooterViewRenderer =
                new HeaderFooterViewRendererAbstraction(new MarkdownFileReaderImplementation(), markdownFile);

        basicViewRenderer.renderPage();
        System.out.println("\n");
        headerFooterViewRenderer.renderPage();
    }
}
