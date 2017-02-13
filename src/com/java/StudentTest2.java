package com.java;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.mappers.StudentMapper;
import com.java.model.Student;
import com.java.util.SqlSessionFactoryUtil;

//测试数据的增删查找
public class StudentTest2 {
	
	private static Logger logger = Logger.getLogger(StudentTest.class);
	private SqlSession sqlSession = null;//打开数据库连接
	private StudentMapper studentMapper = null; //映射器
	@Before   //测试方法执行之前调用
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper = sqlSession.getMapper(StudentMapper.class);
	}

	@After    //测试方法执行之后调用
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	/*@Test
	public void testAdd() {
		logger.info("添加学生");
		Student student = new Student("而",11);
		studentMapper.add(student);
		sqlSession.commit();//提交事物
	}*/
	
	/*@Test
	public void testUpDate() {
		logger.info("修改学生");
		Student student = new Student(4, "而yibhh",11);
		studentMapper.update(student);
		sqlSession.commit();//提交事物
	}*/
	
	/*@Test
	public void testDelete() {
		logger.info("删除学生");
		studentMapper.delete(8);
		sqlSession.commit();//提交事物
	}*/
	
	/*@Test
	public void testFindById() {
		logger.info("查找学生");
		Student student = studentMapper.findById(9);
		System.out.println(student);
	}*/
	
	@Test
	public void testFind() {
		logger.info("查找所有学生");
		List<Student> studentList = studentMapper.find();
		for(Student s:studentList){
			System.out.println(s);
		}
	}
	
}
