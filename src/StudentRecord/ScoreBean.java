package StudentRecord;

public class ScoreBean {
	
	String S_id,C_code,S_name;
	double F_score;

	public ScoreBean(String s_id,String s_name, String c_code, double f_score) {
		
		S_id = s_id;
		C_code = c_code;
		F_score = f_score;
		S_name = s_name;
	}

	public String getS_id() {
		return S_id;
	}
	public String getS_name() {
		return S_name;
	}

	public String getC_code() {
		return C_code;
	}

	public double getF_score() {
		return F_score;
	}

}
