package IceBreakers;

public class StockPrice {
	int[] stock = new int[] {};
	StockPrice(int[] stock) {
		this.stock = stock;
	}
	
	void compute() {
		int max = 0;
		for(int i=0;i<stock.length;i++) {
			for(int j=i+1;j<stock.length;j++) {
				if(stock[i] < stock[j]) {
					max = Integer.max(stock[j]-stock[i], max);
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StockPrice s1 = new StockPrice(new int[]{7, 1, 5, 3, 6, 4});
		s1.compute();
		StockPrice s2 = new StockPrice(new int[]{7, 6, 4, 3, 1});
		s2.compute();
		StockPrice s3 = new StockPrice(new int[]{1, 1, 1, 1, 1});
		s3.compute();
		StockPrice s4 = new StockPrice(new int[]{});
		s4.compute();
		StockPrice s5 = new StockPrice(new int[]{0, 0, 0});
		s5.compute();
	}

}
