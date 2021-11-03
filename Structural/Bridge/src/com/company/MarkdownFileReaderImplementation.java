package com.company;

public class MarkdownFileReaderImplementation implements FileReaderImplementation {
    @Override
    public String readFileAsHtml(String filename) {
        // markdown specific reading of the file
        String contents = filename + " contents";
        return convertToHtml(contents);
    }

    /**
     * @param fileContents
     * @return fileContents with **text** replaced to <b>text</b>, __text__ to <i>text</i>, etc.
     */
    public String convertToHtml(String fileContents) {
        return fileContents + " (md converted to html)";
    }
}
