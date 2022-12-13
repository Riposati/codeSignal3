package codeSignal3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class Point {
	
	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

public class Main {

	static double solution(int[][] p) {

		List<Point> pontos = new ArrayList<>();
//		List<Double> distancesBetweenPoints = new ArrayList<>();

//		System.out.println(p.length);

		for (int i = 0; i < p.length; i++) {

			int[] v = p[i];

			for (int j = 0; j < v.length - 1; j++) {

				pontos.add(new Point(v[j], v[j + 1]));
//				System.out.print(v[j] + " ");
			}
		}

		double euclides = 0;
		double minDist = Double.POSITIVE_INFINITY;

		for (int i = 0; i < pontos.size(); i++) {

			// System.out.println(pontos.get(i));

			for (int j = 0; j < pontos.size(); j++) {

				euclides = Math.sqrt(Math.pow((pontos.get(j).x - pontos.get(i).x), 2)
						+ Math.pow((pontos.get(j).y - pontos.get(i).y), 2));

//				System.out.println(pontos.get(i));
//				System.out.println(pontos.get(j));
//				System.out.println(euclides);
				
				if (euclides != 0.0) {
					//distancesBetweenPoints.add(euclides);
					if(euclides < minDist)
						minDist = euclides;
				}
			}
		}

//		System.out.println(pontos);
		
//		System.out.println(distancesBetweenPoints);

		//Collections.sort(distancesBetweenPoints);

		//System.out.printf("%.9f", distancesBetweenPoints.get(0));

		//return distancesBetweenPoints.get(0);
		
		return minDist;
	} 

	public static void main(String[] args) {

		int[][] p = { { 0, 11 }, { -7, 1 }, { -5, -3 }, {0,-3} , {0,1}, {-5, -1} };
		
		int[][] p2 = { { 4, 3 }, { -1, -3 }, { 5 ,2 }, { 0, -2 } };
		
		int[][] p3 = { { 5, 3 }, { 0, 2 }, { -1 ,-3 }, { 7, -9 }, { 3, -6 } };
		
		int[][] p4 = { {0, 11}, {-7, 1}, {-5, -3} };
		
		int[][] p5 = {{2, 3}, {12, 30}, {40, 50}, {5, 1}, {12, 10}, {3, 4}};

		System.out.printf(String.format(Locale.ROOT, "%.9f\n",solution(p5)));
	}
}
