import java.util.ArrayList;

public class main {
	private ArrayList<Persoon> lijst;
	
	public main() {
		lijst = new ArrayList<>(); 
	}
	
	public ArrayList<Persoon> getSLBStudenten(Docent SLBer) {
		ArrayList<Persoon> studenten = new ArrayList<Persoon>();
		for(Persoon p: this.lijst) {
			if(SLBer == p.getSLBer()) {
				studenten.add(p);
			}
		}
		return 	studenten;	
	}
	
	public static void main(String[] args) {
		main p = new main();
		Docent piet=new Docent("Piet","Jansen","jnsnp");
		Student marie=new Student("Marie","Pieters",31415,piet);
         Student jan=new Student("Jan","de Vries",92653,null); // nog geen SLB’er
         p.lijst.add(piet);
         p.lijst.add(marie);
         p.lijst.add(jan);
        // voeg zelf nog enkele docenten en studenten toe
         ArrayList<Persoon> studentenVanPiet=p.getSLBStudenten(piet);
         System.out.println(studentenVanPiet);
	
	}
}

