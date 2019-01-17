package com.ninuxGithub.service;

import com.ninuxGithub.bean.Person;

/**
 * @author shenzm
 * @date 2019-1-14
 * @description 作用
 */
public interface ApiService {

    public Person findPersonByID(String pid);

}
