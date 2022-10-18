package builder;

public class builder {
   int a  ;
   String b ;
   String c;
public int getA() {
	return a;
}
public builder setA(int a) {
	this.a = a;
	return this;
}
public String getB() {
	return b;
}
public builder setB(String b) {
	this.b = b;
	return this;
}
public String getC() {
	return c;
}


@Override
public String toString() {
	return "builder [a=" + a + ", b=" + b + ", c=" + c + "]";
}
public build2 setC(String c) {
	this.c = c;
	return new build2();
}
public static void main(String[] args) {
	builder build =  new builder();
	build.setA(1).setB("ffg").setC("name").printObj(build);
}
}
