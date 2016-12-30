package zju.ningkai.service.impl;

import java.util.List;

import zju.ningkai.domain.Patient;
import zju.ningkai.service.PatientsService;
import zju.ningkai.util.DBHelper;

public class PatientsServiceImpl implements PatientsService {
	
    private DBHelper helper;
	@Override
	public List<Patient> getFollowups(String doctor, int type) {
		
		return null;
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
