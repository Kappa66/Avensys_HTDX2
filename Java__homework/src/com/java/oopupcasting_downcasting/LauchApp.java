package com.java.oopupcasting_downcasting;

class Teacher {
	void markAttendance() {
		System.out.println("Teacher is marking attendance");
	}

	void teach() {
		System.out.println("Teacher is teaching");
	}

	public void doExp() {
		System.out.println("Teacher doing experiment");
	}

}

class PhysicTeacher extends Teacher {

	@Override
	void teach() {
		System.out.println("Physics teacher is teaching");
	}

	@Override
	public void doExp() {
		System.out.println("physic teacher doing experiment");
	}

}

class ChemistryTeacher extends Teacher {

	@Override
	void teach() {
		System.out.println("Chemistry teacher is teaching");
	}

	@Override
	public void doExp() {
		System.out.println("Chemistry teacher doing experiment");
	}

}

class BiologyTeacher extends Teacher {

	@Override
	void teach() {
		System.out.println("Biology teacher is teaching");
	}

	@Override
	public void doExp() {
		System.out.println("Biology teacher doing experiment");
	}

}

class College {
	public void acceptTeacher(Teacher teacher) {
		teacher.teach();
		teacher.doExp();
	}
}
public class LauchApp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PhysicTeacher pt = new PhysicTeacher();
        ChemistryTeacher ct = new ChemistryTeacher();
        BiologyTeacher bt = new BiologyTeacher();
        Teacher ref = new Teacher();
        ref = pt; // Up casting
        ref.teach();
        ((PhysicTeacher) ref).doExp(); // Temp down casting

        College college = new College();
        college.acceptTeacher(pt);
        college.acceptTeacher(ct);
        college.acceptTeacher(bt);
    }
}
