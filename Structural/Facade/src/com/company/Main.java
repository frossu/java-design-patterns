package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
//        String markdownFile = "file.md";
//        String htmlFile     = "file.html";
//
//        ViewRendererAbstraction basicViewRenderer =
//                new BasicViewRendererAbstraction(new HtmlFileReaderImplementation(), htmlFile);
//
//        ViewRendererAbstraction headerFooterViewRenderer =
//                new HeaderFooterViewRendererAbstraction(new MarkdownFileReaderImplementation(), markdownFile);
//
//        basicViewRenderer.renderPage();
//        System.out.println("\n");
//        headerFooterViewRenderer.renderPage();

        ViewRendererFacade viewRenderer = new ViewRendererFacade();
        viewRenderer.renderPage("file.html");
        System.out.println();
        viewRenderer.renderPage("file.md", true);
        System.out.println();
        viewRenderer.renderPage("filetxt");
    }
}
