package rpc;
public class Matlab {
  private int i;

  public Matlab(int i) {
    this.i = i;
  }

  public Result calcul(int in) {
    return new Result(in * this.i);
  }

  public static void main(String [] arg) throws Exception {
    Matlab m = null;
    java.net.ServerSocket sos = new java.net.ServerSocket(1234);
    java.net.Socket s = sos.accept();

    java.io.DataInputStream dis = new java.io.DataInputStream(s.getInputStream());
    java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(s.getOutputStream());

    String fonction = dis.readUTF();
    if (fonction.equals("constructeur")) {
      m = new Matlab(dis.readInt());
    }

    fonction = dis.readUTF();
    if (fonction.equals("calcul")) {
      oos.writeObject(m.calcul(dis.readInt()));
    }
  }

}
