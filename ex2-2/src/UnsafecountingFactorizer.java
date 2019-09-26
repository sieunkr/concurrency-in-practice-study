import com.sun.xml.internal.ws.resources.WsservletMessages;

import java.math.BigInteger;

public class UnsafecountingFactorizer implements Servlet{

    //동기화 구문 없이 요청 횟수를 세는 서블릿, 잘못된 코드
    private long count = 0;

    public void Service(ServletRequest req, ServletResponse resp){
        //생략
        count++;
    }
}
