public class Ghost {

    private String name;
    private Integer age;

    public Ghost(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private String getSecret() {
        return "This is a secret message.";
    }

    public static Integer getNumber() {
        return 42;
    }

    public static String getWord() {
        return "Hello";
    }

}
