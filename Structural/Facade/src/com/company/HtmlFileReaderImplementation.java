package com.company;

public class HtmlFileReaderImplementation implements FileReaderImplementation {
    @Override
    public String readFileAsHtml(String filename) {
        return filename + " contents";
    }
}
