public class Granary {
	public static void main(String[] args) {
		final double PI = 3.14;
		int diameter = 10;
		int height = 3;
		double volume = diameter/2 * diameter/2 * PI * height;
		System.out.println("�����ֵ���� = " + volume + "������");
		int weight = 750;
		System.out.println("������һ���ɴ���" + weight * volume + "ǧ����ʳ");
	}
}
