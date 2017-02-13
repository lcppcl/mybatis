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

//�������ݵ���ɾ����
public class StudentTest2 {
	
	private static Logger logger = Logger.getLogger(StudentTest.class);
	private SqlSession sqlSession = null;//�����ݿ�����
	private StudentMapper studentMapper = null; //ӳ����
	@Before   //���Է���ִ��֮ǰ����
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper = sqlSession.getMapper(StudentMapper.class);
	}

	@After    //���Է���ִ��֮�����
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	/*@Test
	public void testAdd() {
		logger.info("���ѧ��");
		Student student = new Student("��",11);
		studentMapper.add(student);
		sqlSession.commit();//�ύ����
	}*/
	
	/*@Test
	public void testUpDate() {
		logger.info("�޸�ѧ��");
		Student student = new Student(4, "��yibhh",11);
		studentMapper.update(student);
		sqlSession.commit();//�ύ����
	}*/
	
	/*@Test
	public void testDelete() {
		logger.info("ɾ��ѧ��");
		studentMapper.delete(8);
		sqlSession.commit();//�ύ����
	}*/
	
	/*@Test
	public void testFindById() {
		logger.info("����ѧ��");
		Student student = studentMapper.findById(9);
		System.out.println(student);
	}*/
	
	@Test
	public void testFind() {
		logger.info("��������ѧ��");
		List<Student> studentList = studentMapper.find();
		for(Student s:studentList){
			System.out.println(s);
		}
	}
	
}
