import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class TestListExamples {
  // Write your grading tests here!

    



    @Test
    public void test1(){
      List<String> test_list1 = new ArrayList<String>();
      test_list1.add("iMac");
      test_list1.add("iPod");
      test_list1.add("iPhone");
      test_list1.add("iPad");
      test_list1.add("iCloud");
      test_list1.add("iMovie");
      String[] expected = {"iMac", "iPod","iPhone","iPad","iCloud","iMovie"};
      assertArrayEquals(expected, test_list1.toArray());
    
    }


    @Test
    public void test2(){
      List<String> test_list1 = new ArrayList<String>();
      test_list1.add("iMac");
      test_list1.add("iPod");
      test_list1.add("iPhone");
      test_list1.add("iPad");
      test_list1.add("iCloud");
      test_list1.add("iMovie");
      test_list1.remove("iMovie");
      String[] expected = {"iMac", "iPod","iPhone","iPad","iCloud"};
      assertArrayEquals(expected, test_list1.toArray());
    
    }

    @Test
  public void testMerge3() {
    List<String> test_list1 = Arrays.asList("Kevin", "Sunan", "Xu");
    List<String> test_list2 = Arrays.asList("Sunan");
    List<String> output = Arrays.asList("Kevin", "Sunan", "Sunan", "Xu");
    assertEquals(output, ListExamples.merge(test_list1, test_list2));
  }
  
    



}
