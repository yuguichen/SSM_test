package com.tencent.dao;

import java.util.List;

import com.tencent.model.Person;

public interface PersonMapper {

	/**
     * ����һ����¼
     * @param person
     */
    void insert(Person person);
    
    /**
     * ��ѯ����
     * @return
     */
    List<Person> queryAll();

}
