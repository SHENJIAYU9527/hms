package zju.ningkai.service.impl;

import java.util.ArrayList;
import java.util.List;

import zju.ningkai.dao.PatientDao;
import zju.ningkai.domain.Patient;
import zju.ningkai.service.PatientsService;

public class PatientsServiceImpl implements PatientsService {
	
    private PatientDao dao;
	@Override
	//0：待随访 ； 2:暂存
	public List<Patient> getFollowups(String doctor, int type) {
		List<Patient> patients=new ArrayList<Patient>();
		patients=dao.findFollowups(doctor,type);
		return patients;
	}

	@Override
	public List<Patient> getPatients(String doctor, int level) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> getWarnings(String doctor, int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
