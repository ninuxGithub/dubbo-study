package com.ninuxGithub.service;

import com.ninuxGithub.bean.Person;
import com.ninuxGithub.data.DB;

/**
 * @author shenzm
 * @date 2019-1-14
 * @description 作用
 */
public class ApiServiceImpl implements ApiService {


    @Override
    public Person findPersonByID(String pid) {
        return DB.persons.stream().filter(p -> p.getId().equals(pid)).findFirst().orElse(null);
    }
}
