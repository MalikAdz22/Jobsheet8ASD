import java.util.Scanner;

public class StackMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(5);
        char pilih;
        do {
            System.out.println("================");
            System.out.println("  PILIHAN MENU  ");
            System.out.println("================");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. GetMax");
            System.out.println("================");
            int pilihan;
            System.out.print("Pilih Menu (1-4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                do {
                    System.out.print ("Jenis: ");
                    String jenis = sc.next();
                    System.out.print ("Warna: ");
                    String warna = sc.next();
                    System.out.print ("Merk: ");
                    String merk = sc.next();
                    System.out.print ("Ukuran: ");
                    String ukuran = sc.next();
                    System.out.print ("Harga: ");
                    double harga = sc.nextDouble();


                    Pakaian17 p = new Pakaian17 (jenis, warna, merk, ukuran, harga);
                    System.out.print ("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");

                    pilih = sc.next().charAt(0);
                    sc.nextLine();
                    stk.push(p);
                } while (pilih == 'y');
                break;

                case 2:
                    stk.pop();
                    break;
            
                case 3:
                    stk.peek();
                    break;

                case 4:
                    stk.print();
                    break;
                
                case 5:
                    stk.getMax();
                    break;

                default:
                    System.out.println("Inputan salah");
                    break;
            } if (pilihan == 5) {
            pilih ='t';
        } else {
            System.out.print("Kembali ke menu Utama (y/t) ");
            pilih = sc.next().charAt(0);
        }
    } while (pilih =='y');
}
}