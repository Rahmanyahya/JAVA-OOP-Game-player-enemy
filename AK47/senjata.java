package AK47;

import java.util.concurrent.TimeUnit;

class senjata {
  String namaSenjata;
  int jumlahpeluru;

  void tembak() {
    if (jumlahpeluru <= 0) {
      System.out.println("peluru kosong.....");
      reload();
    } else {
      System.out.println("menembak peluru.....");
      jumlahpeluru--;
      System.out.println("Peluru : " + jumlahpeluru);
    }
  }

  void reload() {
    System.out.println("reloading....");

    try {

      TimeUnit.SECONDS.sleep(2);
      jumlahpeluru = 30;
      System.out.println("Senjata siap di gunakan lagi");
      System.out.println("Peluru : " + jumlahpeluru);
    } catch (InterruptedException e) {

      Thread.currentThread().interrupt();

    }
  }

}
