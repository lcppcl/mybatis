package com.java.mappers;

import java.util.List;

import com.java.model.Student;
//ӳ��

//�ӿ�
public interface StudentMapper {

	//���
	public int add(Student student);
	//����
	public int update(Student student);
	//�h��
	public int delete(Integer id);
	//����
	public Student findById(Integer id);
	//�������е�ѧ��
	public List<Student> find();
	//���Ҽ���   һ��һ
	public Student findStudentWithAddress(Integer id);
	//���Ҽ���  һ�Զ�
	public Student findByGradeId(Integer id);
}
