package zju.ningkai.service.impl;

import java.util.List;

import zju.ningkai.domain.BP;
import zju.ningkai.domain.BodySign;
import zju.ningkai.domain.Discomfort;
import zju.ningkai.domain.FollowupHis;
import zju.ningkai.domain.HR;
import zju.ningkai.domain.HypertensionHis;
import zju.ningkai.domain.Level;
import zju.ningkai.domain.ManagePlan;
import zju.ningkai.domain.Medicine;
import zju.ningkai.domain.Weight;
import zju.ningkai.service.PatientDataService;
import zju.ningkai.util.DBHelper;

public class PatientDataServiceImpl implements PatientDataService {

	private DBHelper helper;

	public PatientDataServiceImpl(DBHelper helper) {
		this.helper = helper;
	}

	@Override
	public List<BP> getBPData(String patientId, String start, String end) {

		return null;
	}

	@Override
	public List<Weight> getWeightData(String patientId, String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HR> getHRData(String patientId, String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Medicine> getMedicationData(String patientId, String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Discomfort> getDiscomfortData(String patientId, String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FollowupHis> getFollowupData(String patientId, String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BodySign> getBodySignData(String patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ManagePlan> getManagePlanData(String patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HypertensionHis> getHypertensionHisData(String patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Level getLevelData(String patientId) {
	
		return null;
	}

}
