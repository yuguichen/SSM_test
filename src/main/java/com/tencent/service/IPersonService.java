package com.tencent.service;

import java.util.List;

import com.tencent.model.Person;

public interface IPersonService {
    /**
     * ����ȫ����person
     * @return
     */
    List<Person> loadPersons();
}
