package com.java;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.java.mappers.StudentMapper;
import com.java.model.Student;
import com.java.util.SqlSessionFactoryUtil;


//测试数据库连接
public class StudentTest {
	
	private static Logger logger = Logger.getLogger(StudentTest.class);
	
	public static void main(String[] args){
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();//打开数据库连接
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);//直接操作里面的方法
		Student student = new Student("明明",13);
		int result = studentMapper.add(student);
		sqlSession.commit();//提交事物
		if(result > 0){
			logger.info("添加成功");
		}
	}
}
