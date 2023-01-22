package instance_of_operatoru;

public class MainInstanceOf {

	public static void main(String[] args) {

		Car c = new BMW();
		
		if(c instanceof Mercedes) {
			Mercedes m=(Mercedes)c;     
			m.MercedesGo();
		}
		
		if(c instanceof BMW) {
			BMW b=(BMW)c;     
			b.BMWGo();
		}
		if(c instanceof Audi) {
			Audi a=(Audi)c;     
			a.AudiGo();
		}
		if(c instanceof Chevrolet) {
			Chevrolet ch=(Chevrolet)c;     
			ch.ChevroletGo();
		}
		if(c instanceof Ford) {
			Ford f=(Ford)c;     
			f.FordGo();
		}
		
		}

}
