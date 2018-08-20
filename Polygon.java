package com.inapp.firstjava.util.interfce;

public abstract class Polygon implements PolygonAreaCal,PolygonPerimeterCal {
	
	
		private double[] sides;

		@Override
		public double calPerimeter() {
			double perimeter = 0;
			if(sides != null && sides.length >0){
				for (int i = 0; i < sides.length; i++) {
					perimeter = perimeter + sides[i];
				}
			}
			return perimeter;
		}

		public double[] getSides() {
			return sides;
		}

		public void setSides(double[] sides) {
			this.sides = sides;
		}
		
		
		
	}


