public class PersonTester {
    public static void main(String[] args) {
        PersonWithName personWithName = Person::new;
        Person person = personWithName.get("Arijit", 21);

        System.out.println("Name : "+person.getName()+" Age: "+person.getAge());
    }
}
