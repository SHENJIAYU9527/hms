package zju.ningkai.service.impl;

import java.util.ArrayList;
import java.util.List;

import zju.ningkai.dao.PatientDao;
import zju.ningkai.dao.impl.PatientDaoImpl;
import zju.ningkai.domain.Patient;
import zju.ningkai.domain.Patient_1;
import zju.ningkai.service.PatientsService;

public class PatientsServiceImpl implements PatientsService {
	
   
	@Override
	//0：待随访 ； 2:暂存
	public List<Patient> getFollowups(String doctor, int type) {
    	PatientDao dao=new PatientDaoImpl();
		List<Patient> patients=new ArrayList<Patient>();
		patients=dao.findFollowups(doctor,type);
		return patients;
	}

	@Override
	public List<Patient_1> getPatients(String doctor, int level) {
		PatientDao dao=new PatientDaoImpl();
		List<Patient_1> patients=new ArrayList<Patient_1>();
		patients=dao.findPatients(doctor, level);
		return patients;
	}

	@Override
	public List<Patient> getWarnings(String doctor, int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
