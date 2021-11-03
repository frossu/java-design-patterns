package com.company;


public class BasicViewRendererAbstraction implements ViewRendererAbstraction {
    protected FileReaderImplementation fileReader;
    protected String filename;
    public BasicViewRendererAbstraction(FileReaderImplementation fileReader, String filename) {
        this.fileReader = fileReader;
        this.filename = filename;
    }

    @Override
    public void renderPage() {
        String txt = fileReader.readFileAsHtml(filename);
        System.out.println(txt);
    }

    public FileReaderImplementation getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReaderImplementation fileReader) {
        this.fileReader = fileReader;
    }
}
