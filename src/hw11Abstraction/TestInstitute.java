package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		System.out.println("<---ColumbiaUniversity--->");
		ColumbiaUniversity co = new ColumbiaUniversity();
		co.biology();
		ColumbiaUniversity.chemistry();
		co.anatomyLab();
		co.biochemistryLab();
		ColumbiaUniversity.bloodLab();
		co.hygiene();
		co.caring();
		co.lawInfo();
		co.classSize();
		co.playGround();
		co.gymnasium();
		co.commonRoom();
		co.laboratory();
		co.languageClub();
		co.dorm();
		co.emergencyRoom();
		co.surgeryRoom();
		co.cafeteria();
		co.morgue();
		co.vocationalInfo();
		co.maths();
		co.aeronauticalInfo();
		co.mechanicalLab();
		co.computerLab();
		co.anthropology();

		System.out.println("<---MedicalSchool--->");
		MedicalSchool ms = new ColumbiaUniversity();
		ms.anatomyLab();
		ms.biochemistryLab();
		MedicalSchool.bloodLab();
		ms.hygiene();
		ms.caring();
		ms.maths();
		ms.mechanicalLab();
		ms.computerLab();
		ms.anthropology();
		ms.aeronauticalInfo();
		ms.lawInfo();

		System.out.println("<---University--->");
		University uni = new ColumbiaUniversity();
		uni.classSize();
		uni.playGround();
		uni.teacher();
		uni.gymnasium();
		University.library();
		uni.commonRoom();
		uni.laboratory();
		uni.languageClub();
		uni.dorm();
		uni.emergencyRoom();
		uni.surgeryRoom();
		uni.cafeteria();
		uni.morgue();

	}

}
