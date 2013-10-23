
public class AmicableNumbers {
	private int upperbound;
public AmicableNumbers(int ub){
	upperbound=ub;
}

	public int proferdivisoradd(int a){
		int sum=0;
		for(int i=1;i<a;i++){
			if(a%i==0)
				sum+=i;
		}
		return sum;
	}
	public boolean amicableNumber(int a){
		int c=proferdivisoradd(a);
		int d=proferdivisoradd(c);
		
		if(a==d && a!=c)
			return true;
		else return false;
	}
	public String Amicable(){
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<upperbound;i++){
			if(amicableNumber(i)){
				int c=proferdivisoradd(i);
				sb.append("(");
				sb.append(i);
				sb.append(",");
				sb.append(c);
				sb.append(")");
				sb.append(",");
			}
		}
		return sb.toString();
	}
}
