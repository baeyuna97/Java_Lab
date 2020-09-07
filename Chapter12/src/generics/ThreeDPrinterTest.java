package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// powder형으로 클래스 생성 
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		System.out.println(printer);
		
		ThreeDPrinter<Plastic> printer = new ThreeDPrinter<Plastic>();
		
		printer.setMaterial(new Plastic());
		Powder plastic = printer.getMaterial();
		System.out.println(printer);
	}

}
