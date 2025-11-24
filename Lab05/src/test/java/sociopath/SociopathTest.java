package sociopath;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/**
 * Unit test for Sociopath.java
 */
public class SociopathTest extends TestCase {
    // Group size: 2
    // `likeList`: [[1, 2]]
    // Expected output: 2
    public void testCase1_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 2;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        assertTrue(sc.findTheSociopath(groupSize, likeList) == 2);
    }

    // Group size: 3
    // `likeList`: [[1, 2]]
    // Expected output: -1
    public void testCase2_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 3;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        assertTrue(sc.findTheSociopath(groupSize, likeList) == -1);    
    }

    // Group size: 3
    // `likeList`: [[1, 2], [1, 3], [2, 3]]
    // Expected output: 3
    public void testCase3_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 3;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        likeList.add(new int[]{1, 3});
        likeList.add(new int[]{2, 3});
        assertTrue(sc.findTheSociopath(groupSize, likeList) == 3);    
    }

    // Group size: 3
    // `likeList`: [[1, 2], [2, 3], [3, 1]]
    // Expected output: -1
    public void testCase4_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 3;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        likeList.add(new int[]{2, 3});
        likeList.add(new int[]{3, 1});
        assertTrue(sc.findTheSociopath(groupSize, likeList) == -1);
    }

    // Group size: 0
    // `likeList`: [[1, 2]]
    // Expected output: -1
    public void testCase5_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 0;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        assertTrue(sc.findTheSociopath(groupSize, likeList) == -1);    
    }

    // Group size: 3
    // `likeList`: [[1, 0]]
    // Expected output: -1
    public void testCase6_testSociopath(){
        Sociopath sc = new Sociopath();
        int groupSize = 3;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 0});
        assertTrue(sc.findTheSociopath(groupSize, likeList) == -1);  
    }

}
