class ColorConversion {
	public static void main(String[] args) {
		/*RGB to CMYK:
		Standard RGB:
		r = R / 255
		g = G / 255
		b = B / 255

		w = max(r, g, b)

		c = (w − r) / w
		m = (w − g) / w
		y = (w − b) / w
		k = 1 − w
		*/

		double R = Double.parseDouble(args[0]);
		double G = Double.parseDouble(args[1]);
		double B = Double.parseDouble(args[2]);

		double r = R / 255;
		double g = G / 255;
		double b = B / 255;

		double w = Math.max(Math.max(r, g), b);

		double c = (w - r) / w;
		double m = (w - g) / w;
		double y = (w - b) / w;
		double k = 1 - w;

		System.out.println("c = " + c);
		System.out.println("m = " + m);
		System.out.println("y = " + y);
		System.out.println("k = " + k);
	}
}