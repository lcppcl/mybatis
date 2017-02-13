package com.java;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.java.mappers.StudentMapper;
import com.java.model.Student;
import com.java.util.SqlSessionFactoryUtil;


//�������ݿ�����
public class StudentTest {
	
	private static Logger logger = Logger.getLogger(StudentTest.class);
	
	public static void main(String[] args){
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();//�����ݿ�����
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);//ֱ�Ӳ�������ķ���
		Student student = new Student("����",13);
		int result = studentMapper.add(student);
		sqlSession.commit();//�ύ����
		if(result > 0){
			logger.info("��ӳɹ�");
		}
	}
}
