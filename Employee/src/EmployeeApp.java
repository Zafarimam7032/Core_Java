import java.util.Scanner;

public class EmployeeApp {
	Scanner s = new Scanner(System.in);

	void sizeDeclaration(int n, Employee emp) {
		int[] idArray = new int[n];
		String[] name = new String[n];
		Double[] salary = new Double[n];
		String[] city = new String[n];
		insert(n, idArray, name, salary, city, emp);
	}

	void insert(int n, int[] idArray, String[] name, Double[] salary, String[] city, Employee emp) {
		System.out.println("Enter Employees Detail");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter employee detail " + (i + 1));
			System.out.println("Enter employee id");
			emp.setId(s.nextInt());
			s.nextLine();
			System.out.println("Enter employee name");
			emp.setName(s.nextLine());
			System.out.println("Enter employee salary");
			emp.setSalary(s.nextDouble());
			s.nextLine();
			System.out.println("Enter employee city");
			emp.setCity(s.nextLine());
			idArray[i] = emp.getId();
			name[i] = emp.getName();
			salary[i] = emp.getSalary();
			city[i] = emp.getCity();

		}
		System.out.println("If you want to dispaly data press 1 otherwise press any number");
		int yes = s.nextInt();
		if (yes == 1) {
			display(n, idArray, name, salary, city);
		} else {
			System.exit(0);
		}
	}

	void display(int n, int[] idArray, String[] name, Double[] salary, String[] city) {
		System.out.println("Enter for which loop you want to display data");
		System.out.println("1 for (for Loop) 2 for (while loop) 3 for (do while loop) ");
		int y = s.nextInt();
		switch (y) {
		case 1:
			System.out.println("Employee data displaying by using for loop");
			for (int j = 0; j < n; j++) {
				int l = j + 1;
				System.out.print("Employee Detail " + l);

				System.out.println("id:" + idArray[j]);
				System.out.println("name:" + name[j]);
				System.out.println("city:" + city[j]);
				System.out.println("salary:" + salary[j]);
			}
			break;
		case 2:
			System.out.println("Employee data displaying by using while loop");
			int m = 0;
			while (m < n) {
				int l = m + 1;
				System.out.print("Employee Detail " + l);

				System.out.println("id:" + idArray[m]);
				System.out.println("name:" + name[m]);
				System.out.println("city:" + city[m]);
				System.out.println("salary:" + salary[m]);
				m++;
			}

			break;
		case 3:
			System.out.println("Employee data displaying by using do while loop");
			int z = 0;
			do {
				int l = z + 1;
				System.out.print(" student " + l + " details");

				System.out.println("id:" + idArray[z]);
				System.out.println("name:" + name[z]);
				System.out.println("city:" + city[z]);
				System.out.println("salary:" + salary[z]);
				z++;
			} while (z < n);
			break;
		default:
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee emp = new Employee();
		EmployeeApp empApp = new EmployeeApp();
		System.out.print("Enter how many employee data want to insert?");
		int n = in.nextInt();
		in.nextLine();
		empApp.sizeDeclaration(n, emp);

	}

}