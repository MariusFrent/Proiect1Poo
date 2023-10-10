import java.util.Scanner;
import java.util.ArrayList;
public class AppMobila {
	public static void main (String args[]) {
		int k = 1;
		Scanner sc = new Scanner(System.in);
		ArrayList<LivrareMobila> arr = new ArrayList<LivrareMobila>();
		while (k == 1) {
			System.out.println("Alegeti dintre urmatoarele optiuni :\n");
			System.out.println("1.Introducere date clienti\n");
			System.out.println("2.Afisare pret total comenzi\n");
			System.out.println("3.Afisare informatii clienti\n");
			System.out.println("4.Iesire meniu\n");
			int o = sc.nextInt();

			String nume,prenume,tip,adr;
			int nr,pret;

			if (o == 1) {
				System.out.println("Introduceti numarul de clienti pe care vreti sa ii adaugati: ");
				int n = sc.nextInt();
				for (int i=0;i<n;i++) {
					System.out.println("Introduceti datele clientului:");
					System.out.println("Nume:");
					nume = sc.next();
					System.out.println("Preume:");
					prenume = sc.next();
					nr = i + 1;
					System.out.println("Tipul de mobila cumparata:");
					tip = sc.next();
					System.out.println("Adresa:");
					adr = sc.next();
					System.out.println("Pret comanda:");
					pret = sc.nextInt();
					arr.add(new LivrareMobila(nume,prenume,nr,tip,adr,pret));
				}
			}
			
			if (o == 2) {
				int total = 0;
				for (LivrareMobila lm: arr) {
					total+=lm.getPretMobila();
				}
				System.out.println("Pretul total este: " + total);
			}

			if (o == 3) {
				for (LivrareMobila lm: arr) {
					System.out.println(lm.toString() + "\n\n");
				}
			}

			if (o == 4) {	
				k = 0;
			}

			if (o > 4 || o < 1) {
				System.out.println("Optiune neexistenta");
			}

		}
		sc.close();
	}
}