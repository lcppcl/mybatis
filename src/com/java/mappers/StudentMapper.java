package com.java.mappers;

import java.util.List;

import com.java.model.Student;
//映射

//接口
public interface StudentMapper {

	//添加
	public int add(Student student);
	//更新
	public int update(Student student);
	//刪除
	public int delete(Integer id);
	//查找
	public Student findById(Integer id);
	//查找所有的学生
	public List<Student> find();
	//查找级联   一对一
	public Student findStudentWithAddress(Integer id);
	//查找级联  一对多
	public Student findByGradeId(Integer id);
}
