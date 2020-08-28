package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface {

	@Override
	public boolean checkUser(User user) {

		if ((user.getAge() >= 18) && (user.getAge() <= 35) && ((user.getHeight() >= 155) && (user.getHeight() <= 170))
				&& ((user.getWeight() >= 55) && (user.getWeight() <= 90))) {
			return true;
		} else {

			return false;
		}

	}

	@Override
	public boolean checkQuizAnswer(String points) {

		int pointsNo;
		pointsNo = Integer.parseInt(points);
		if (pointsNo > 80)
			return true;
		else
			return false;

	}

	@Override
	public boolean basicEligibilityCheck(User user) {

		return checkUser(user);

	}

}
