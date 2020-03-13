package data_structure.hashtable.hashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsHashCodeChallenge {

    public static void main(String... doYourBest) {
        System.out.println(new Person("Bart").equals(new Person("Bart")));
        Person overriddenHomer = new Person("Homer") {
            public int hashCode() {
                return 1;
            }
        };
//        
        //Simpson overriddenHomer = new Simpson("Homer");

        System.out.println(new Person("Homer").equals(overriddenHomer));

       
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            Person other = (Person) obj;
            return this.name.equals(other.name) &&
                    this.hashCode() == other.hashCode();
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

}