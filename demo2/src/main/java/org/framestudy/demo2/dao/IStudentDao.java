package org.framestudy.demo2.dao;

import org.framestudy.demo2.bean.Student;

public interface IStudentDao {
	/**
	 * ����student��Ϣ
	 * @param student studentʵ��
	 * @return �ɹ�����true
	 */
	public boolean addStudent(Student student);
	/**
	 * ����student��Ϣ
	 * @param student student��id
	 * @return���³ɹ�����true
	 */
	public boolean updateStudent(Student student);
	/**
	 * ɾ��student
	 * @param student student����id
	 * @return�ɹ�����true
	 */
	public boolean delStudent(Student student);
}