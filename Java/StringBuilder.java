

public class StringBuilder {

    public StringBuilder(String tony) {
    }
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("tony");
     //Insert char
     sb.insert(0, 'S');
     System.out.println(sb);
   }

    private void insert(int i, char c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
