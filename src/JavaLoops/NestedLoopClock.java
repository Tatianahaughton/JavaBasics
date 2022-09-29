package JavaLoops;

public class NestedLoopClock {

	public static void main(String[] args) {
		//
		
		for(int i=0; i<=23; i++) {
			for(int a=0; a<=59; a++) {
				if (i<10 && a<10) {
					System.out.println("0"+i+ ":"+a);
					
				} else if (i<10 && a>=10) {
					System.out.println("0"+i+":"+a);
				}else if (i>=10 && a<10) {
					System.out.println(i+":"+ "0" +a);
				}else {
					System.out.println(i+":" +a);
				}
			}
		
			System.out.println("-----------------------------");
		
	                    }
		}
		
		}

	


