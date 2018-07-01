package com.cyan.dao;

import com.cyan.entity.Course;

import java.util.List;

public interface IClzDao {

    public List<Course> selectAll();

    public Course selectById(Integer id);

    public void update(Course course);


}
