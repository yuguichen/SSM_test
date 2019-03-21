package com.tencent.service;

import java.util.List;

import com.tencent.model.Person;

public interface IPersonService {
    /**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}
