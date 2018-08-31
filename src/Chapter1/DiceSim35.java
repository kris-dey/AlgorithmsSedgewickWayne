package Chapter1;

import java.util.HashMap;
import java.util.Map;

public class DiceSim35 {

	public static Map<Integer, Double> h1 = new HashMap<>();

	public static void main(String[] args) {
		int N = 6000000;
		final int SIDES = 6;
		double[] dist = new double[2 * SIDES + 1];
		for (int n = 0; n < N; n++) {
			for (int i = 0; i <= SIDES; i++) {
				for (int j = 0; j <= SIDES; j++) {
					dist[i + j] += 1.0;
				}
			}
			for (int k = 0; k <= 2 * SIDES; k++) {
				dist[k] /= 36;
			}
		}
		for(int i = 0;i<2 * SIDES + 1;i++){
			System.out.println(i + " " + dist[i]);
		}
	}

}
