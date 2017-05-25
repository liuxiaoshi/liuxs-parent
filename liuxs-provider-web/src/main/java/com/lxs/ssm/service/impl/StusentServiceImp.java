package com.lxs.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxs.ssm.bean.Student;
import com.lxs.ssm.dao.StudentMapper;
import com.lxs.ssm.service.IStudentService;


@Service("studService")
public class StusentServiceImp implements IStudentService {

	@Autowired
	StudentMapper studentMapper;
	
	public List<Student> getAllStudents() {
		return studentMapper.selectByExample(null);
	}

}
