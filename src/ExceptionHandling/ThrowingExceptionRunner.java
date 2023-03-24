package ExceptionHandling;

class Amount{
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws Exception{//CurrenciesDoNotMatchException는 Exception을 상속받는 자식메서드이므로 가능하다.
        if (!this.currency.equals(that.currency)) {
            //throw new Exception("Currencies Don't Match  [ "+this.currency+" is not same "+that.currency+" ]");
            throw new CurrenciesDoNotMatchException("Currencies Don't Match");
        }
        this.amount = this.amount + that.amount;
    }
    public String toString(){
        return amount + " " + currency;
    }
}
class CurrenciesDoNotMatchException extends Exception{  //만일 RuntimeException을 상속받는다면 다른 메서드에 throws를 안해줘도된다.
    public CurrenciesDoNotMatchException(String mes){
        super(mes);
    }
}
public class ThrowingExceptionRunner {
    public static void main(String[] args) throws Exception{
        Amount amount1 = new Amount("USD",10);
        Amount amount2 = new Amount("EUR",20);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}
