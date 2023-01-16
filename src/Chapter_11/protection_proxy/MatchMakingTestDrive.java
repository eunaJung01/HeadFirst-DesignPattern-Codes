package Chapter_11.protection_proxy;

import Chapter_11.protection_proxy.handlers.NonOwnerInvocationHandler;
import Chapter_11.protection_proxy.handlers.OwnerInvocationHandler;
import Chapter_11.protection_proxy.persons.Person;
import Chapter_11.protection_proxy.persons.PersonImpl;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {

    HashMap<String, Person> datingDB = new HashMap<>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void drive() {
        // 1-1. 인물 정보를 DB로부터 가져옴
        Person joe = getPersonFromDatabase("Joe Javabean");

        // 1-2. 본인용 프록시 생성
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");

        // 1-3. 선호도 설정 시도 (본인용 프록시에서는 불가)
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getGeekRating());

        // 2-1. 타인용 프록시 생성
        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());

        // 2-2. 관심사 변경 시도 (타인용 프록시에서는 불가)
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }

        // 2-3. 선호도 설정
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
    }


    /**
     * TODO: 동적 프록시 생성 코드
     *
     * @param person Person 객체(진짜 주제)
     * @return 프록시
     * (프록시의 인터페이스 == 주제의 인터페이스)
     */
    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(), // person의 클래스 로더
                person.getClass().getInterfaces(), // 프록시에서 구현해야 하는 인터페이스
                new OwnerInvocationHandler(person)); // 호출 핸들러
    }

    Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    Person getPersonFromDatabase(String name) {
        return (Person) datingDB.get(name);
    }

    void initializeDatabase() {
        Person joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setGeekRating(7);
        datingDB.put(joe.getName(), joe);

        Person kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setGeekRating(6);
        datingDB.put(kelly.getName(), kelly);
    }

}
