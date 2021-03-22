package sem;

public class Util {

	/**
	 * Given a array of Integers   , 
	 * return a String with the first 
	 * biggest number on the right side of the array 
	 * EXAMPLE
	 * [X,Y,Z]
	 * IF X<Y<Z
	 * returns 
	 * x->y
	 * y-z
	 * z->-1 Z is the last Integer of the array
	 * */
	 
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
