package Test;

public class Test01 {

	public static void main(String[] args) {
				double wait = 0;
				double o = 0;
				int person =0;
				int p = (int) (Math.random() * (30-10+1) + 10);
				for (double t=0; t < 60; t++) {
					if (person == p) {
						t=61;
                        //종료
					} else {
						int personTime = (int) (Math.random() * (4 - 2 + 1) + 2);
						int makeTime = (int) (Math.random() * (4 - 2 + 1) + 2);

						t = t + personTime; // 2 //7
						o = t + makeTime; // 3 //9
						wait = wait + (o-t); // 5-3 =2
						person = person + 1;
					}
				}
				System.out.println(p+"명");
				System.out.println((int)wait+"분");
			}

		}



