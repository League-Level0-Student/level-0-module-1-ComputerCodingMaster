String A = "Take one down and pass it around,";
String pee = " bottle";
String B = " of beer on the wall.";
String C = " of beer.";
String D = "no more ";
int num=1;

void setup() {
  for (int i= 99; i>1; i--) {  

    System.out.println(i+pee+"s"+B );
    System.out.println(i+pee+"s"+C);
    System.out.println(A);
    System.out.println(i-1);
    if (i==2) {
      System.out.println(pee+B);
      System.out.println( );
    } else {
      System.out.println(pee+"s"+B);
      System.out.println( );
    }
  }
    System.out.println(num+pee+B);
    System.out.println(num+pee+C);
    System.out.println(A);
    System.out.println(D+pee+"s"+B);

}

void draw() {
}
