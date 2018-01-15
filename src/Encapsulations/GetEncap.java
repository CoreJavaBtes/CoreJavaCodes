package Encapsulations;

import javax.naming.Context;

public class GetEncap {
	
	public GetEncap(MyBean bean) {
		// TODO Auto-generated constructor stub
	
		System.out.println("Name :: "+bean.getName());
		System.out.println("Id :: "+bean.getId());
		System.out.println("XYZ :: "+bean.getXyz());
	}
	

}
