package BuilderPattern;

/**
 * Created by siddhahastmohapatra on 28/01/17.
 */
public class Person {

    /*
    Using the builder pattern to solve the problem of
    telescopic constructors.
     */
    private final String name;
    private final String email;
    private final int age;
    private final String address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    private Person(Builder builder){
        this.address = builder.address;
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class Builder{

        private final String name;
        private final String email;
        private String address;
        private int age;

        public Builder(String name, String email){
            this.name = name;
            this.email = email;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }

}
