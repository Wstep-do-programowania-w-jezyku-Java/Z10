import java.util.ArrayList;
import java.util.List;

public class LudziePrinter {

	public static void main(String[] args) {
		List<Czlowiek> ludzie =new ArrayList<>();
		ludzie.add(new Czlowiek("Jan", "kochanowski", "Czarnolas"));
		ludzie.add(new Czlowiek("Mikołaj", "Rej", "Nagłowice"));
		ludzie.add(new Czlowiek("Maria", "Konopnicka", "Warszawa"));
		ludzie.add(new Czlowiek("Jan", "Matejko", "Kraków"));
		ludzie.add(new Czlowiek("Jan", "Nowak", "Katowice"));
		ludzie.add(new Czlowiek("Maciej", "Kopytko", "Łódź"));
		ludzie.add(new Czlowiek("Zofia", "Kossak", "Warszawa"));
		
		Printer p=new Printer(ludzie);
//		p.print(new Filtr() {
//			
//			@Override
//			public boolean accept(Czlowiek c) {
//				return c.getImie().equals("Jan");
//			}
//		});
//		p.print(c->{return c.getImie().equals("Jan");});
		p.print(c->{return c.getImie().contains("J") && c.getMiasto().contains("K");});
	}

}

class Printer{
	private List<Czlowiek> ludzie;

	public Printer(List<Czlowiek> ludzie) {
		super();
		this.ludzie = ludzie;
	}
	
	public void print(Filtr f) {
		for(Czlowiek c: ludzie)
			if(f.accept(c))
				System.out.println(c);
	}
}

interface Filtr{
	boolean accept(Czlowiek c);
}

class Czlowiek{
	private String imie,nazw,miasto;

	public Czlowiek(String imie, String nazw, String miasto) {
		super();
		this.imie = imie;
		this.nazw = nazw;
		this.miasto = miasto;
	}

	public String getImie() {
		return imie;
	}

	public String getNazw() {
		return nazw;
	}

	public String getMiasto() {
		return miasto;
	}
	
	@Override
	public String toString() {
		return imie+" "+nazw+" "+miasto;
	}
}
