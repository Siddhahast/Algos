package lambda_expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by siddhahastmohapatra on 30/04/17.
 */
public class StandardFunctionalInterface {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Siddhahast", "Mohapatra", 28),
                new Person("Suraj", "Dash", 27),
                new Person("Swayambhu", "Panda", 28),
                new Person("Suman", "Dikshit", 28),
                new Person("Sushrut", "Chakraborty", 27)
        );


        Collections.sort(people, (Person p1, Person p2)-> p1.getFirstName().compareTo(p2.getFirstName()));

        printPredicateConditionally(people, p->p.getLastName().startsWith("C"), p-> System.out.println(p));

    }

    private static void printAllPeople(List<Person> people){
        for (Person p: people){
            System.out.println(p);
        }
    }

    private static boolean startsWith(Person person, char c){
        return person.getLastName().charAt(0)==c;
    }

    private static void printConditionally(List<Person> people, Condition condition){
        for (Person person:people){
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }

    interface Condition{
        public boolean test(Person p);
    }

    private static void printPredicateConditionally(List<Person> people, Predicate<Person> personPredicate, Consumer<Person> consumer){
        for (Person person:people){
            if(personPredicate.test(person)){
                consumer.accept(person);
            }
        }
    }

}
