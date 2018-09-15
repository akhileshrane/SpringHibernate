package com.dao;

import java.util.List;
import com.beans.Student;

public interface StudentDao {
	public void addStudent(Student student);
	
	public Student getStudent(Integer id);
	
	public List<Student> listOfStudents();
	
	public void delete(Integer id);
	
	public void update(Integer id, Integer age);
	
}
