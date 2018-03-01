package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;

public class DemoBean {
	public static void main(String[] args) {
		
		ArrayList<Bean> arrlst = new ArrayList<Bean>();
	
		Bean bean = new Bean(3, 23,"ABC");
		Bean bean1 = new Bean(33, 33, "CK");
		Bean bean2 = new Bean(32, 34, "Hamirpur");
	
		arrlst.add(bean);
		arrlst.add(bean1);
		arrlst.add(bean2);
		
		Collections.sort(arrlst);
		for (int i = 0; i < arrlst.size(); i++) {
			
			System.out.println("Id ::"+arrlst.get(i).getId());
			System.out.println("name ::"+arrlst.get(i).getName());
		
			System.out.println("Age ::"+arrlst.get(i).getAge());
		}

		}

}
