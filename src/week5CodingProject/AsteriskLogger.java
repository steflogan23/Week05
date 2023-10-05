package week5CodingProject;

import week5CodingProject.InterfaceClass.logger;

public class AsteriskLogger implements logger{

	@Override
	public void log(String userWord) {
		// TODO Auto-generated method stub
		System.out.println("***" + userWord + "***");
	}

	@Override
	public void error(String userWord) {
		// TODO Auto-generated method stub
		System.out.println("***************");
		System.out.println("***" + userWord + "***");
		System.out.println("***************");
	}


}
