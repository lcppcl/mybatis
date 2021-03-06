package com.java;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.mappers.GradeMapper;
import com.java.mappers.StudentMapper;
import com.java.model.Grade;
import com.java.model.Student;
import com.java.util.SqlSessionFactoryUtil;

public class GradeTest {
//测试一对多
	private static Logger logger=Logger.getLogger(StudentTest.class);
	private SqlSession sqlSession=null;
	private GradeMapper gradeMapper=null;
	
	/**
	 * 测试方法前调用
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		gradeMapper=sqlSession.getMapper(GradeMapper.class);
	}

	/**
	 * 测试方法后调用
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testFindGradeWithStudents() {
		logger.info("查询年级(带学生)");
		Grade grade=gradeMapper.findById(1);
		System.out.println(grade);
	}
	
}
