package drone;

public class drone {
  int energi;
  int ketinggian;
  int kecepatan;
  String merek;

  // method
  void terbang() {
    energi--;
    if (energi > 10) {
      // terbang berarti nilai ketinggian bertambah
      ketinggian++;
      System.out.println("Drone terbang...");
      System.out.println("Energi : " + energi + " || Ketinggian : " + ketinggian + "m || KECEPATAN : " + kecepatan );
    } else {
      System.out.println("Energi lemah: Drone nggak bisa terbang");
    }
  }

  void matikanMesin() {
    if (ketinggian > 0) {
      System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
    } else {
      System.out.println("Mesin dimatikan...");
    }
  }

  void turun() {
    // ketinggian berkurang, karena turun
    ketinggian--;
    energi--;
    System.out.println("Drone turun");
    System.out.println("Energi : " + energi + " || Ketinggian : " + ketinggian + "m || KECEPATAN : " + kecepatan);
  }

  void belokKanan() {
    energi--;
    System.out.println("Drone belok Kanan");
    System.out.println("Energi : " + energi + " || Ketinggian : " + ketinggian + "m || KECEPATAN : " + kecepatan);
    
  }

  void belokKiri() {
    energi--;
    System.out.println("Drone belok Kiri");
    System.out.println("Energi : " + energi + " || Ketinggian : " + ketinggian + "m || KECEPATAN : " + kecepatan);
  }

  void maju() {
    energi--;
    System.out.println("Drone maju ke depan");
    kecepatan++;
    System.out.println("Energi : " + energi + " || Ketinggian : " + ketinggian + "m || KECEPATAN : " + kecepatan);
  }

  void mundur() {
    energi--;
    System.out.println("Drone mundur");
    System.out.println("Energi : " + energi + " || Ketinggian : " + ketinggian + "m || KECEPATAN : " + kecepatan);
  }
}
