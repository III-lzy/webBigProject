package com.cyan.service;

import com.cyan.entity.Course;

import java.util.List;

public interface IClzService {

    public List<Course> getAllClz();

    public Course getClzById(Integer id);
    public void update(Course course);

}
