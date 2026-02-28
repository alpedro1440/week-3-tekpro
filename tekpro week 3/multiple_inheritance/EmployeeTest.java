public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // --- Instruksi A: Menguji metode compare ---
        System.out.println("Hasil perbandingan gaji staff[0] dan staff[1]: " 
                           + staff[0].compare(staff[1])); 
        // Hasilnya pasti -1 karena gaji Antonio < Maria

        // Kita juga bisa menguji fungsi shell_sort yang ada di Sortable
        System.out.println("\nSebelum diurutkan:");
        for (int i = 0; i < 3; i++) staff[i].print();

        Sortable.shell_sort(staff);

        System.out.println("\nSetelah diurutkan berdasarkan gaji (shell_sort):");
        for (int i = 0; i < 3; i++) staff[i].print();
    }
}