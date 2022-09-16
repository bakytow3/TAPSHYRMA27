public class Main {
    public static void main(String[] args) {
UnaryOperator unaryOperator=new UnaryOperator() {
    @Override
    public void sqrt() {
        double x =9 ;
        double y = Math.sqrt(x);
        System.out.print(y);
    }
};
unaryOperator.sqrt();
    }
}
interface UnaryOperator{
   void sqrt();
}