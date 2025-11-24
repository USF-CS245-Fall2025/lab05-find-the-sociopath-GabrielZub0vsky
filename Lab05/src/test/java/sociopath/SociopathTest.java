package sociopath;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for `Sociopath.java` using JUnit 5
 */
public class SociopathTest {
    // Group size: 2
    // `likeList`: [[1, 2]]
    // Expected output: 2
    @Test
    public void testCase1_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 2;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        assertEquals(2, sc.findTheSociopath(groupSize, likeList));
    }

    // Group size: 3
    // `likeList`: [[1, 2]]
    // Expected output: -1
    @Test
    public void testCase2_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 3;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        assertEquals(-1, sc.findTheSociopath(groupSize, likeList));    
    }

    // Group size: 3
    // `likeList`: [[1, 2], [1, 3], [2, 3]]
    // Expected output: 3
    @Test
    public void testCase3_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 3;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        likeList.add(new int[]{1, 3});
        likeList.add(new int[]{2, 3});
        assertEquals(3, sc.findTheSociopath(groupSize, likeList));    
    }

    // Group size: 3
    // `likeList`: [[1, 2], [2, 3], [3, 1]]
    // Expected output: -1
    @Test
    public void testCase4_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 3;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        likeList.add(new int[]{2, 3});
        likeList.add(new int[]{3, 1});
        assertEquals(-1, sc.findTheSociopath(groupSize, likeList));
    }

    // Group size: 0
    // `likeList`: [[1, 2]]
    // Expected output: -1
    @Test
    public void testCase5_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 0;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        assertEquals(-1, sc.findTheSociopath(groupSize, likeList));    
    }

    // Group size: 3
    // `likeList`: [[1, 0]]
    // Expected output: -1
    @Test
    public void testCase6_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 3;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 0});
        assertEquals(-1, sc.findTheSociopath(groupSize, likeList));  
    }

    // Group size: 4
    // `likeList`: [[1, 2], [2, 3], [3, 4], [4, 1]]
    // Expected output: -1
    @Test
    public void testCase7_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 4;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        likeList.add(new int[]{2, 3});
        likeList.add(new int[]{3, 4});
        likeList.add(new int[]{4, 1});
        assertEquals(-1, sc.findTheSociopath(groupSize, likeList));
    }

    // Group size: 4
    // `likeList`: [[1, 2], [1, 3], [1, 4], [2, 1], [2, 3], [2, 4], [3, 1], [3, 2], [3, 4]]
    // Expected output: 4
    @Test
    public void testCase8_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 4;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        likeList.add(new int[]{1, 3});
        likeList.add(new int[]{1, 4});
        likeList.add(new int[]{2, 1});
        likeList.add(new int[]{2, 3});
        likeList.add(new int[]{2, 4});
        likeList.add(new int[]{3, 1});
        likeList.add(new int[]{3, 2});
        likeList.add(new int[]{3, 4});
        assertEquals(4, sc.findTheSociopath(groupSize, likeList));
    }
}
