package com.java;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.mappers.StudentMapper;
import com.java.model.Student;
import com.java.util.SqlSessionFactoryUtil;

//测试数据库的一对一
public class StudentTest3 {

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


	@Test
	public void testFindStudentWithAddress() {
		logger.info("一对一查找学生表和地址信息表");
		Student student = studentMapper.findStudentWithAddress(1);
		System.out.println(student);
	}

}
