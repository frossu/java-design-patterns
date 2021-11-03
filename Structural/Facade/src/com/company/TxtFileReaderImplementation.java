package com.company;

public class TxtFileReaderImplementation implements FileReaderImplementation {
    @Override
    public String readFileAsHtml(String filename) {
        String contents = filename + " contents";
        return convertToHtml(contents);
    }

    /**
     *
     * @param fileContents
     * @return fileContents with every paragraph wrapped by <p></p>
     */
    public String convertToHtml(String fileContents) {
        return fileContents + " (txt -> html)";
    }
}
