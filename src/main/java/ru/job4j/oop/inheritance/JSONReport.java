package test.java.main.oop.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String result = "{" + System.lineSeparator()
                + "\"name\" : \"" + name + "\"," + System.lineSeparator()
                + "\"body\" : \"" + body + "\"" + System.lineSeparator()
                + "}";
        return result;
    }

    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        System.out.println(report.generate("Everybody", "Should study Java!"));
    }
}