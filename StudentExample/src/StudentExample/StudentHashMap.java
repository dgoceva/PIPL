package StudentExample;

import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;

public class StudentHashMap {

	private HashMap<Integer, StudentInfo> groupByFNo;
	private HashMap<String, List<StudentInfo>> groupByName;

	public HashMap<Integer, StudentInfo> getGroupByFNo() {
		return groupByFNo;
	}

	public void setGroupByFNo(HashMap<Integer, StudentInfo> groupByFNo) {
		this.groupByFNo = groupByFNo;
	}

	public HashMap<String, List<StudentInfo>> getGroupByName() {
		return groupByName;
	}

	public void setGroupByName(HashMap<String, List<StudentInfo>> groupByName) {
		this.groupByName = groupByName;
	}

	public StudentHashMap() {
		// TODO Auto-generated constructor stub
		groupByFNo = new HashMap<Integer, StudentInfo>();
		groupByName = new HashMap<String, List<StudentInfo>>();
	}

	public void addStudent(StudentInfo st) {
		groupByFNo.put(st.getFnom(), st);
		List<StudentInfo> list = groupByName.get(st.getIme());
		if (list == null)
			list = new LinkedList<StudentInfo>();
		list.add(st);
	}

	public void deleteByName(String ime) {
		groupByFNo.remove(groupByName.get(ime).get(0).getFnom());
		deleteStudent(ime);
	}

	public void deleteByFNom(int fnom) {
		groupByFNo.remove(fnom);
		deleteStudent(groupByFNo.get(fnom).getIme());
	}

	private void deleteStudent(String ime) {
		List<StudentInfo> list = groupByName.get(ime);
		list.remove(0);
		if (list == null)
			groupByName.remove(ime);
	}

	public void deleteByNameAll(String ime) {
		List<StudentInfo> list = groupByName.get(ime);
		if (list != null)
			for (StudentInfo st : list) {
				groupByFNo.remove(st.getFnom());
			}
		groupByName.remove(ime);
	}
}
