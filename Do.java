import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(1, DescendingOrder.sortDesc(1));
    }

    @Test
    public void test_03() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_04() {
        assertEquals(2110, DescendingOrder.sortDesc(1021));
    }

    @Test
    public void test_05() {
        assertEquals(987654321, DescendingOrder.sortDesc(123495678));
    }
}

public class DescendingOrder {
  public static int sortDesc(final int num) {
    
    String conver = ""+num;

    String[] por = conver.split("");
    int con = 0;
    conver = "";
    
    boolean orden = false;
    while(!orden){
      orden = true;
      for(int i = 0; i < por.length-1 ; i++){
        if(Integer.parseInt(por[i]) > Integer.parseInt(por[i+1])){
          String temp = por[i];
          por[i] = por[i+1];
          por[i+1] = temp;
          orden = false;
        }
      }
    }
    
    
    for(int i = por.length-1; i >= 0; i--){
      conver += por[i];
    }
    
    return con = Integer.parseInt(conver);
  }
}
