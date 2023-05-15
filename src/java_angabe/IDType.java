package java_angabe;

public enum IDType {
    
    ISBN("International Standard Book Number"),
    ISSN("International Standard Serial Number"),
    ISAN("International Standard Audiovisual Number");

    private String description;

    private IDType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
}
