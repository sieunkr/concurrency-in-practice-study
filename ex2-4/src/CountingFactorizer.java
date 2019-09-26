import java.util.concurrent.atomic.AtomicLong;

public class CountingFactorizer implements Servlet {

    //AtomicLong 객체를 이용해 요청 횟수를 세는 서블릿

    private final AtomicLong count = new AtomicLong(0);

    public long getCount(){
        return count.get();
    }

    public void service(){

        //생략..

        count.incrementAndGet();
    }
}
