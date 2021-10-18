package fluentAPI;

import fluentAPI.Person;
import fluentAPI.PersonBuilder;
import fluentAPI.interfaces.Title;

import java.util.List;
import java.util.function.Function;

public class MainFluentApi {

    public static void main(String[] args) {

        //Package-private constructor is not accessible here, we must use the builder:
        Person p0 = new PersonBuilder()
                .withName("a")
                .withTitle(Title.PROF)
                .build();

        Person p1 = new PersonBuilder()
                .withName("b")
                .withTitle(Title.PROF)
                .build();

        Person p2 = new PersonBuilder()
                .withName("c")
                .withTitle(Title.PROF)
                .build();

        p0.addFriend(p1).addFriend(p2).sayHelloToFriends();
        p0.processFriends(listPerson->{
                listPerson.clear();
                return listPerson;
        }).sayHelloToFriends();
    }
}