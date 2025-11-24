package sociopath;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Gabriel Zubovsky
 * purpose: finds the sociopath in a web of people given pairs of who likes who
 */
public class Sociopath {
	public int findTheSociopath (int groupSize, List<int[]> likeList) {	
		if(groupSize <= 0 || likeList == null || likeList.isEmpty()){
			return -1;
		}
		
		for(int[] pair : likeList){
			if(pair.length != 2){
				return -1;
			}

			int a = pair[0];
			int b = pair[1];
			if((0 < a && a > groupSize) || (0 < b && b > groupSize)){
				return -1;
			}
		}
		
		int[] numIncoming = new int[groupSize];
		int[] numOutgoing = new int[groupSize];
		ListIterator<int[]> iter = likeList.listIterator();

		while(iter.hasNext()){
			int[] current = iter.next();
			if(current.length == 2){
				int a = current[0];
				int b = current[1];
				if((0 < a && a <= groupSize) && (0 < b && b <= groupSize)){
					numOutgoing[a-1]++;
					numIncoming[b-1]++;
				}
			}
		}

		for(int i = 0; i < groupSize; i++){
			if(numOutgoing[i] == 0 && numIncoming[i] == groupSize-1){
				return i+1;
			}
		}
		return -1;
	}
}
