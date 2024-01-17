package AK47;

import java.util.Scanner;

public class mainSenjata {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    senjata Tembak = new senjata();
    Boolean kondisi = true;

    
   loop1 : while (kondisi) {
      System.out.print("masukan nama senjata anda : ");
      Tembak.namaSenjata = input.next();
      Tembak.reload();

      loop2: while (true) {
        if (Tembak.jumlahpeluru < 30) {
          System.out.println("\n1. TEMBAK\n2. RELOAD\n3. GANTI SENJATA\n4.Akhiri sesi");
          System.out.print("PILIHAN : ");
          int pilihan = input.nextInt();

          if (pilihan == 1)
            Tembak.tembak();
          ;

          if (pilihan == 2)
            Tembak.reload();
          ;

          if (pilihan == 3)
            continue loop1;

          if (pilihan == 4) System.exit(0);

            if (pilihan > 4 || pilihan < 1) {
              System.out.println("anda harus memasukan angka pada menu");
              continue loop2;
            }
          } else {
           loop3: while (true) {
             System.out.println("\n1. TEMBAK\n2. GANTI SENJATA\n3.Akhiri sesi");
             System.out.print("Pilihan : ");
             int pilihan = input.nextInt();

             if (pilihan == 1) {
               Tembak.tembak();
               continue loop2;
             }
             
             if (pilihan == 2)
               continue loop2;

             if (pilihan == 3)
               System.exit(0);

             if (pilihan > 3 || pilihan < 1) {
               System.out.println("anda hars memasukan angka pada menu");
               continue loop3;
             }
           }
        }
      }
    }
    
    
     
  }
}
