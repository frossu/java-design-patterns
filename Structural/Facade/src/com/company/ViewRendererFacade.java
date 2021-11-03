package com.company;

import org.jetbrains.annotations.NotNull;

class ViewRendererFacade {

    void renderPage(String filename, boolean extended) throws Exception{
        ViewRendererAbstraction viewRenderer;

        if (extended) {
            viewRenderer = new HeaderFooterViewRendererAbstraction(reader(filename), filename);
        } else {
            viewRenderer = new BasicViewRendererAbstraction(reader(filename), filename);
        }

        viewRenderer.renderPage();
    }

    void renderPage(String filename) throws Exception {
        renderPage(filename, false);
    }

    private FileReaderImplementation reader(@NotNull String filename) throws Exception {
        FileReaderImplementation reader;
        if (filename.endsWith(".txt")) {
            reader = new TxtFileReaderImplementation();
        } else if (filename.endsWith(".md")) {
            reader = new MarkdownFileReaderImplementation();
        } else if (filename.endsWith(".html")) {
            reader = new HtmlFileReaderImplementation();
        } else {
            throw new Exception("Unsupported file format");
        }
        return reader;
    }
}