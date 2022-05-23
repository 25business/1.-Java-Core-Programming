public class Program {
    public static void main(String[] args) {

        Person p = new Person();
        p.first_name = "Branislav";
        p.last_name = "Mihajlovic";
        p.year_of_birth = 2001;

        System.out.printf("""
                First name: %s
                Last name: %s
                Year of birth: %d
                \n""", p.first_name, p.last_name, p.year_of_birth);

        Person p2 = new Person();
        p2.first_name = "Bojan";
        p2.last_name = "Minic";
        p2.year_of_birth = 1995;

        System.out.printf("""
                First name: %s
                Last name: %s
                Year of birth: %d
                \n""", p2.first_name, p2.last_name, p2.year_of_birth);

        if(p.isOlderThan(p2)) {
            System.out.printf("Is older %s %s.\n", p.first_name, p.last_name);
        } else {
            System.out.printf("Is older %s %s.\n", p2.first_name, p2.last_name);
        }

        if(p.isAdult()) {
            System.out.printf("%s %s is adult\n", p.first_name, p.last_name);
        } else {
            System.out.printf("%s %s is a minor\n", p.first_name, p.last_name);
        }

        System.out.printf("%s %s has %d years", p.first_name, p.last_name, p.getAge());

    }
}
