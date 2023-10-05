package week5CodingProject;

import week5CodingProject.InterfaceClass.logger;

public class SpacedLogger implements logger {

	@Override
	public void log(String userWord) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		if (userWord.length() > 0) {
			result.append(userWord.charAt(0));
			for (int i = 1; i < userWord.length(); i++) {
				result.append(" ");
				result.append(userWord.charAt(i)); 
			}
		}
		System.out.println(result);
	}

	@Override
	public void error(String userWord) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		if (userWord.length() > 0) {
			result.append(userWord.charAt(0));
			for (int i = 1; i < userWord.length(); i++) {
				result.append(" ");
				result.append(userWord.charAt(i)); 
			}
		}
		System.out.println("ERROR: " + result);
	}
		
	}
	


