package com.ninuxGithub.data;

import com.ninuxGithub.bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenzm
 * @date 2019-1-14
 * @description 作用
 */
public class DB {

    public static List<Person> persons = new ArrayList<>();

    static {
        persons.add(new Person("1001", "jerry", "america", 19));
        persons.add(new Person("1002", "tony", "england", 19));
        persons.add(new Person("1003", "tom", "xxx", 19));
        persons.add(new Person("1004", "cat", "america", 19));
    }
}
