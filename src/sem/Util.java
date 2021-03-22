package sem;

public class Util {

	public static String sem(int semArr[]) {
		String sem = "";

		if (semArr != null && semArr.length > 0) {
			for (int i = 0; i < semArr.length - 1; i++) {
				sem += semArr[i];
				int sm = semArr[i];
				sem += "->";

				for (int x = i + 1; x < semArr.length; x++) {
					if (sm < semArr[x]) {
						sm = semArr[x];
						x = semArr.length;
					}
				}

				if (sm == semArr[i])
					sem += -1;
				else
					sem += sm;
				
				
				sem += '\n';
			}

			sem += semArr[semArr.length - 1] + "->-1";
		}
		return sem;
	}
}
