package IceBreakers;

public class FindShortestPath {
	
	public static void shortPath(String[] str, String s1, String s2) {
		int p1=-1, p2=-1;
		int min= Integer.MAX_VALUE;
		for(int i=0;i<str.length;i++) {
			if(s1.equals(str[i])) {
				p1 = i;
			}
			if(s2.equals(str[i])) {
				p2=i;
			}
			
			if(p1!=-1 && p2 !=-1) {
				min = Math.min(min, Math.abs(p1-p2));
			}
		}
		if(p1 == -1 || p2 == -1) {
			min = -1;
		}
		System.out.println("dist between " + s1 + " and " + s2 + " = " + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[] {"eat", "cat", "mat", "cat", "rat", "rat", "eat", "take", 
				                     "mat"};
		
		shortPath(str, "cat", "take");
		shortPath(str, "cat", "take123");
		shortPath(str, "cat", "eat");
	}
		
}
