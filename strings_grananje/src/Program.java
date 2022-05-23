public class Program {
    public static void main(String[] args) {
        /*
        String s1 = "ac";
        String s2 = "ab";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.contains("c"));
        System.out.println(s1.indexOf("c"));
        */
        /*
        String username = "admin";
        String password = "1234";

        if(username.equals("admin") && password.equals("1234")) {
            System.out.println("Login success!");
        } else {
            System.out.println("Login fail!");
        }
        */
        String sample_text = """
         This is sample text. This text contains random words;
         Purpose of this text is to have word text in it's
         """;

        String search_phrase = "Text";

        String u_text = sample_text.toUpperCase();
        String u_search = search_phrase.toUpperCase();

        // I nacin
        if(u_text.contains(u_search)) {
            System.out.println("Phrase found!");
        } else {
            System.out.println("Phrase not found!");
        }

        // II nacin
        if(u_text.indexOf(u_search) != -1) {
            System.out.println("Phrase found!");
        } else {
            System.out.println("Phrase not found!");
        }
    }
}
