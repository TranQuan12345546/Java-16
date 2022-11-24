package secret;

public enum TopicQuestion {
    JAVA_CORE("Java Core"),
    OOP("OOP"),
    JAVA_THREADS("Java Threads"),
    JAVA_COLLECTIONS("Java Collections"),
    EXCEPTION("Exception");

    String value;

    TopicQuestion(String value) {
        this.value = value;
    }
}
