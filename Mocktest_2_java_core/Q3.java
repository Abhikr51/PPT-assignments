class Person {
    private String name;
    private int age;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Abhijit Kumar");
        person.setAge(23);
        person.setAddress("Purulia , West Bengal");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
