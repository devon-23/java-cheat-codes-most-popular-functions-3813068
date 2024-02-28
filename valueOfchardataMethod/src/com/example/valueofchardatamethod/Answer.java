package com.example.valueofchardatamethod;

public class Answer {

    private char[] data;

    public Answer(char[] data) {
        this.data = data;
    }

    // Creates a String from the original character array
    public String createString() {
        // Explain that valueOf(char[] data) converts an array to a String
        return String.valueOf(data);
    }

    // Manipulates the data before creating a String (optional)
    public String createFormattedString(char replacement, int startIndex, int endIndex) {
        // Explain custom formatting by modifying the data
        for (int i = startIndex; i < endIndex; i++) {
            data[i] = replacement;
        }
        return String.valueOf(data);
    }

    // Access the original data (optional)
    public char[] getOriginalData() {
        return data;
    }
}
