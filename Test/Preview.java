package Test;

public class Preview {

	public static void main(String[] args) {
		double wait = 0;
		double o = 0;
		double d = 0;
		int person =0;
		//int p = (int) (Math.random() * (30-10+1) + 10);
		for (double t=0; t < 60; t++) {
			if (person == 2) {
				t=61;
                //종료
			} else {
				int personTime[] = {2, 2, 3};
				int makeTime[] = {3, 4, 3};

				t = t + personTime[person]; //2 //4
				o = t + makeTime[person]; //2+3 =5 //4+4=8
				d = t + personTime[person+1]; //2+2 =4 //4+2=6
				wait = wait + (o-d); //5-4=1 //1+(8-6) =3
				person = person + 1;
			}
		}
		//System.out.println(p+"명");
		System.out.println((int)wait+"분");
	}

}