public  class Pizza {
	int size; //Size could be 1, 2, or 3, for small/medium/large
	int toppings; //Number of toppings
	int drinkNum; //number of drinks
	int drinkSize; //size of drinks
	
	public Pizza(int s, int t, int dn, int ds) {
		size = s;
		toppings = t;
		drinkNum = dn;
		drinkSize = ds;
	}
	
	public int calcCost() {
		return size*toppings*drinkNum*drinkSize;
	}
	
	public Pizza orderPizza() {
		int si, to, drn, drs;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter pizza size");
		si = sc.nextInt():
		System.out.println("Please enter number of toppings");
		to = sc.nextInt();
		System.out.println("Please enter number of drinks");
		drn = sc.nextInt();
		System.out.println("Please enter drink size");
		drs - sc.nextInt();
		return new Pizza(si, to, drn, drs);
	}